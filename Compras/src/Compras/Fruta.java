package Compras;

public class Fruta {

    private String Nombre;

    //TODO: Convertir esto en una clase enum
    //public static enum Tipo {PAPAYA, KIWI, NARANJA, MANGO, BANANO};
    private TipoFruta Tipo;

    private double Peso;

    private double Calorias;

    private int Precio;

    public Fruta() {
        this.Nombre = "";
        this.Peso = 0.0;
        this.Calorias = 0.0;
        this.Precio = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    private void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPeso() {
        return Peso;
    }

    private void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getCalorias() {
        return Calorias;
    }

    private void setCalorias(double Calorias) {
        this.Calorias = Calorias;
    }

    public int getPrecio() {
        return Precio;
    }

    private void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    //TODO:
    public TipoFruta getTipo() {
        return this.Tipo;
    }

    @Override
    public String toString() {
        return Tipo.toString();
    }

    public static Fruta getFruta(TipoFruta tipoFruta) {
        if (tipoFruta==TipoFruta.PAPAYA) {
            return new Papaya();
        }
        if (tipoFruta==TipoFruta.KIWI) {
            return new Kiwi();
        }
        if (tipoFruta==TipoFruta.NARANJA) {
            return new Naranja();
        }
        if (tipoFruta==TipoFruta.MANGO) {
            return new Mango();
        }
        if (tipoFruta==TipoFruta.BANANO) {
            return new Banano();
        }
        return null;
    }
}
