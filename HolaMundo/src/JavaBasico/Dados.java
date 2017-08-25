package JavaBasico;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 *
 * @author ESTUDIANTE
 */
public class Dados {

    public static void main(String[] args) {
        int i;
        int[] vfrec = new int[11];
        final int veces = 1000000;

        SecureRandom r;
        try {
            //generando los lanzamientos de dados
            r = SecureRandom.getInstance("SHA1PRNG");
            for (i = 0; i < veces; ++i) {
                //Aumentando la frecuencia a medida que caen
                ++vfrec[r.nextInt(6) + r.nextInt(6)];
            }

            //Imprimir resultados
            int max = vfrec[0];
            int imax = 0;
            System.out.printf("%s%12s%5s%n", "Valor", "Frecuencia", "%");
            for (i = 0; i < vfrec.length; i++) {
                System.out.printf("%5d%10d%10.3f%n", i + 2, vfrec[i],
                        ((float) (vfrec[i]) / (float) (veces) * 100.0));

                //Buscando el numero con la frecuencia mayor
                if (vfrec[i] > max) {
                    max = vfrec[i];
                    imax = i + 2;
                }
            }

            System.out.println("\nEl valor que mas cae es: " + imax);
        } catch (NoSuchAlgorithmException ex) {
            System.err.println(Dados.class.getName() + "\n" + ex.getMessage());
        }

    }

}
