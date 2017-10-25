package Reto8;

public class Fruta {
	private String nombre;
	private TipoFruta tipo;
	private double peso; // gr
	private double calorias; // cal/gr
	private long precio; // gr

	public Fruta() {
		super();
		this.nombre = null;
		this.tipo = null;
		this.peso = 0.0; // gramos
		this.calorias = 0.0;
		this.precio = 0; // pesos colombianos pagados en efectivo
	}

	/**
	 * @param tipo
	 */
	public Fruta(TipoFruta tipo) {
		super();
		setTipo(tipo);
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the tipo
	 */
	public TipoFruta getTipo() {
		return tipo;
	}

	/**
	 * @param tipo
	 *            the tipo to set
	 */
	public void setTipo(TipoFruta tipo) {
		switch (tipo) {
		case PAPAYA:
			this.tipo = tipo;
			this.nombre = tipo.toString();
			this.calorias = 1290; // 43 cal/100 gr https://es.wikipedia.org/wiki/Carica_papaya
			this.precio = 4560; // http://www.exito.com/products/0000060342062211/Papaya+Comun
			this.peso = 3000; // http://www.exito.com/products/0000060342062211/Papaya+Comun
			break;

		case KIWI:
			this.tipo = tipo;
			this.nombre = tipo.toString();
			this.calorias = 85.4; // 61 cal/100 gr https://es.wikipedia.org/wiki/Kiwi_(fruta)
			this.precio = 851; // http://www.exito.com/products/0000249189215342/Kiwi+a+Granel
			this.peso = 140; // http://www.exito.com/products/0000249189215342/Kiwi+a+Granel

		case NARANJA:
			this.tipo = tipo;
			this.nombre = tipo.toString();
			this.calorias = 197.4; // 47 cal/100 gr https://es.wikipedia.org/wiki/Naranja
			this.precio = 1714; // http://www.exito.com/products/0000060180062112/Mango+Tommy+a+Granel
			this.peso = 800; // http://www.exito.com/products/0000060180062112/Mango+Tommy+a+Granel

		case MANGO:
			this.tipo = tipo;
			this.nombre = tipo.toString();
			this.calorias = 252; // 60 cal/100 gr https://es.wikipedia.org/wiki/Mango_(fruta)
			this.precio = 4416; // http://www.exito.com/products/0000060338062208/Naranja+Tangelo+Mineola+a+Granel
			this.peso = 420; // http://www.exito.com/products/0000060338062208/Naranja+Tangelo+Mineola+a+Granel

		case BANANO:
			this.tipo = tipo;
			this.nombre = tipo.toString();
			this.calorias = 293.7; // 89 cal/100 gr https://es.wikipedia.org/wiki/Pl%C3%A1tano_(fruto)
			this.precio = 605; // http://www.exito.com/products/0000310733276701/Banano+Criollo+a+Granel
			this.peso = 330; // http://www.exito.com/products/0000310733276701/Banano+Criollo+a+Granel

		default:
			break;
		}

	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @return the calorias
	 */
	public double getCalorias() {
		return calorias;
	}

	/**
	 * @return the precio
	 */
	public long getPrecio() {
		return precio;
	}
	
	
	@Override
	public String toString() {
		return tipo.toString();
	}
}

