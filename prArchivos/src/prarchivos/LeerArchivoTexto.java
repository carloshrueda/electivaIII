/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template scn, choose Tools | Templates
 * and open the template in the editor.
 */
package prarchivos;

import java.util.Scanner;
//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.IOException;

/**
 *
 * @author CRUEDA
 */
public class LeerArchivoTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomarchivo= "C:\\Users\\ESTUDIANTE\\Documents\\NetBeansProjects\\electivaIII\\prArchivos\\src\\prarchivos\\dataFile.txt";
        
        try {
            Scanner scn = new Scanner(new FileReader(nomarchivo));
            
            System.out.println("Inicio" + scn.hasNext());
            
            while (scn.hasNext()) {
                String stringRead = scn.nextLine();
                System.out.println(stringRead);
            }
            System.out.println("fin");
            scn.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error. No se encontró el archivo " + nomarchivo + "\n" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error. " + ex.getMessage());
        }
        /*catch (IOException ioex) {
            ioex.printStackTrace();
        }*/
    }
    
}
