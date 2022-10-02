package enfermedades;

import java.util.Locale;
import java.util.Scanner;

import static colores.color.*;
import static colores.color.ANSI_RESET;

public class Gastrointestinales {

    public static void enfermedadesGastrointestinales(String nombre) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nLa opción escogida fue: Enfermedades gastrointestinales");
        System.out.println(nombre + " para este tipo de enfermedades tenemos estás opciones para ti");
        String opcion;
        int resultado;
        do {
            System.out.println("-----| Enfermedades gastrointestinales |-----");
            System.out.println("------------------------------------------");
            System.out.println(ANSI_RED + "(1) Frutos rojos" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "(2) Frutos de color claro" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "(3) Frutos tropicales" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "(4) Todas las opciones" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "(5) Mejores recomendaciones" + ANSI_RESET);
            System.out.println("(0) Volver al menu principal");
            System.out.println("(10) Terminar conversación");
            System.out.println("------------------------------------------");
            System.out.print("Por favor digita la opción por el número indicado en paréntesis" +
                    " o el nombre de la opción: ");
            opcion = sc.nextLine();
            resultado = menuGastrointestinal(opcion);
        } while (resultado != 0);
    }

    public static int menuGastrointestinal(String opcion) {
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

    public static int palabrasClave(String opcion) {
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

    public static void frutosRojos() {
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

    public static void frutosClaros() {
        System.out.println("\nPara las frutas de colores claros se encuentran las siguientes opciones");
        System.out.println(ANSI_CYAN + "Plátano: " + ANSI_RESET);
        System.out.println("Tiene propiedades que ayudan a prevenir las úlceras gástricas y proteger la mucosa " +
                "del intestino, además, sirve para eliminar toxinas del cuerpo.\n");
        System.out.println("Fin de la recomendación.\n");
    }

    public static void frutosTropicales() {
        System.out.println("\nPara las frutas tropicales se encuentran las siguientes opciones");
        System.out.println(ANSI_YELLOW + "Coco: " + ANSI_RESET);
        System.out.println("Tiene propiedades bastante buenas para la salud gastrointestinal, además, ayuda a " +
                "prevenir otras condiciones como la diarrea o el estreñimiento.");
        System.out.println(ANSI_YELLOW + "Papaya: " + ANSI_RESET);
        System.out.println("Es rica en dos enzimas llamadas papaína y quimopapaína que mejoran los niveles de acidez" +
                " en el estómago. También ayudan a descomponer las proteínas que ingerimos a través de la comida.\n");
        System.out.println("Fin de la recomendación.\n");
    }

    public static void mejorRecomendacion() {
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
