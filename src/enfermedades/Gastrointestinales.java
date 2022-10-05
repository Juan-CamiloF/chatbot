package enfermedades;

import java.util.Locale;
import java.util.Scanner;

import static utils.color.*;
import static utils.color.ANSI_RESET;

/**
 * Clase principal de las enfermedades gastrointestinales
 */
public class Gastrointestinales {

    /**
     * Menú de las opciones de frutas para las enfermedades cardiovasculares
     *
     * @param nombre del Usuario
     */
    public static void enfermedadesGastrointestinales(String nombre) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        int resultado;
        do {
            System.out.println("\nLa opción escogida fue: Enfermedades gastrointestinales");
            System.out.println(nombre + " para este tipo de enfermedades tenemos estás opciones para ti");
            System.out.println("-----| Enfermedades gastrointestinales |-----");
            System.out.println("------------------------------------------");
            System.out.println(ANSI_RED + "(1) Frutos rojos" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "(2) Frutos de color claro" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "(3) Frutos tropicales" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "(4) Todas las opciones" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "(5) Mejores recomendaciones" + ANSI_RESET);
            System.out.println("(0 o Volver) Volver al menú principal");
            System.out.println("(10 o Salir) Terminar conversación");
            System.out.println("------------------------------------------");
            System.out.print("Por favor digita la opción por el número indicado en paréntesis" +
                    " o el nombre de la opción: ");
            opcion = sc.nextLine();
            resultado = menuGastrointestinal(opcion);
        } while (resultado != 0);
    }

    /**
     * Implementación de las opciones presentadas en el menú
     *
     * @param opcion
     * @return {int resultado}
     */
    private static int menuGastrointestinal(String opcion) {
        int resultado = palabrasClave(opcion);
        switch (resultado) {
            case 0:
                System.out.println("Serás redireccionado al menú principal");
                break;
            case 1:
                frutosRojos();
                break;
            case 2:
                frutosClaros();
                break;
            case 3:
                frutosTropicales();
                break;
            case 4:
                frutosRojos();
                frutosClaros();
                frutosTropicales();
                break;
            case 5:
                mejorRecomendacion();
                break;
            case 10:
                System.out.println("Gracias por utilizar nuestro servicio");
                System.exit(0);
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
    private static int palabrasClave(String opcion) {
        String opcionFinal = opcion.toLowerCase(Locale.ROOT).trim();
        if (opcionFinal.equals("rojos") || opcionFinal.equals("rojo")
                || opcionFinal.equals("frutos rojos") || opcionFinal.equals("1")) {
            return 1;
        }
        if (opcionFinal.equals("claros") || opcionFinal.equals("claro")
                || opcionFinal.equals("frutos claros") || opcionFinal.equals("2")
                || opcionFinal.equals("frutos color claro") || opcionFinal.equals("frutos color claros")
                || opcionFinal.equals("frutos colores claros") || opcionFinal.equals("color claro")
                || opcionFinal.equals("colores claros")) {
            return 2;
        }
        if (opcionFinal.equals("tropicales") || opcionFinal.equals("frutos tropicales")
                || opcionFinal.equals("tropical") || opcionFinal.equals("3")) {
            return 3;
        }
        if (opcionFinal.equals("todas las opciones") || opcionFinal.equals("todas") || opcionFinal.equals("opciones")
                || opcionFinal.equals("todos") || opcionFinal.equals("4")) {
            return 4;
        }
        if (opcionFinal.equals("mejores recomendaciones") || opcionFinal.equals("recomendaciones")
                || opcionFinal.equals("5") || opcionFinal.equals("mejores") || opcionFinal.equals("mejor")
                || opcionFinal.equals("mejores opciones")) {
            return 5;
        }
        if (opcionFinal.equals("volver") || opcionFinal.equals("menu") || opcionFinal.equals("menú")
                || opcionFinal.equals("menu principal") || opcionFinal.equals("principal") ||
                opcionFinal.equals("menú principal") || opcionFinal.equals("0")) {
            return 0;
        }
        if (opcionFinal.equals("salir") || opcionFinal.equals("terminar conversación")
                || opcionFinal.equals("terminar conversacion") || opcionFinal.equals("terminar")
                || opcionFinal.equals("10")) {
            return 10;
        }
        return 11;
    }

    /**
     * Método para la opción de frutas rojas
     */
    private static void frutosRojos() {
        System.out.println("\nPara las frutas rojas se encuentran las siguientes opciones");
        System.out.println(ANSI_RED + "Manzana roja: " + ANSI_RESET);
        System.out.println("Ofrece una buena cantidad de pectina, además de ácido málico y quercetina. " +
                "Estos dos últimos tienen propiedades antibacterianas y, por lo tanto, inhiben el desarrollo " +
                "de bacterias dentro del estómago.");
        System.out.println(ANSI_RED + "Arándano: " + ANSI_RESET);
        System.out.println("Los fitoquímicos del arándano inciden de forma positiva en la microflora gastrointestinal" +
                " y contribuyen a la salud del huéspedLos fitoquímicos del arándano inciden de forma positiva en la " +
                "microflora gastrointestinal y contribuyen a la salud del huésped.\n");
        System.out.println("Fin de la recomendación.\n");
    }

    /**
     * Método para la opción de frutas claras
     */
    private static void frutosClaros() {
        System.out.println("\nPara las frutas de colores claros se encuentran las siguientes opciones");
        System.out.println(ANSI_CYAN + "Plátano: " + ANSI_RESET);
        System.out.println("Tiene propiedades que ayudan a prevenir las úlceras gástricas y proteger la mucosa " +
                "del intestino, además, sirve para eliminar toxinas del cuerpo.\n");
        System.out.println("Fin de la recomendación.\n");
    }

    /**
     * Método para la opción de frutas tropicales
     */
    private static void frutosTropicales() {
        System.out.println("\nPara las frutas tropicales se encuentran las siguientes opciones");
        System.out.println(ANSI_YELLOW + "Coco: " + ANSI_RESET);
        System.out.println("Tiene propiedades bastante buenas para la salud gastrointestinal, además, ayuda a " +
                "prevenir otras condiciones como la diarrea o el estreñimiento.");
        System.out.println(ANSI_YELLOW + "Papaya: " + ANSI_RESET);
        System.out.println("Es rica en dos enzimas llamadas papaína y quimopapaína que mejoran los niveles de acidez" +
                " en el estómago. También ayudan a descomponer las proteínas que ingerimos a través de la comida.\n");
        System.out.println("Fin de la recomendación.\n");
    }

    /**
     * Método para la opción de mejor recomendación
     */
    private static void mejorRecomendacion() {
        System.out.println("La mejor recomendación de frutas para personas con enfermedades gastrointestinales es: ");
        System.out.println(ANSI_RED + "Manzana roja: " + ANSI_RESET);
        System.out.println("Ofrece una buena cantidad de pectina, además de ácido málico y quercetina. " +
                "Estos dos últimos tienen propiedades antibacterianas y, por lo tanto, inhiben el desarrollo " +
                "de bacterias dentro del estómago.");
        System.out.println(ANSI_RED + "Arándano: " + ANSI_RESET);
        System.out.println("Los fitoquímicos del arándano inciden de forma positiva en la microflora gastrointestinal" +
                " y contribuyen a la salud del huéspedLos fitoquímicos del arándano inciden de forma positiva en la " +
                "microflora gastrointestinal y contribuyen a la salud del huésped.");
        System.out.println(ANSI_YELLOW + "Papaya: " + ANSI_RESET);
        System.out.println("Es rica en dos enzimas llamadas papaína y quimopapaína que mejoran los niveles de acidez" +
                " en el estómago. También ayudan a descomponer las proteínas que ingerimos a través de la comida.\n");
    }
}
