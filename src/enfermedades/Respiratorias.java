package enfermedades;

import java.util.Locale;
import java.util.Scanner;

import static utils.color.*;
import static utils.color.ANSI_RESET;

public class Respiratorias {

    /**
     * Menú de las opciones de frutas para las enfermedades cardiovasculares
     *
     * @param nombre del Usuario
     */
    public static void enfermedadesRespiratorias(String nombre) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        int resultado;
        do {
            System.out.println("\nLa opción escogida fue: Enfermedades respiratorias");
            System.out.println(nombre + " para este tipo de enfermedades tenemos estás opciones para ti");
            System.out.println("-----| Enfermedades respiratorias |-----");
            System.out.println("------------------------------------------");
            System.out.println(ANSI_GREEN + "(1) Frutos cítricos" + ANSI_RESET);
            System.out.println(ANSI_RED + "(2) Frutos rojos" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "(3) Todas las opciones" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "(4) Mejores recomendaciones" + ANSI_RESET);
            System.out.println("(0 o Volver) Volver al menú principal");
            System.out.println("(10 o Salir) Terminar conversación");
            System.out.println("------------------------------------------");
            System.out.print("Por favor digita la opción por el número indicado en paréntesis" +
                    "o el nombre de la opción: ");
            opcion = sc.nextLine();
            resultado = menuRespiratorio(opcion);
        } while (resultado != 0);
    }

    /**
     * Implementación de las opciones presentadas en el menú
     *
     * @param opcion
     * @return {int resultado}
     */
    private static int menuRespiratorio(String opcion) {
        int resultado = palabrasClave(opcion);
        switch (resultado) {
            case 0:
                System.out.println("Serás redireccionado al menú principal");
                break;
            case 1:
                frutosCitricos();
                break;
            case 2:
                frutosRojos();
                break;
            case 3:
                frutosCitricos();
                frutosRojos();
                break;
            case 4:
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
        if (opcionFinal.equals("citricos") || opcionFinal.equals("cítricos")
                || opcionFinal.equals("citrico") || opcionFinal.equals("cítrico")
                || opcionFinal.equals("frutos citricos") || opcionFinal.equals("1")
                || opcionFinal.equals("frutos cítricos")) {
            return 1;
        }
        if (opcionFinal.equals("rojos") || opcionFinal.equals("rojo")
                || opcionFinal.equals("frutos rojos") || opcionFinal.equals("2")) {
            return 2;
        }
        if (opcionFinal.equals("todas las opciones") || opcionFinal.equals("todas") || opcionFinal.equals("opciones")
                || opcionFinal.equals("todos") || opcionFinal.equals("3")) {
            return 3;
        }
        if (opcionFinal.equals("mejores recomendaciones") || opcionFinal.equals("recomendaciones")
                || opcionFinal.equals("4") || opcionFinal.equals("mejores") || opcionFinal.equals("mejor")
                || opcionFinal.equals("mejores opciones")) {
            return 4;
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
     * Método para la opción de frutas cítricas
     */
    private static void frutosCitricos() {
        System.out.println("\nPara las frutas cítricas se encuentran las siguientes opciones");
        System.out.println(ANSI_GREEN + "Naranja: " + ANSI_RESET);
        System.out.println("Tienen altos grados de vitamina C y antioxidantes que permiten evitar " +
                "la inflamación de los pulmones.");
        System.out.println(ANSI_GREEN + "Limón: " + ANSI_RESET);
        System.out.println("Tiene un alto contenido en vitamina C, es perfecto para limpiar los pulmones.");
        System.out.println(ANSI_GREEN + "Pomelo: " + ANSI_RESET);
        System.out.println("Tienen alto grados de vitamina A y C que ayudan a mantener el bienestar de las células " +
                "mocosas que recubren las vías respiratorias y el tracto respiratorio.");
        System.out.println(ANSI_GREEN + "Mandarina: " + ANSI_RESET);
        System.out.println("Tienen altos grados de flavonoides, ácidos cítricos y vitaminas A y C y licopeno que " +
                "cuidan la salud pulmonar y reducción del riesgo de una enfermedad pulmonar.\n");
        System.out.println("Fin de la recomendación.\n");

    }

    /**
     * Método para la opción de frutas rojas
     */
    private static void frutosRojos() {
        System.out.println("\nPara las frutas rojas se encuentran las siguientes opciones");
        System.out.println(ANSI_RED + "Fresa: " + ANSI_RESET);
        System.out.println("Tienen un alto grado de vitamina C ayudando a mantener la salud de los pulmones");
        System.out.println(ANSI_RED + "Manzana roja: " + ANSI_RESET);
        System.out.println("Ayudan a aumentar la función pulmonar y la reducción de las sibilancias, además, tiene " +
                "nutrientes para la protección de las vías respiratorias.");
        System.out.println("Fin de la recomendación.\n");

    }

    /**
     * Método para la opción de mejor recomendación
     */
    private static void mejorRecomendacion() {
        System.out.println("La mejor recomendación de frutas para personas con enfermedades cardiovasculares es: ");
        System.out.println(ANSI_RED + "Manzana roja: " + ANSI_RESET);
        System.out.println("Ayudan a aumentar la función pulmonar y la reducción de las sibilancias, además, tiene " +
                "nutrientes para la protección de las vías respiratorias.");
        System.out.println(ANSI_GREEN + "Naranja: " + ANSI_RESET);
        System.out.println("Tienen altos grados de vitamina C y antioxidantes que permiten evitar " +
                "la inflamación de los pulmones.");
        System.out.println(ANSI_GREEN + "Pomelo: " + ANSI_RESET);
        System.out.println("Tienen alto grados de vitamina A y C que ayudan a mantener el bienestar de las células " +
                "mocosas que recubren las vías respiratorias y el tracto respiratorio.");
        System.out.println(ANSI_GREEN + "Mandarina: " + ANSI_RESET);
        System.out.println("Tienen altos grados de flavonoides, ácidos cítricos y vitaminas A y C y licopeno que " +
                "cuidan la salud pulmonar y reducción del riesgo de una enfermedad pulmonar.");
        System.out.println("Fin de la recomendación.\n");
    }
}
