import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe un nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Escribe un numero de telefono (xxx xx xx xx): ");
        String telefono = scanner.nextLine();

        System.out.print("Quieres introducir mas alumnos? (si/no): ");
        String respuesta = scanner.nextLine();

        if(respuesta.equalsIgnoreCase("si")) {
            main(args);

        }else if(respuesta.equalsIgnoreCase("no")) {
            System.out.println("-- MENU --");

        }else {
            System.out.println("Respuesta no valida.");
        }
        scanner.close();

        System.out.println("1. Añadir otro numero");
        System.out.println("2. Borrar un numero");
        System.out.println("3. Buscar un numero ");
        System.out.println("4. Borrar un nombre");
        System.out.println("5. Buscar un nombre");
        System.out.println("6. Salir");
        System.out.print("Elige una opcion: ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.print("Añade otro numero: ");
            String otroNumero = scanner.next();

            System.out.println("Numero añadido con exito");

        } else if (opcion == 2) {
            System.out.print("Elige el numero que quieras borrar: ");
            String numeroBorrar = scanner.next();

            if (numeroBorrar.equals(telefono)) {
                System.out.println("Numero borrado con exito");
            } else {
                System.out.println("El numero no existe");
            }

        } else if (opcion == 3) {
            System.out.print("Escribe el numero que quieras buscar: ");
            String numeroBuscar = scanner.next();

            if (telefono.equals(scanner.next())) {
                System.out.println("El numero que buscas es : " + numeroBuscar);
            } else {
                System.out.println("El numero no existe");
            }

        } else if (opcion == 4) {
            System.out.print("Escribe el nombre que quieras borrar: ");
            String nombreBorrar = scanner.next();

            if (nombre.equals(scanner.next())) {
                System.out.println("Nombre borrado con exito");
            } else {
                System.out.println("El nombre no existe");
            }

        } else if (opcion == 5) {
            System.out.print("Escribe el nombre que quieras buscar: ");
            String nombreBuscar = scanner.next();

            if (nombre.equals(scanner.next())) {
                System.out.println("El nombre que buscas es : " + nombreBuscar);
            } else {
                System.out.println("El nombre no existe");
            }

        } else if (opcion == 6) {
            System.out.println("Saliendo del programa.");
            scanner.close();

        } else {
            System.out.println("Opcion no valida.");
        }
    }
}