package Reto8_2;

import java.util.Arrays;

public class Carrito {

    int[] CantidadTipoFrutas = new int[TipoFruta.values().length];
    double pesoTotal;
    double caloriasTotal;
    long precioTotal;

    /**
     *
     */
    public Carrito() {
        this.pesoTotal = 0.0;
        this.caloriasTotal = 0.0;
        this.precioTotal = 0;
        Arrays.fill(CantidadTipoFrutas, 0);
    }

    /**
     *
     * @param fruta
     */
    public void addFruta(Fruta fruta) {
        if (fruta != null) {
            this.pesoTotal += fruta.getPeso();
            this.caloriasTotal += fruta.getCalorias();
            this.precioTotal += fruta.getPrecio();
            ++this.CantidadTipoFrutas[fruta.getTipo().ordinal()];
        }
    }

    /**
     * @param tipo
     * @return the la cantidad de frutas por el tipo
     */
    public int getCantidadTipoFrutas(TipoFruta tipo) {
        return CantidadTipoFrutas[tipo.ordinal()];
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
