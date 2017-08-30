/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

/**
 *
 * @author ESTUDIANTE
 */
public class AsistenciaParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombres = {
            "CABALLERO RUEDA JUANA VALENTINA",
            "CALDERON JAIMES HUGO",
            "CARRASQUILLA BAITER LUIS ALEXANDER",
            "CARRILLO LEON LIRIS XILENA",
            "CASTRO CRUZ VICTOR MANUEL",
            "CONTRERAS LARIOS JOHAN SEBASTIAN",
            "DAZA TAMAYO HEIMAN",
            "FIALLO PALENCIA MARIA FERNANDA",
            "GARZON QUINTERO FERNANDO ",
            "GONZALEZ CAMARGO MONICA LISSETH",
            "HERNANDEZ GALVAN CARLOS LEONARDO",
            "LLANO LEGUIZAMON IVAN DARIO",
            "LOPEZ JAIMES LIZ JANETH",
            "MANTILLA SUAREZ HAROLD IOVANY",
            "MARTINEZ RAMIREZ JUAN DAVID",
            "MONROY MARTINEZ JORGE LUIS",
            "MORENO PINZON OSCAR ANDRES",
            "OQUENDO PINEDA ANGIE CAROLINA",
            "OTALVARO QUIROGA GERMAN MAURICIO",
            "PAEZ SANCHEZ LEIDY VANESA",
            "PARRA DELGADO MARIO FELIPE",
            "PEÑA RUEDA DANIEL JULIAN",
            "PEÑA TOLOZA YERSON JAVIER",
            "PINZON PEDRAZA JUAN SEBASTIAN",
            "PIRACON ROJAS ANGIE ",
            "RAMIREZ ROMAN DANIEL ",
            "RIVAS BETANCOURT KEVIN JOHAN",
            "RUEDA FAJARDO DIANA CAROLINA",
            "SANCHEZ  CRISTHIAN DAVID",
            "SEPULVEDA BLANCO BELLA SNNEY",
            "SEQUEDA ESPINOSA FABIAN ",
            "SUAREZ GARNICA JORGE DAVID",
            "SUAREZ RUBIANO SAMUEL DAVID",
            "SUAREZ SUAREZ ANDERSON YESID",
            "VILLALBA VARGAS ALIX MARIANA"
        };

        int i, veces;
        String[] parcial = new String[19];
        int p;
        String t;

        SecureRandom r;
        veces = 18;
        try {
            r = SecureRandom.getInstance("SHA1PRNG");
            System.out.println("Personas que presentan el parcial el 6 de septiembre");
            Arrays.fill(parcial, "");
            for (i = 0; i < veces+1; ++i) {
                p = r.nextInt(nombres.length-i);
                parcial[i]= nombres[p];
                nombres[p]= nombres[nombres.length-i-1];
                nombres[nombres.length-i-1]= parcial[i];
            }
            Arrays.sort(parcial);

            for (i = 0; i < parcial.length - 1; i++) {
                System.out.printf("%d -> %s%n",(i+1),parcial[i]);
            }

        } catch (NoSuchAlgorithmException ex) {
            System.err.println(Dados.class.getName() + "\n" + ex.getMessage());
        }
    }

}
