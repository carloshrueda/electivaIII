/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prarchivos;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

/**
 *
 * @author ESTUDIANTE
 */
public class EscribirArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileOutputStream os = new FileOutputStream("dataFile.txt", false);
            PrintWriter pw= new PrintWriter(os);
            
            pw.print("CS130: ");
            pw.print(95);
            pw.print("Letra del grado: ");
            pw.print('A');
            pw.print("Nota actual: ");
            pw.print(3.68);
            pw.close();
            System.out.println("Archivo escrito");
        } catch (FileNotFoundException ex) {
            System.out.println("Error. No se pudo escribir en el archivo dataFile.txt\n" + ex.getMessage());
        }
    }
    
}
