/*
 * UDI - Ingeniería de Sistemas - Electiva 3 - Parcial 1 - Ejercicio 1
 * El supermercado menos por mas esta de aniversario y desea dar un descuento a 
 * sus clientes en las tres compras más costosas que realicen. A la primera más 
 * costosa un descuento de 30%, segunda de 20% y a la tercera de 10%. Imprimir 
 * la relación de la productos con sus precios sin descuento, luego el subtotal, 
 * después el valor total de los descuentos, seguido del valor del iva (20%) del 
 * subtotal menos descuentos y el valor total correspondiente al subtotal, menos 
 * los descuentos, mas el iva.
 * 
 * Resolución con vectores - version 3 (ArrayList)
 */
package carloshrueda.parcial1;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author carloshrueda@gmail.com
 */
public class Ejercicio2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cant, i;
        long precio, subtotal, descuento, iva, total;

        //Ingresar valores
        Scanner scn = new Scanner(System.in);
        System.out.print("(ejercicio 2_1) Cuantos articulos son?: ");
        cant = scn.nextInt();
        while (cant < 1) {
            System.out.println("Error. Cantidad de artículos inválida. (n>0)");
            System.out.println("\nCuantos artículos son?: ");
            cant = scn.nextInt();
        }
        scn.close();

        long[] vprodprecio = new long[cant];

        subtotal = 0;
        for (i = 0; i < cant; i++) {
            System.out.print("Ingrese el precio del producto: ");
            precio = scn.nextInt();
            while (precio < 1) {
                System.out.println("Error. Precio inválido (precio > 0)\n");

                System.out.print("Ingrese el precio del producto: ");
                precio = scn.nextInt();
            }
            vprodprecio[i] = precio;
            subtotal += precio;

        }

        //Impresion de resultados (Precios y subtotal)
        System.out.printf("%n%20s%n", "MENOS X MAS");
        System.out.println(String.format("%0" + 30 + "d", 0).replace("0", "-"));
        for (i = 0; i < cant; i++) {
            System.out.printf("%3s%2d%5s%d%n", "Artículo", (i+1), "$", vprodprecio[i]);
        }
        System.out.println(String.format("%0" + 25 + "d", 0).replace("0", "-"));
        System.out.printf("%9s%6s%d%n", "SUBTOTAL", "$", subtotal);

        //Encontrar los tres productos mas caros
        Arrays.sort(vprodprecio); //ordena de menor a mayor

        //Calculo de descuentos
        descuento = 0;
        for (i = 1; ( (i <= 3) && ((cant - i) >= 0)); i++) {
            descuento += Math.round((double) vprodprecio[cant - i] * ((double) (4-i) / 10.0));
        }

        //Calculo del IVA
        iva = Math.round(((double) (subtotal - descuento) * 0.2));
        //Calculo del total
        total = subtotal - descuento + iva;

        System.out.printf("%n%11s%4s%d%n", "DESCUENTOS", "$", Math.round(descuento));
        System.out.printf("%n%4s%11s%d%n", "IVA", "$", Math.round(iva));

        System.out.println(String.format("%0" + 25 + "d", 0).replace("0", "-"));
        System.out.printf("%6s%9s%d%n", "TOTAL", "$", Math.round(total));
        System.out.println(String.format("%0" + 25 + "d", 0).replace("0", "-"));
    }
}
