/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;

import java.util.Scanner;
import java.security.SecureRandom;

/**
 *
 * @author ESTUDIANTE
 */
public class Operaciones {

    public static void main(String[] args) {
        int vInt;
        float vFloat;
        String vStr;
        boolean b1, b2;

        Scanner vscan = new Scanner(System.in);

        vInt = 5 + 2;
        System.out.println("vInt= 5 + 2: " + vInt);
        vInt = 5 - 2;
        System.out.println("vInt= 5 - 2: " + vInt);
        vInt = 5 * 2;
        System.out.println("vInt= 5 * 2: " + vInt);
        vInt = 5 % 2;
        System.out.println("vInt= 5 % 2: " + vInt);
        vInt = 5 ^ 2;
        System.out.println("vInt= 5 ^ 2: " + vInt + Math.pow(2, 3));

        vFloat = 5 + 2;
        System.out.println("vInt= 5 + 2: " + vFloat);
        vFloat = 5 - 2;
        System.out.println("vInt= 5 - 2: " + vFloat);
        vFloat = 5 * 2;
        System.out.println("vInt= 5 * 2: " + vFloat);
        vFloat = 5 % 2;
        System.out.println("vInt= 5 % 2: " + vFloat);
        vFloat = 5 ^ 2;
        System.out.println("vInt= 5 ^ 2: " + vFloat);

        vStr = "David ";
        vStr = vStr + "Williams";
        System.out.println("Cadena: " + vStr);

        b1 = true;
        b2 = false;
        System.out.println("b1 and b2: " + (b1 && b2));
        System.out.println("b1 or b2: " + (b1 || b2));
        System.out.println("not b1: " + (!b1));
        System.out.println("not b2: " + (!b2));

        /*System.out.println("introduzca un texto: ");
         System.out.println(vscan.nextLine());*/
        int i;

        i = 5;
        i = ++i + 2;
        System.out.println(i);
        i = 5;
        i = i++ + 2;
        System.out.println(i);

        int a = 33;
        int b;

        System.out.println(a);
        b = a << 2;
        System.out.println(b);
        b = a >> 2;
        System.out.println(b);
        b = a & 2;
        System.out.println(b);

        //CICLOS
        for (i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);

        }
        System.out.println(i);

        i = 2;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        i = 2;
        do {
            System.out.println(i);
            i += 2;
        } while (i < 10);

        if (i <= 8) {
            System.out.println("Menor igual que 8");
        } else if (i > 10) {
            System.out.println("Mayor a 10");
        } else {
            System.out.println("entre 9 y 10");
        }

        switch (i) {
            case 8:
                System.out.println("igual que 8");
                break;
            case 10:
                System.out.println("igual que 10");
                break;
            default:
                System.out.println("Diferente");
        }
        
        //declaracion y creación del vector
        int[] vi = new int[12]; 
        
        System.out.printf("%s%8s%n", "Indice", "Valor");
        for(i=0; i<vi.length; i++)
            System.out.printf("%5d%8d%n", i, vi[i]);
        
        //Declaración e inicialización 
        int[] vj = {32, 27, 14, 18, 95, 64, 90, 70, 60};
        
        System.out.printf("%s%8s%n", "Indice", "Valor");
        for(i=0; i<vj.length; i++)
            System.out.printf("%5d%8d%n", i, vj[i]);
        
        //Llenado del vector con numeros Aleatorios
        SecureRandom numAle= new SecureRandom();
        for(i=0; i<vi.length; i++)
            vi[i]= numAle.nextInt(1000);
        
        System.out.printf("%s%8s%n", "Indice", "Valor");
        for(i=0; i<vi.length; i++)
            System.out.printf("%5d%8d%n", i, vi[i]);
        
        int[] vec= {86,68,3,52,8,12};
        
        for(int num:vec) {
            System.out.println("valor: " + num);
        }
                
                
                

    }

}
