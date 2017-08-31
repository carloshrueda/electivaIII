package JavaBasico;

import javax.swing.JOptionPane;

/**
 *
 * @author CRUEDA
 */
public class GUIBasico {
    public static void main(String[] args) {
        //Desplegando mensajes
        JOptionPane.showMessageDialog(null, "Bienvenido a Java");
        
        JOptionPane.showMessageDialog(null, "Hola todos", "GUIBásico", 
            JOptionPane.INFORMATION_MESSAGE);
        
        //Leyendo entrada
        String nombre= JOptionPane.showInputDialog("Cuá es su nombre?");
        String mensaje= String.format("Bienvenido, %s, a la programación Java", nombre);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
