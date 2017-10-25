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
public class Banano extends Fruta {

    public Banano() {
        super();
        this.tipo = TipoFruta.BANANO;
        this.nombre = tipo.toString();
        this.calorias = 293.7; // 89 cal/100 gr https://es.wikipedia.org/wiki/Pl%C3%A1tano_(fruto)
        this.precio = 605; // http://www.exito.com/products/0000310733276701/Banano+Criollo+a+Granel
        this.peso = 330; // http://www.exito.com/products/0000310733276701/Banano+Criollo+a+Granel
    }
}
