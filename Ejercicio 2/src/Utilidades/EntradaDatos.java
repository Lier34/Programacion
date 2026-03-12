package Utilidades;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EntradaDatos {

    private static Scanner sc = new Scanner(System.in);

    public static String leerCodigoVuelo() {

        String codigo;

        while (true) {

            try {

                System.out.println("Introduce código de vuelo (AAA1-00000): ");
                codigo = sc.nextLine();

                if (!Pattern.matches("[A-Z]{3}[0-9]-[0-9]{5}", codigo)) {
                    throw new Exception("Formato de código incorrecto");
                }

                return codigo;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static String leerDNI() {

        String dni;

        while (true) {

            try {

                System.out.println("Introduce DNI: ");
                dni = sc.nextLine();

                if (!Pattern.matches("[0-9]{8}[A-Z]", dni)) {
                    throw new Exception("Formato DNI incorrecto");
                }

                return dni;

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static String leerTexto(String mensaje) {

        System.out.println(mensaje);
        return sc.nextLine();
    }
}
