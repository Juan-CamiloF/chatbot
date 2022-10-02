package enfermedades;

import java.util.Locale;
import java.util.Scanner;

import static colores.color.*;

public class Cardiovasculares {

    public static void enfermedadesCardiovasculares(String nombre) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nLa opción escogida fue: Enfermedades cardiovasculares");
        System.out.println(nombre + " para este tipo de enfermedades tenemos estás opciones para ti");
        String opcion;
        int resultado;
        do {
            System.out.println("-----| Enfermedades cardiovasculares |-----");
            System.out.println("------------------------------------------");
            System.out.println(ANSI_RED + "(1) Frutos rojos" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "(2) Frutos verdes" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "(3) Frutos morados" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "(4) Frutos de color claro" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "(5) Todas las opciones" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "(6) Mejores recomendaciones" + ANSI_RESET);
            System.out.println("(0 o Volver) Volver al menú principal");
            System.out.println("(10 o Salir) Terminar conversación");
            System.out.println("------------------------------------------");
            System.out.print("Por favor digita la opción por el número indicado en paréntesis" +
                    "o el nombre de la opción: ");
            opcion = sc.nextLine();
            resultado = menuCardiovascular(opcion);
        } while (resultado != 0);
    }

    public static int menuCardiovascular(String opcion) {
        int resultado = palabrasClave(opcion);
        switch (resultado) {
            case 0:
                System.out.println("Serás redireccionado al menú principal");
                break;
            case 1:
                frutosRojos();
                break;
            case 2:
                frutosVerdes();
                break;
            case 3:
                frutosMorados();
                break;
            case 4:
                frutosClaros();
                break;
            case 5:
                frutosRojos();
                frutosVerdes();
                frutosMorados();
                frutosClaros();
                break;
            case 6:
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
        if (opcionFinal.equals("verdes") || opcionFinal.equals("verde")
                || opcionFinal.equals("frutos verdes") || opcionFinal.equals("2")) {
            return 2;
        }
        if (opcionFinal.equals("morados") || opcionFinal.equals("morado")
                || opcionFinal.equals("morada") || opcionFinal.equals("moradas")
                || opcionFinal.equals("frutos morados") || opcionFinal.equals("3")) {
            return 3;
        }
        if (opcionFinal.equals("claros") || opcionFinal.equals("claro")
                || opcionFinal.equals("frutos claros") || opcionFinal.equals("4")
                || opcionFinal.equals("frutos color claro") || opcionFinal.equals("frutos color claros")
                || opcionFinal.equals("frutos colores claros") || opcionFinal.equals("color claro")
                || opcionFinal.equals("colores claros")) {
            return 4;
        }
        if (opcionFinal.equals("todas las opciones") || opcionFinal.equals("todas") || opcionFinal.equals("opciones")
                || opcionFinal.equals("todos") || opcionFinal.equals("5")) {
            return 5;
        }
        if (opcionFinal.equals("mejores recomendaciones") || opcionFinal.equals("recomendaciones")
                || opcionFinal.equals("6") || opcionFinal.equals("mejores") || opcionFinal.equals("mejor")
                || opcionFinal.equals("mejores opciones")) {
            return 6;
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
        System.out.println("Contribuyen a la dilatación de las arterias, protegen la capa interior de los " +
                "vasos sanguíneos y ayuda a controlar la tensión arterial.");
        System.out.println(ANSI_RED + "Manzana roja: " + ANSI_RESET);
        System.out.println("Ayuda a reducir el colesterol alto, los niveles de azúcar en sangre y el riesgo de " +
                "padecer alguna enfermedad cardiovascular.\n");
        System.out.println("Fin de la recomendación.\n");
    }

    public static void frutosVerdes() {
        System.out.println("\nPara las frutas verdes se encuentran las siguientes opciones");
        System.out.println(ANSI_GREEN + "Kiwi: " + ANSI_RESET);
        System.out.println("Es un protector de las arterias y capilares, además, ayuda a reducir la tensión arterial.");
        System.out.println(ANSI_GREEN + "Manzana verde: " + ANSI_RESET);
        System.out.println("Ayuda con los nutrientes esenciales para el control de la tensión arterial y los niveles " +
                "de colesterol.");
        System.out.println(ANSI_GREEN + "Pera: " + ANSI_RESET);
        System.out.println("Ayuda como antioxidante para disminuir la rigidez de los tejidos cardíacos, disminuye el " +
                "nivel del colesterol malo que se pega en las arterias,\nademás, la piel de la pera tiene nutrientes" +
                " para la disminución de la inflamación, la presión sanguínea y los niveles de colesterol malo.\n");
        System.out.println("Fin de la recomendación.\n");

    }

    public static void frutosMorados() {
        System.out.println("\nPara las frutas moradas se encuentran las siguientes opciones");
        System.out.println(ANSI_PURPLE + "Ciruela: " + ANSI_RESET);
        System.out.println("Tiene una gran cantidad de potasio que ayuda a reducir la presión arterial.");
        System.out.println(ANSI_PURPLE + "Higo: " + ANSI_RESET);
        System.out.println("Tiene fuentes de omega que ayuda a regular la presión arterial y reducir el riesgo " +
                "de sufrir problemas cardiovasculares.");
        System.out.println(ANSI_PURPLE + "Grosella negra: " + ANSI_RESET);
        System.out.println("Tienen una gran cantidad de potasio que ayuda a reducir la presión arterial y ayuda a las" +
                " células de corazón a resistir daños y ralentiza la acumulación de plaquetas en los vasos sanguíneos.\n");
        System.out.println("Fin de la recomendación.\n");
    }

    public static void frutosClaros() {
        System.out.println("\nPara las frutas de color claro se encuentran las siguientes opciones");
        System.out.println(ANSI_CYAN + "Melocotón: " + ANSI_RESET);
        System.out.println("Tienen altos contenidos de fibras, potasio y vitamina C las cuales ayudan a disminuir la " +
                "permeabilidad de los capilares y aumentar la resistencia, mejorando la microcirculación venosa.");
        System.out.println(ANSI_CYAN + "Plátano: " + ANSI_RESET);
        System.out.println("El plátano reduce el riesgo de enfermedad cardiovascular gracias a su alto grado de potasio " +
                "que tiene un importante control de la presión control.\n");
        System.out.println("Fin de la recomendación.\n");
    }

    public static void mejorRecomendacion() {
        System.out.println("La mejor recomendación de frutas para personas con enfermedades cardiovasculares es: ");
        System.out.println(ANSI_GREEN + "Pera: " + ANSI_RESET);
        System.out.println("Ayuda como antioxidante para disminuir la rigidez de los tejidos cardíacos, disminuye el " +
                "nivel del colesterol malo que se pega en las arterias,\nademás, la piel de la pera tiene nutrientes" +
                " para la disminución de la inflamación, la presión sanguínea y los niveles de colesterol malo.");
        System.out.println(ANSI_PURPLE + "Grosella negra: " + ANSI_RESET);
        System.out.println("Tienen una gran cantidad de potasio que ayuda a reducir la presión arterial y ayuda a las" +
                " células de corazón a resistir daños y ralentiza la acumulación de plaquetas en los vasos sanguíneos.");
        System.out.println(ANSI_CYAN + "Melocotón: " + ANSI_RESET);
        System.out.println("Tienen altos contenidos de fibras, potasio y vitamina C las cuales ayudan a disminuir la " +
                "permeabilidad de los capilares y aumentar la resistencia, mejorando la microcirculación venosa.\n");
    }
}
