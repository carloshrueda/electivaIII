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
public class Mango extends Fruta {

    public Mango() {
        super();
        this.tipo = TipoFruta.MANGO;
        this.nombre = tipo.toString();
        this.calorias = 252; // 60 cal/100 gr https://es.wikipedia.org/wiki/Mango_(fruta)
        this.precio = 4416; // http://www.exito.com/products/0000060338062208/Naranja+Tangelo+Mineola+a+Granel
        this.peso = 420; // http://www.exito.com/products/0000060338062208/Naranja+Tangelo+Mineola+a+Granel
    }
}
