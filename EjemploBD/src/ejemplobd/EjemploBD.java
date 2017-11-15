/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author CRUEDA
 */
public class EjemploBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection cnx = null;
        String url = "jdbc:mysql://sql10.freesqldatabase.com/";
        String dbName = "sql10203686";
        String userName = "sql10203686";
        String password = "MuAlLXKl7E";

        //Conexion a la base de datos
        if (cnx == null) {
            try {
                //Inicializar el Driver
                Class.forName("com.mysql.jdbc.Driver");

                // Establecemos la conexión con la base de datos. 
                cnx = DriverManager.getConnection(url + dbName, userName, password);
                System.out.println(">> Conexión exitosa con la bd. <<\n\n");

            } catch (SQLException ex) {
                System.err.println("Error conectado la base de datos." + ex.getMessage());
                ex.printStackTrace();
                return;
            } catch (ClassNotFoundException ex) {
                System.err.println("Error conectado la base de datos." + ex.getMessage());
                ex.printStackTrace();
                return;
            }

            //Listar los 10 paises con más habitantes
            try {
                // Se crea un Statement, para realizar la consulta
                Statement s = cnx.createStatement();

                // Se realiza la consulta. Los resultados se guardan en el 
                // ResultSet rs
                ResultSet rs = s.executeQuery("select Name, Region, Population "
                    + "from Country "
                    + "order by Population desc "
                    + "limit 10;");

                // Se recorre el ResultSet, mostrando por pantalla los resultados.
                System.out.printf("%-25s%-30s%s%n",
                        "Nombre",
                        "Region",
                        "Poblacion");
                System.out.println("----------------------------------------------------------------");
                while (rs.next()) {
                    System.out.printf("%-25s%-30s%,d%n",
                        rs.getString("Name"),
                        rs.getString(2),
                        rs.getInt(3));

                }
            } catch (SQLException ex) {
                System.err.println("Error en la consulta a la base de datos." + ex.getMessage());
                ex.printStackTrace();
            }
        }

        //Cerrar conexión a base de datos
        if (cnx != null) {
            try {
                cnx.close();
                System.out.println("\n\n>> Cierre exitoso de la bd. <<");
            } catch (SQLException ex) {
                System.err.println("Error cerrando la base de datos." + ex.getMessage());
                ex.printStackTrace();
                return;
            }
        }
    }

}
