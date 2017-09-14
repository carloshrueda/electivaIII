/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto8_2;

/**
 *
 * @author usuario
 */
public class Papaya extends Fruta {

    public Papaya() {
        super();
        this.tipo = TipoFruta.PAPAYA;
        this.nombre = tipo.toString();
        this.calorias = 1290; // 43 cal/100 gr https://es.wikipedia.org/wiki/Carica_papaya
        this.precio = 4560; // http://www.exito.com/products/0000060342062211/Papaya+Comun
        this.peso = 3000; // http://www.exito.com/products/0000060342062211/Papaya+Comun
    }
}
