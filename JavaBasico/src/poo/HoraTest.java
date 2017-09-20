/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author ESTUDIANTE
 */
public class HoraTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hora h1 = new Hora();    //00:00:00
        Hora h2 = new Hora(2);   //02:00:00
        Hora h3 = new Hora(21, 34);   //21:34:00
        Hora h4 = new Hora(12, 25, 42);   //12:25:42
        Hora h5 = new Hora(h4);   //12:25:42

        System.out.println("Constructores: ");
        desplegarHora("Hora 1:", h1);
        desplegarHora("Hora 2:", h2);
    }

    private static void desplegarHora(String str, Hora h) {
        System.out.printf("%s%n\t%s%n", str, h.toString());
    }

}
