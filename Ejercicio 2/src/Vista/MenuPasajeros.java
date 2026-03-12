package Vista;

import Controlador.ControladorPasajero;
import Modelo.Pasajero;
import Utilidades.EntradaDatos;

import java.util.Scanner;

public class MenuPasajeros {

    Scanner sc = new Scanner(System.in);
    ControladorPasajero controlador = new ControladorPasajero();

    public void menu() {

        int opcion;

        do {

            System.out.println("\n--- MENÚ PASAJEROS ---");
            System.out.println("1. Alta pasajero");
            System.out.println("2. Baja pasajero");
            System.out.println("3. Modificar pasajero");
            System.out.println("4. Consultar pasajero por DNI");
            System.out.println("5. Vuelo de un pasajero");
            System.out.println("0. Volver");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    String dni = EntradaDatos.leerDNI();
                    String nombre = EntradaDatos.leerTexto("Nombre:");
                    String apellido = EntradaDatos.leerTexto("Apellido:");
                    String vuelo = EntradaDatos.leerCodigoVuelo();

                    Pasajero p = new Pasajero(dni, nombre, apellido, vuelo);

                    controlador.insertarPasajero(p);

                    break;

                case 4:

                    String d = EntradaDatos.leerDNI();
                    controlador.consultarPasajero(d);

                    break;
            }

        } while (opcion != 0);
    }
}
