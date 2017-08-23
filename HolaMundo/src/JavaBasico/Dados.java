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
        int i,d1,d2,sum;
        SecureRandom r= new SecureRandom();
        int[] vfrec= new int[13];
        
        for(i=1; i<1000000; ++i) {
            d1= r.nextInt(6)+1;
            d2= r.nextInt(6)+1;
            sum= d1+d2;
            ++vfrec[sum] ;
        }
        
        int max= vfrec[2];
        int imax= 2;
        System.out.printf("%s%12s%n", "Valor", "Frecuencia");
        for(i=2; i<vfrec.length; i++) {
            System.out.printf("%5d%10d%20F%n", i, vfrec[i], float(float(vfrec[i])/1000000.0));
            if (vfrec[i]>max) {
                max= vfrec[i];
                imax= i;
            }
        }
        
        System.out.println("El valor que mas cae es " + imax);
        
        
        
        
    }
     
}
