/*
* Programa simulador de Dados que usa una implementación del algoritmo 
* de aleatorios MersenneTwister
* implementado por Uncommons Maths
* Web: https://maths.uncommons.org/
* documentacion: https://maths.uncommons.org/api/index.html
 */
package JavaBasico;

import org.uncommons.maths.random.MersenneTwisterRNG;

/**
 *
 * @author CRUEDA
 */
public class Dados3 {

    public static void main(String[] args) {
        int i;
        int[] vfrec = new int[11];
        final int veces = 100000000;

        MersenneTwisterRNG r = new MersenneTwisterRNG();

        //generando los lanzamientos de dados
        r.setSeed(System.currentTimeMillis());
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

        System.out.println("\n(dados 3) El valor que mas cae es: " + imax);

    }
}
