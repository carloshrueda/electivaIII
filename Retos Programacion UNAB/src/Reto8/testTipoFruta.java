package Reto8;

public class testTipoFruta {

	public static void main(String[] args) {
		
		if (TipoFruta.validTipo().contains(TipoFruta.BANANO)) {
			System.out.println("Existe");
		} else {
			System.out.println("No existe");
		}

	}

}
