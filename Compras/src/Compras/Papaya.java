package Compras;

public class Papaya extends Fruta {
    public Papaya() {
        super();
        setNombre(Tipo.toString());
        this.Tipo = TipoFruta.PAPAYA;
        setNombre(Tipo.toString());
        this.Calorias = 1290; // 43 cal/100 gr https://es.wikipedia.org/wiki/Carica_papaya
        this.Precio = 4560; // http://www.exito.com/products/0000060342062211/Papaya+Comun
        this.Peso = 3000; // http://www.exito.com/products/0000060342062211/Papaya+Comun
    }
}
