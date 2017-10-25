
/*
 * En la asignatura L�gica se realizaron 5 evaluaciones. Las evaluaciones tienen una calificaci�n del 1 al 20. 
 * La primera evaluaci�n tiene un peso del 15%, la segunda tiene un peso del 30%, la tercera tiene un peso de 25%, 
 * la cuarta tiene un peso de 10% y la �ltima tiene un peso del 20%. Realice un algoritmo que determine la calificaci�n 
 * final de un estudiante sabiendo que se tiene como datos de entrada la nota (en la escala del 1 al 20) de cada 
 * evaluaci�n.
 * 
 */

import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
		int canteval = 5;
		int[] vevaluaciones = new int[canteval];
		int nota,i;
		double[] vpeso = { 0.15, 0.30, 0.25, 0.10, 0.20 };
		double calificacion= 0.0;
		
		Scanner scn = new Scanner(System.in);

		//Ingresar la evaluaciones al vector vevaluaciones
		System.out.println("Ingrese la nota de cada evaluaci�n...");
		for (i = 0; i < canteval; i++) {
			//capturando la nota
			System.out.printf("%s%d%s", "Ingrese la nota #", (i + 1), ": ");
			nota = scn.nextInt();
			
			//validando que la nota este entre 1 y 20
			while ((nota < 1) || (nota > 20)) {
				System.out.println("--> Error. Valor de la nota inv�lido (1 al 20).\n");
				//capturando la nota
				System.out.printf("%s%d%s", "Ingrese la nota #", (i + 1), ": ");
				nota = scn.nextInt();
			}
			vevaluaciones[i]= nota;	//almacenando la nota en el vector
			calificacion +=  (double) nota * vpeso[i];
		}

		scn.close();
		
		//Imprimiendo resultados
		System.out.printf("%n%s%d", "==> La calificaci�n final es: ", Math.round(calificacion));

	}

}
