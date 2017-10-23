/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prarchivos;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author CRUEDA
 */
public class LeerArchivoTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomarchivo= "dataFile.txt";
        
        try {
            Scanner file = new Scanner(new File(nomarchivo));
            
            while (file.hasNext()) {
                String stringRead = file.nextLine();
                System.out.println(stringRead);
            }
            
            file.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Error. No se encontró el archivo " + nomarchivo);
        }
        catch (IOException ioex) {
            ioex.printStackTrace();
        }
    }
    
}
