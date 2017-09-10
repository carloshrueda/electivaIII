/*
 * Calcule el salario actual de un empleado que al entrar a la empresa ganaba 2.000.000 mensuales. Teniendo en cuenta 
 * su antigüedad en la empresa de 15 años y las siguientes políticas de aumentos. Imprimir el salario año por año.
 * 
 * Al cumplir 10 años trabajando se le aumenta el 10%.
 * Al cumplir 7 años trabajando se le aumenta el 7%.
 * Al cumplir 5 años trabajando se le aumenta el 5%.
 * Al cumplir 3 años trabajando se le aumenta el 3%.
 */

public class Reto2 {

	public static void main(String[] args) {
		int salactual = 2000000;
		int antiguedad = 15;

		for (int i = 1; i <= antiguedad; i++) {
			switch (i) {
			case 3:
				salactual = (int) Math.round((double) salactual * 1.03); // Incremeno en 3%
				break;
			case 5:
				salactual = (int) Math.round((double) salactual * 1.05); // Incremeno en 5%
				break;
			case 7:
				salactual = (int) Math.round((double) salactual * 1.07); // Incremeno en 7%
				break;
			case 10:
				salactual = (int) Math.round((double) salactual * 1.10); // Incremeno en 10%
				break;
			}
			
			System.out.printf("%s%2d%s%d%n", "El salario en el año ", i, " es: ", salactual);

		}

	}

}
