package Reto8_2;

import java.util.Scanner;

public class Compras {

    private static String capitalize(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        String opcion;
        Scanner leer = new Scanner(System.in);
        int f;

        opcion = "";
        System.out.println("*** COMPRAS ***");
        System.out.println("\n\nIngrese las compras. Digite la letra N para terminar\n");
        do {
            // Leer la fruta del usario
            do {
                System.out.print("\nIngrese la fruta (1: PAPAYA, 2: KIWI, 3: NARANJA, 4: MANGO, 5: BANANO): ");
                f = leer.nextInt();
                if ((f < 1) || (f > 5)) {
                    System.out.println("--> Error. Dato inv�lido.\n");
                }
            } while ((f < 1) || (f > 5));
            carrito.addFruta(Fruta.getFruta(f - 1));

            System.out.print("\t==> Desea continuar (S/N)?: ");
            opcion = leer.next().toUpperCase();
        } while (!opcion.equals("N"));

        leer.close();

        System.out.println("\n\n---------- CALCULANDO VALORES ---------------------\n\n");
        for (TipoFruta tpf : TipoFruta.values()) {
            System.out.printf("%s%s%s%d%n", "Cantidad de ", capitalize(tpf.toString()), ": ", carrito.getCantidadTipoFrutas(tpf));
        }
        System.out.printf("%n%s%.3f%s%n", "El peso del paquete es: ", carrito.getPesoTotal(), " gramos");
        System.out.printf("%s%.3f%n", "El total de calorias es: ", carrito.getCaloriasTotal());
        System.out.println("El total a pagar es de: $" + carrito.getPrecioTotal());

    }
}
