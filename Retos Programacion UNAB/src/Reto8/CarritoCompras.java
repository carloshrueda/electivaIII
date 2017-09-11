package Reto8;

import java.util.ArrayList;

public class CarritoCompras {
	ArrayList<Fruta> carrito;
	int[] tipoFrutasCant = new int[TipoFruta.values().length];
	double pesoTotal;
	double caloriasTotal;
	long precioTotal;

	public CarritoCompras() {
		super();
		this.carrito = new ArrayList<>();
		this.pesoTotal = 0.0;
		this.caloriasTotal = 0.0;
		this.precioTotal = 0;
	}
	
	public void addFruta(TipoFruta tipo) {
		Fruta fruta= new Fruta(tipo);
		
		this.carrito.add(fruta);
		this.pesoTotal += fruta.getPeso();
		this.caloriasTotal += fruta.getCalorias();
		this.precioTotal += fruta.getPrecio();
		++this.tipoFrutasCant[tipo.ordinal()];
	}

	/**
	 * @return the tipoFrutasTotal
	 */
	public int[] getTipoFrutasCant() {
		return tipoFrutasCant;
	}

	/**
	 * @return the pesoTotal
	 */
	public double getPesoTotal() {
		return pesoTotal;
	}

	/**
	 * @return the caloriasTotal
	 */
	public double getCaloriasTotal() {
		return caloriasTotal;
	}

	/**
	 * @return the precioTotal
	 */
	public long getPrecioTotal() {
		return precioTotal;
	}

}
