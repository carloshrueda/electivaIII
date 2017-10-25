package Reto8;

import java.util.EnumSet;

public enum TipoFruta {
	PAPAYA, KIWI, NARANJA, MANGO, BANANO;

	public static EnumSet<TipoFruta> validTipo() {
		// valida si el tipo existe
		return EnumSet.of(PAPAYA, KIWI, NARANJA, MANGO, BANANO);
	}

	public static TipoFruta getFruta(int tipo) {
		TipoFruta t = null;
		switch (tipo) {
		case 0:
			t = TipoFruta.PAPAYA;
			break;
		case 1:
			t = TipoFruta.KIWI;
			break;
		case 2:
			t = TipoFruta.NARANJA;
			break;
		case 3:
			t = TipoFruta.MANGO;
			break;
		case 4:
			t = TipoFruta.BANANO;
			break;
		default:
			break;
		}

		return t;

	}
}
