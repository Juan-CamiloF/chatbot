import java.util.Locale;
import java.util.Scanner;

import static enfermedades.Cardiovasculares.enfermedadesCardiovasculares;
import static enfermedades.Gastrointestinales.enfermedadesGastrointestinales;
import static enfermedades.Renales.enfermedadesRenales;
import static enfermedades.Respiratorias.enfermedadesRespiratorias;

/**
 * @author Juan Camilo Fandiño Benavides
 * &
 * @author Andres Felipe Guerrero Leal
 * <p>
 * Clase principal del chatbot que aconseja frutas para diversar enfermedades en general
 */
public class Chatbot {

    /**
     * Método main
     *
     * @param args
     */
    public static void main(String[] args) {
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("------| Bienvenido al chatbot que aconseja" +
                " frutas para distintos tipos de enfermedades |------");
        System.out.print("Por favor, queremos saber tu nombre: ");
        nombre = sc.nextLine();
        menu(nombre);
    }

    /**
     * Menu principal para mostrar las opciones
     *
     * @param nombre del Usuario
     */
    public static void menu(String nombre) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        int resultado;
        do {
            System.out.println("\n" + nombre + " tenemos estas opciones para ti");
            System.out.println("------------------------------------------");
            System.out.println("(1) Enfermedades cardiovasculares ");
            System.out.println("(2) Enfermedades respiratorias ");
            System.out.println("(3) Enfermedades renales ");
            System.out.println("(4) Enfermedades gastrointestinales ");
            System.out.println("(0 o Salir) Terminar conversación ");
            System.out.println("------------------------------------------");
            System.out.print("Por favor digita la opción por el número indicado en paréntesis o el nombre de las " +
                    "enfermedades: ");
            opcion = sc.nextLine();
            resultado = opciones(opcion, nombre);
        } while (resultado != 0);
    }

    /**
     * Implementación de las opciones presentadas en el menú
     *
     * @param opcion escogida en el menú
     * @param nombre nombre del Usuario
     * @return {int resultado}
     */
    public static int opciones(String opcion, String nombre) {
        int resultado = palabrasClave(opcion);
        switch (resultado) {
            case 0:
                System.out.println("Gracias por utilizar nuestro servicio");
                break;
            case 1:
                enfermedadesCardiovasculares(nombre);
                break;
            case 2:
                enfermedadesRespiratorias(nombre);
                break;
            case 3:
                enfermedadesRenales(nombre);
                break;
            case 4:
                enfermedadesGastrointestinales(nombre);
                break;
            default:
                System.out.println("Por favor digita una opción válida");
                break;
        }
        return resultado;
    }

    /**
     * Clasificación de las palabras claves en opciones númericas
     *
     * @param opcion
     * @return {int resultado}
     */
    public static int palabrasClave(String opcion) {
        String opcionFinal = opcion.toLowerCase(Locale.ROOT).trim();
        if (opcionFinal.equals("cardiovasculares") || opcionFinal.equals("cardiovascular")
                || opcionFinal.equals("1")) {
            return 1;
        }
        if (opcionFinal.equals("respiratorias") || opcionFinal.equals("respiratoria") ||
                opcionFinal.equals("respiratorio") || opcionFinal.equals("2")) {
            return 2;
        }
        if (opcionFinal.equals("renales") || opcionFinal.equals("renal") || opcionFinal.equals("3")) {
            return 3;
        }
        if (opcionFinal.equals("gastrointestinales") || opcionFinal.equals("gastrointestinal")
                || opcionFinal.equals("4")) {
            return 4;
        }
        if (opcionFinal.equals("salir") || opcionFinal.equals("terminar") || opcionFinal.equals("0")) {
            return 0;
        }
        return 10;
    }
}
