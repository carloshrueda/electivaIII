/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prarchivos;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author ESTUDIANTE
 */
public class ArchivosClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomarch= "./docs/datos.txt";
        
        try {
            Scanner scn= new Scanner(new FileReader(nomarch));
            String str= "";
            while (scn.hasNextLine()) {
                str= scn.nextLine().trim();
                System.out.println("[" + str + "]");
            }
            scn.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error. No se encontro el archivo\n" + 
                    e.getMessage());
        } catch (Exception e) {
            System.out.println("Error.\n" + e.getMessage());
        }
    }
    
}
