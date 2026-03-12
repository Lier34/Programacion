package Vista;

import java.util.Scanner;

public class MenuPrincipal {

    Scanner sc = new Scanner(System.in);

    public void iniciar() {

        int opcion;

        do {

            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Gestión de vuelos");
            System.out.println("2. Gestión de pasajeros");
            System.out.println("0. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    MenuVuelos mv = new MenuVuelos();
                    mv.menu();
                    break;

                case 2:
                    MenuPasajeros mp = new MenuPasajeros();
                    mp.menu();
                    break;
            }

        } while (opcion != 0);
    }
}