package Reto8_2;

public class Fruta {

    String nombre;
    protected TipoFruta tipo;
    protected double peso; // gr
    protected double calorias; // cal/gr
    protected long precio; // gr

    public Fruta() {
        this.nombre = "";
        this.tipo = null;
        this.peso = 0.0; // gramos
        this.calorias = 0.0;
        this.precio = 0; // pesos colombianos pagados en efectivo
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
    
    public static Fruta getFruta(int tipo) {
        Fruta fruta;

        switch (tipo) {
            case 0:
                fruta = new Papaya();
                break;
            case 1:
                fruta = new Kiwi();
                break;
            case 2:
                fruta = new Naranja();
                break;
            case 3:
                fruta = new Mango();
                break;
            case 4:
                fruta = new Banano();
                break;
            default:
                fruta= null;
                break;
        }
        
        return fruta;
    }
    
}