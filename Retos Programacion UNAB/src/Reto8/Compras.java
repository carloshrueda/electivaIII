package Reto8;

import java.util.Scanner;

public class Compras {
	public static void main(String[] args) {
		CarritoCompras carrito = new CarritoCompras();
		String opcion = "";
		Scanner leer = new Scanner(System.in);
		int f;
		TipoFruta fruta;
		int[] vcantidades;

		System.out.println("*** COMPRAS ***");
		System.out.println("\n\nIngrese las compras. Digite la letra N para terminar\n");
		do {
			// Leer la fruta del usario
			do {
				System.out.print("\nIngrese la fruta (1: PAPAYA, 2: KIWI, 3: NARANJA, 4: MANGO, 5: BANANO): ");
				f = leer.nextInt();
				if ((f < 1) || (f > 5)) {
					System.out.println("--> Error. Dato inválido.\n");
				}
			} while ((f < 1) || (f > 5));

			fruta = TipoFruta.getFruta(f - 1);
			carrito.addFruta(fruta);

			System.out.print("\t==> Desea continuar (S/N)?: ");
			opcion = leer.next().toUpperCase();

		} while (!opcion.equals("N"));

		leer.close();

		System.out.println("\n\n---------- CALCULANDO VALORES ---------------------\n\n");
		vcantidades = carrito.getTipoFrutasCant();
		for (int i = 0; i < vcantidades.length; i++) {
			System.out.printf("%s%s%s%d%n", "Cantidad de ", TipoFruta.getFruta(i).name(), ": ", vcantidades[i]);
		}
		System.out.printf("%n%s%.3f%s%n",  "El peso del paquete es: ", carrito.getPesoTotal(), " gramos");
		System.out.printf("%s%.3f%n", "El total de calorias es: ", carrito.getCaloriasTotal());
		System.out.println("El total a pagar es de: $" + carrito.getPrecioTotal());

	}
}
