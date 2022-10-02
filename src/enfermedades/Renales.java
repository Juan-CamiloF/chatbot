package enfermedades;

import java.util.Locale;
import java.util.Scanner;

import static colores.color.*;
import static colores.color.ANSI_RESET;

public class Renales {
    public static void enfermedadesRenales(String nombre) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nLa opción escogida fue: Enfermedades renales");
        System.out.println(nombre + " para este tipo de enfermedades tenemos estás opciones para ti");
        String opcion;
        int resultado;
        do {
            System.out.println("-----| Enfermedades renales |-----");
            System.out.println("------------------------------------------");
            System.out.println(ANSI_RED + "(1) Frutos rojos" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "(2) Frutos de color claro" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "(3) Todas las opciones" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "(4) Mejores recomendaciones" + ANSI_RESET);
            System.out.println("(0) Volver al menu principal");
            System.out.println("(10) Terminar conversación");
            System.out.println("------------------------------------------");
            System.out.print("Por favor digita la opción por el número indicado en paréntesis" +
                    "o el nombre de la opción: ");
            opcion = sc.nextLine();
            resultado = menuRenal(opcion);
        } while (resultado != 0);
    }

    public static int menuRenal(String opcion) {
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
                frutosRojos();
                frutosClaros();
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


    public static void frutosRojos() {
        System.out.println("\nPara las frutas rojas se encuentran las siguientes opciones");
        System.out.println(ANSI_RED + "Fresa: " + ANSI_RESET);
        System.out.println("Tienen un alto grado de vitamina C ayudando prevenir la oxidación del cuerpo " +
                "y mantener saludables lo riñones.");
        System.out.println(ANSI_RED + "Arándano: " + ANSI_RESET);
        System.out.println("Ayuda a mantener los riñones desintoxicados y mantener la vejiga limpia.");
        System.out.println(ANSI_RED + "Sandia: " + ANSI_RESET);
        System.out.println("Es la mejor recomendación para enfermedades renales, ya que contiene propiedades que ayudan" +
                " a la limpieza de los tejidos y flujo sanguíneo y, por ende, beneficia a las funciones de los riñones.");
        System.out.println(ANSI_RED + "Manzana roja: " + ANSI_RESET);
        System.out.println("Contienen propiedades diuréticas que son ideales para la depuración de los riñones, " +
                "para favorecer los procesos y las funciones renales.\n");
        System.out.println("Fin de la recomendación.\n");

    }

    public static void frutosClaros() {
        System.out.println("\nPara las frutas de color claro se encuentran las siguientes opciones");
        System.out.println(ANSI_CYAN + "Melocotón: " + ANSI_RESET);
        System.out.println("Aumenta la actividad secretora de las glándulas digestivas y facilita la digestión de " +
                "los alimentos altos en grasas. Además, es rico en potasio, por lo que cuida también de los riñones.");
        System.out.println(ANSI_CYAN + "Piña: " + ANSI_RESET);
        System.out.println("Contiene altos grados de vitamina C, potasio y bromelina. Esta última tiene efectos " +
                "antiinflamatorios y diuréticos, y contribuye a eliminar las toxinas a través de la orina. " +
                "La piña combate las infecciones y la inflamación en los riñones.");
        System.out.println(ANSI_CYAN + "Plátano: " + ANSI_RESET);
        System.out.println("Contiene altos grados de potasio, elemento fundamental para aumentar la producción de " +
                "orina. Su fibra dietética insoluble, que incluye celulosa y fibra, contribuyen al funcionamiento " +
                "normal del intestino.\n");
        System.out.println("Fin de la recomendación.\n");
    }

    public static void mejorRecomendacion() {
        System.out.println("La mejor recomendación de frutas para personas con enfermedades renales es: ");
        System.out.println(ANSI_RED + "Sandia: " + ANSI_RESET);
        System.out.println("Es la mejor recomendación para enfermedades renales ya que contiene propiedades que ayudan" +
                " a la limpieza de los tejidos y flujo sanguíneo y, por ende, beneficia a las funciones de los riñones.");
        System.out.println(ANSI_CYAN + "Piña: " + ANSI_RESET);
        System.out.println("Contiene altos grados de vitamina C, potasio y bromelina. Esta última tiene efectos " +
                "antiinflamatorios y diuréticos, y contribuye a eliminar las toxinas a través de la orina. " +
                "La piña combate las infecciones y la inflamación en los riñones.");
        System.out.println(ANSI_CYAN + "Plátano: " + ANSI_RESET);
        System.out.println("Contiene altos grados de potasio, elemento fundamental para aumentar la producción de " +
                "orina. Su fibra dietética insoluble, que incluye celulosa y fibra, contribuyen al funcionamiento " +
                "normal del intestino.\n");
    }
}
