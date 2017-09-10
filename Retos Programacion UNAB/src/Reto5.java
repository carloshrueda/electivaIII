
/*
 * Desarrollar un programa que en el main permita crear un arreglo cuyo
 * tamaño sea leído previamente por teclado.
 * 
 * Crear una función que reciba un arreglo y lo imprima.
 * Crear una función que llene un arreglo aleatoriamente.
 * Crear una función que reciba un arreglo y lo invierta.
 * 
 * En el main llamar las otras funciones para llenar el arreglo creado, imprimirlo, invertirlo y 
 * finalmente volverlo a imprimir.
 * 
 * Ej. 
 * Arreglo Normal: 2, 4, 3, 1, 5
 * Arreglo Invertido: 5, 1, 3, 4, 2
 * 
 */

import java.util.Scanner;
import java.security.SecureRandom; // para generar los numero aleatorios

public class Reto5 {

	public static int[] InvertirVec(int[] v) {
		int[] vi = new int[v.length];

		for (int i = v.length; i > 0; i--) {
			vi[v.length - i] = v[i - 1];
		}

		return vi;
	}

	public static int[] llenarAleatorioVec(int[] v) {
		SecureRandom aleatorio = new SecureRandom();
		aleatorio.setSeed(System.currentTimeMillis()); // inicializando el aleatorio
		for (int i = 0; i < v.length; i++) {
			v[i] = aleatorio.nextInt(1000) + 1; // un aleatorio entre 1 y 1000
		}

		return v;
	}

	public static String imprimirVec(int[] v) {
		String cad = "";
		String separador = ", ";
		for (int j : v) {
			cad += j + separador;
		}

		// Si la cadena no esta vacía devuelva la cadena hasta antes del separador
		// Sino devuelva vacio.
		return (!cad.isEmpty()) ? cad.substring(0, cad.length() - separador.length() - 1) : cad;

	}

	public static void main(String[] args) {
		int tam;
		Scanner leer = new Scanner(System.in);

		System.out.print("Ingrese el tamano del arreglo: ");
		tam = leer.nextInt();
		leer.close();

		if (tam > 0) {
			int[] vector = new int[tam];

			vector = llenarAleatorioVec(vector);
			System.out.println("Arreglo normal: [" + imprimirVec(vector) + "]");
			vector = InvertirVec(vector);
			System.out.println("Arreglo invertido: [" + imprimirVec(vector) + "]");

		} else {
			System.out.println("--> Error. Tamano del vector inválido");
		}

	}

}
