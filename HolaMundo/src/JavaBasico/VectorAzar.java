package JavaBasico;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

/**
 *
 * @author ESTUDIANTE
 */
public class VectorAzar {

    public static void imprimirVec(int[] v, String msg) {
        System.out.printf("%n%s%n",msg);
        for(int e:v){
            System.out.printf("%d, ",e);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] vint = {15,32,25,18,17,1,3,39,37,96,81,4,5,89,12,46,32,89,10,55,36};

        int i;
        final int tam= 7;
        int[] parcial = new int[tam];
        int p, t;

        SecureRandom r;
        try {
            r = SecureRandom.getInstance("SHA1PRNG");
            imprimirVec(vint, "Vector inicial:");
            /*for (i = 0; i < tam+1; ++i) {
                p = r.nextInt(vint.length-i);
                parcial[i]= vint[p];
                vint[p]= vint[vint.length-i-1];
                vint[vint.length-i-1]= parcial[i];
            }
            Arrays.sort(parcial);

            for (i = 0; i < parcial.length - 1; i++) {
                System.out.printf("%d -> %s%n",(i+1),parcial[i]);
            }*/

        } catch (NoSuchAlgorithmException ex) {
            System.err.println(Dados.class.getName() + "\n" + ex.getMessage());
        }
    }

}
