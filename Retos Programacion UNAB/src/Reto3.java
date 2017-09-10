
/*
 * Leer números repetidamente, por cada número leído imprimir la raíz cuadrada del número, si no tiene raíz cuadrada 
 * imprimir que no tiene. Terminar el programa al leer 0. 
 * 
 * Ej.
 * 4: La raíz es 2.
 * 81: La raíz es 9.
 * -4: No tiene raíz.
 * 0: Termina el programa.
 * 
 */

import java.util.Scanner;

public class Reto3 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double numero;

		System.out.print("Ingrese un número: ");
		numero = leer.nextDouble();
		while (numero != 0) {
			if (numero < 0) {
				System.out.printf("%f,%s%n%n", numero, ": No tiene raiz");
			} else {
				System.out.printf("%f%s%f%n%n", numero, ": La raiz es: ", Math.sqrt(numero));
			}

			System.out.print("Ingrese un número: ");
			numero = leer.nextDouble();
		}
		leer.close();

		System.out.println("\n*** FIN ***");
	}
}
