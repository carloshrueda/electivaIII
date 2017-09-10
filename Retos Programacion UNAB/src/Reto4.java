
/*
 * La empresa de energía Lucecita.inc quiere un sistema para procesar sus facturas. El programa debe recibir 100 
 * facturas con el valor del consumo mensual en kilovatios (en este caso es un número aleatorio entre 10 y 1000) y 
 * el estrato (número aleatorio entre 1 y 6). El valor de la factura se calcula de la siguiente forma:
 * 	- Si el consumo es menor que 50 se clasifica como hogar pequeño y debe pagar $1.000 por kilovatio
 * 	- Si el consumo está entre 51 y 700 se califica como hogar mediano y debe pagar $2000 por kilovatio
 * 	- Si el consumo está entre 701 y 1000 se califica como hogar derrochador o industria y debe pagar $2500 por 
 * 		kilovatio.
 * 	- Todos los pertenecientes al estrato 1 o 2 reciben un descuento del 15%
 * 	- Todos los pertenecientes al estrato 3 y 4 pagan la tarifa plena
 * 	- Todos los pertenecientes al estrato 5 y 6 pagan un impuesto de 5%
 * 
 * Al final la empresa solo quiere saber cuánto va a ganar por esas 100 facturas 
 * El programa debe tener ciclo para, ya que es el ciclo favorito del jefe
 *  
 */

import java.security.SecureRandom; // para generar los numero aleatorios

public class Reto4 {

	public static void main(String[] args) {
		SecureRandom aleatorio = new SecureRandom();
		int cantfact = 10;
		int i, estrato, kilovatios;
		int kvtsini = 10;
		int kvtsfin = 1000;
		int kvtsdif = kvtsfin - kvtsini + 1;
		int strtini = 1;
		int strtfin = 6;
		int strtdif = strtfin - strtini + 1;
		long consumo;
		double descuento;
		long pago, pagototal;

		pagototal = 0;
		aleatorio.setSeed(System.currentTimeMillis()); // inicializando el aleatorio
		for (i = 1; i <= cantfact; i++) {
			// genera un kilovatio aleatorio entre kvtsini y kvtsfin (10 - 1000)
			kilovatios = aleatorio.nextInt(kvtsdif) + kvtsini;
			estrato = aleatorio.nextInt(strtdif) + strtini;

			// Calculo del pago por el consumo (kilovatios)
			consumo = 0;
			if (kilovatios <= 50) {
				consumo = 1000 * kilovatios;
			} else if ((kilovatios > 50) && (kilovatios <= 700)) {
				consumo = 2000 * kilovatios;
			} else if ((kilovatios > 700) && (kilovatios <= 1000)) {
				consumo = 2000 * kilovatios;
			} else {
				consumo = 2000 * kilovatios;
			}

			// Calculo del pago por el estrato
			descuento = 0.0;
			if (estrato >= 5) {
				// estrato 5 y 6
				descuento = consumo * 0.05;
			} else if (estrato >= 3) {
				// estrato 3 y 4
				descuento = 0;
			} else {
				// estrato 1 y 2
				descuento = consumo * 0.15;
			}

			// pago de una factura
			pago = consumo - Math.round(descuento);
			// acumulador de los pagos de todas las facturas
			pagototal += pago;
			System.out.printf("%s%d%s%d%s%f%s%d%n", "Consumo: $", consumo, " - Estrato:", estrato,  " - Descuento: $", descuento, " - Pago: $", pago);
		}
		System.out.printf("%n%s%d%s%d%n", "El pago total de las ", cantfact, " facturas es: $", pagototal);

	}

}
