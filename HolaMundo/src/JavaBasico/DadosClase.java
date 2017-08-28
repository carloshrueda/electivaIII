/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
/**
 *
 * @author ESTUDIANTE
 */
public class DadosClase {
    public static void main(String[] args) {
        int i;
        int[] vdados= new int[11];
        final int veces= 10000000;
        int fmax, rmax;
        
        SecureRandom r;
        try {
            r = SecureRandom.getInstance("SHA1PRNG");
            for(i=0; i<veces;i++ ){
               ++vdados[r.nextInt(6)+r.nextInt(6)];
            }
            
            fmax= vdados[0];
            rmax= 2;
            System.out.printf("%s%12s%n", "Dado", "Frecuencia");
            for(i=0;i<vdados.length; i++){
                System.out.printf("%3d%12d%12.3f%n",
                        i+2,
                        vdados[i],
                        ((float)vdados[i]/(float)veces*100.0));
                
                if (vdados[i]>fmax) {
                    fmax= vdados[i];
                    rmax= i+2;
                }
            }
            
            System.out.println("\nEl número que más cae es: " + 
                    rmax + " Con una frecuencia de: " + fmax);
            
            
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Error" + 
                    DadosClase.class.getName() + "\n" + 
                    ex.getMessage());
        }
        
        
        
    }
}
