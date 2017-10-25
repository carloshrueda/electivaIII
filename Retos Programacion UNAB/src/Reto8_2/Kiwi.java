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
public class Kiwi extends Fruta {

    public Kiwi() {
        super();
        this.tipo = TipoFruta.KIWI;
        this.nombre = tipo.toString();
        this.calorias = 85.4; // 61 cal/100 gr https://es.wikipedia.org/wiki/Kiwi_(fruta)
        this.precio = 851; // http://www.exito.com/products/0000249189215342/Kiwi+a+Granel
        this.peso = 140; // http://www.exito.com/products/0000249189215342/Kiwi+a+Granel
    }
}
