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
public class Naranja extends Fruta {

    public Naranja() {
        super();
        this.tipo = TipoFruta.NARANJA;
        this.nombre = tipo.toString();
        this.calorias = 197.4; // 47 cal/100 gr https://es.wikipedia.org/wiki/Naranja
        this.precio = 1714; // http://www.exito.com/products/0000060180062112/Mango+Tommy+a+Granel
        this.peso = 800; // http://www.exito.com/products/0000060180062112/Mango+Tommy+a+Granel
    }
}
