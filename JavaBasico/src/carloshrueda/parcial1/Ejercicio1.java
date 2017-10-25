/*
 * UDI - Ingeniería de Sistemas - Electiva 3 - Parcial 1 - Ejercicio 1
 * Se realizó una expedición arqueológica en San Agustin en los años 1900 y los 
 * investigadores encontraron excelentes especímenes a los cuales le registraron 
 * su peso en libras y su altura en pies. En el presente año se revisó dicha 
 * expedición y se desea actualizar los datos a kilogramos y metros. 
 * 1 pie= 0.3048 metros
 * 1 kilo= 2 libras
 */
package carloshrueda.parcial1;

import java.util.Scanner;

/**
 *
 * @author carloshrueda@gmail.com
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double peso_ant, altura_ant, peso_new, altura_new;

        final double pie2metro = 0.3048;
        final double libra2kilo = 0.5;

        Scanner scn = new Scanner(System.in);

        System.out.print("Introduzca el peso [libras]: ");
        peso_ant = scn.nextDouble();
        while (peso_ant < 0) {
            System.out.println("Error. Dato erroneo (peso >=0)");
            System.out.print("\nIntroduzca el peso [libras]: ");
            peso_ant = scn.nextDouble();
        }

        System.out.print("Introduzca la altura [pies]: ");
        altura_ant = scn.nextDouble();
        while (altura_ant < 0) {
            System.out.println("Error. Dato erroneo (altura >=0)");
            System.out.print("\nIntroduzca la altura [pies]: ");
            altura_ant = scn.nextDouble();
        }
        scn.close();

        peso_new = peso_ant * libra2kilo;
        altura_new = altura_ant * pie2metro;

        System.out.printf("%n%s%3.3f%s", "El peso es : ", peso_new, " [kilogramos]");
        System.out.printf("%n%s%3.3f%s%n", "La Altura es: ", altura_new, " [metros]");
    }

}
