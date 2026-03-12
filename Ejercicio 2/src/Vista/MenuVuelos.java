package Vista;

import Controlador.ControladorVuelo;
import Modelo.Vuelo;
import Utilidades.EntradaDatos;

import java.util.Scanner;

public class MenuVuelos {

    Scanner sc = new Scanner(System.in);
    ControladorVuelo controlador = new ControladorVuelo();

    public void menu() {

        int opcion;

        do {

            System.out.println("\n--- MENÚ VUELOS ---");
            System.out.println("1. Alta vuelo");
            System.out.println("2. Baja vuelo");
            System.out.println("3. Modificar vuelo");
            System.out.println("4. Consultar vuelo por código");
            System.out.println("5. Vuelos por destino");
            System.out.println("6. Vuelos por origen");
            System.out.println("7. Vuelos por fecha");
            System.out.println("8. Lista de pasajeros de un vuelo");
            System.out.println("0. Volver");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    String codigo = EntradaDatos.leerCodigoVuelo();
                    String origen = EntradaDatos.leerTexto("Origen:");
                    String destino = EntradaDatos.leerTexto("Destino:");
                    String fecha = EntradaDatos.leerTexto("Fecha:");

                    Vuelo vuelo = new Vuelo(codigo, origen, destino, fecha);

                    controlador.insertarVuelo(vuelo);

                    break;

                case 2:

                    String cod = EntradaDatos.leerCodigoVuelo();
                    controlador.eliminarVuelo(cod);

                    break;

                case 4:

                    String c = EntradaDatos.leerCodigoVuelo();
                    controlador.consultarVuelo(c);

                    break;
            }

        } while (opcion != 0);
    }
}