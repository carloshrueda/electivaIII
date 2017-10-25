package JavaBasico;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

public class parcialProgramacion1 {

    public static void imprimirVec(String[] v, int i, int f, String msg) {
        System.out.printf("%n%s%n", msg);
        for (int k = i; k < f; k++) {
            System.out.printf("%3d -> %3s%n", k + 1, v[k]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] vEstudiantes = {"BAYONA PARRA JULIAN GERARDO",
            "BUENO FLAUTERO ANGIE NATALIA",
            "ESPINOSA FORERO ROBINSON JAVIER",
            "FERREIRA CELIS FABIAN GILBERTO",
            "GALAN BAUTISTA JHON ALESSANDRO",
            "GARCIA SANCHEZ FABIAN STIVEN",
            "GARCIA VILLAREAL ANDREA CAMILA",
            "HERNANDEZ MARIN PAOLA ANDREA",
            "JIMENEZ DUARTE ALEJANDRO",
            "LANDINEZ CAÑAS MICHELLE DAYANNA",
            "LEON PIMIENTO ELIZABETH",
            "LUCENA DURAN LUIS ANGEL",
            "MENDOZA DELGADO DAMARIS YURLEY",
            "ORTIZ MENDEZ JULIETH NATALIA",
            "PARRA HERRERA LESLIE GISELLA",
            "PIÑERES MALAVER ANDREY GERARDO",
            "QUINTERO BADILLO ANGIE MARCELA",
            "RAMBAUT SALAZAR RAY CARMELO",
            "RODRIGUEZ MATITUY ANGIE PAOLA",
            "ROJAS BELTRÁN JOSE LUIS",
            "ROMERO JIMENEZ JHON ALEXANDER",
            "TOLOZA VASQUEZ CAMILO ANDRES",
            "VELILLA ZAPATA JHOFER ALEXANDER"
        };

        int i;
        final int tam = vEstudiantes.length / 2;
        String[] vPrimeraFecha = new String[tam];
        //String[] vSegundaFecha2 = new String[vEstudiantes.length - tam];
        ArrayList<String> vSegundaFecha
                = new ArrayList<String>(vEstudiantes.length - tam + 1);
        int p;

        SecureRandom r;
        try {
            r = SecureRandom.getInstance("SHA1PRNG");

            //Encontrando estudiantes que presentan en primera fecha
            for (i = 0; i < tam; ++i) {
                p = r.nextInt(vEstudiantes.length - i);
                vPrimeraFecha[i] = vEstudiantes[p];
                vEstudiantes[p] = vEstudiantes[vEstudiantes.length - 1 - i];
                vEstudiantes[vEstudiantes.length - 1 - i] = vPrimeraFecha[i];
            }

            Arrays.sort(vPrimeraFecha);
            imprimirVec(vPrimeraFecha, 0, vPrimeraFecha.length,
                    "Estudiantes primera fecha");
            System.out.println("------------------------------\n");

            //Encontrando estudiantes que presentan en segunda fecha
            for (i = 0; i < vEstudiantes.length; ++i) {
                //Buscar si se encuentra en la primera fecha
                p = Arrays.binarySearch(vPrimeraFecha, vEstudiantes[i]);
                if (p < 0) {
                    //si no esta en la primera fecha se agrega
                    vSegundaFecha.add(vEstudiantes[i]);
                }
            }
            vSegundaFecha.sort(null);
            System.out.println("Estudiantes segunda fecha");
            for (i = 0; i < vSegundaFecha.size(); ++i) {
                System.out.printf("%3d -> %3s%n", i + 1, vSegundaFecha.get(i));
            }
            System.out.println("------------------------------\n");
            System.out.println("Total estudiantes: "
                    + (vPrimeraFecha.length + vSegundaFecha.size())
                    + "\n");

        } catch (NoSuchAlgorithmException ex) {
            System.err.println(Dados.class.getName() + "\n" + ex.getMessage());
        }
    }
}
