/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;

import java.security.SecureRandom;

/**
 *
 * @author ESTUDIANTE
 */
public class Dados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, d1, d2, sum;
        int[] vfrec = new int[11];
        final int veces = 1000000;

        SecureRandom r = new SecureRandom();
        //sembrando el generador de aleatorios
        r.setSeed(System.currentTimeMillis());
        for (i = 0; i < veces; ++i) {
            d1 = r.nextInt(6);
            d2 = r.nextInt(6);
            sum = d1 + d2;
            ++vfrec[sum];
        }

        int max = vfrec[0];
        int imax = 0;
        System.out.printf("%s%12s%5s%n", "Valor", "Frecuencia", "%");
        for (i = 0; i < vfrec.length; i++) {
            System.out.printf("%5d%10d%10.3f%n", i + 2, vfrec[i], 
                    ((float) (vfrec[i]) / (float) (veces) * 100.0));
            if (vfrec[i] > max) {
                max = vfrec[i];
                imax = i + 2;
            }
        }

        System.out.println("\nEl valor que mas cae es: " + imax);
    }

}
