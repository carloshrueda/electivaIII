package JavaBasico;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

/**
 *
 * @author ESTUDIANTE
 */
public class VectorAzar {

    public static void imprimirVec(int[] v, int i, int f, String msg) {
        System.out.printf("%n%s%n", msg);
        for (int k = i; k < f; k++) {
            System.out.printf("%d, ", v[k]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vint = {15, 32, 25, 18, 17, 1, 3, 39, 37, 96, 81, 4, 5, 89, 12, 46, 32, 89, 10, 55, 36};

        int i;
        final int tam = 7;
        int[] vfin = new int[tam];
        int p, t;

        SecureRandom r;
        try {
            r = SecureRandom.getInstance("SHA1PRNG");
            imprimirVec(vint, 0, vint.length, "Vector inicial:");
            System.out.println("Tamaño del vector: " + vint.length);
            for (i = 0; i < tam; ++i) {
                imprimirVec(vint, 0, vint.length - i, "VINT:");
                p = r.nextInt(vint.length - i);
                System.out.printf("%nP: %d <--> vinit[%d]=%d", p, p, vint[p]);
                vfin[i] = vint[p];
                imprimirVec(vfin, 0, i+1, "VFIN:");
                vint[p] = vint[vint.length - 1 - i];
                vint[vint.length - 1 - i] = vfin[i];
                imprimirVec(vint, 0, vint.length, "VINT:");
                System.out.println("-------------------------------------------");
            }
            Arrays.sort(vfin);

            System.out.println("\nVECTOR FINAL");
            for (i = 0; i < vfin.length; i++) {
                System.out.printf("%d -> %s%n",i,vfin[i]);
            }

        } catch (NoSuchAlgorithmException ex) {
            System.err.println(Dados.class.getName() + "\n" + ex.getMessage());
        }
    }

}
