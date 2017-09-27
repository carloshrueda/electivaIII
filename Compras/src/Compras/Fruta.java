package Compras;

public class Fruta {

    private String Nombre;

    private TipoFruta Tipo;

    private double Peso;

    private double Calorias;

    private int Precio;

    public Fruta() {
        this.Nombre = "";
        this.Peso = 0.0;
        this.Calorias = 0.0;
        this.Precio = 0;
        //TODO
        this.Tipo= null;
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

    //TODO
    public TipoFruta getTipo() {
        return this.Tipo;
    }

    //TODO
    @Override
    public String toString() {
        return Tipo.toString();
    }

    //TODO
    public static Fruta getFruta(TipoFruta tipoFruta) {
        switch(tipoFruta) {
            case PAPAYA:
                return new Papaya();
            case KIWI:
                return new Kiwi();
            case NARANJA:
                return new Naranja();
            case MANGO:
                return new Mango();
            case BANANO:
                return new Banano();
            default:
                return null;
        }
    }
}
