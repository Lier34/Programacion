import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Escribe el nombre del jugador: ");
    String nombreJugador = scanner.nextLine();

    System.out.print("Escribe el apellido del jugador: ");
    String apellidoJugador = scanner.nextLine();

    System.out.print("Escribe el rol del jugador: ");
    String rolJugador = scanner.nextLine();

    if (rolJugador.equalsIgnoreCase("defensa") || rolJugador.equalsIgnoreCase("portero") ||
        rolJugador.equalsIgnoreCase("delantero") || rolJugador.equalsIgnoreCase("mediocampista")) {
        System.out.println("Rol valido");
    } else {
        System.out.println("Rol no valido");
        main(args);
    }

    System.out.println("Jugador registrado");

    System.out.print("Quieres registrar mas jugadores? (si/no): ");
    String respuesta = scanner.nextLine();
    if (respuesta.equalsIgnoreCase("si")) {
       main(args);
    }
    else if(respuesta.equalsIgnoreCase("no")) {
        System.out.println("-- Menu --");
    }
    else {
        System.out.println("Respuesta no valida");
        main(args);
    }

    System.out.println ("1. Llevar a cabo alta");
    System.out.println ("2. Llevar a cabo baja");
    System.out.println ("3. Modificar datos");

    System.out.print("Selecciona una opcion: ");
    int opcion = scanner.nextInt();

    if (opcion == 1) {
        System.out.println("Jugador dado de alta.");
    } else if (opcion == 2) {
        System.out.println("Jugador dado de baja.");
    } else if (opcion == 3) {
        System.out.println("Elige los datos que quieras modificar: ");
        System.out.println("1. Nombre");
        System.out.println("2. Apellido");
        System.out.println("3. Rol");
        System.out.print("Selecciona una opcion: ");
        int opcionModificar = scanner.nextInt();
        if (opcionModificar == 1) {
            System.out.print("Escribe el nuevo nombre: ");
            String nuevoNombre = scanner.next();
            if (Objects.equals(nuevoNombre, nombreJugador)){
                System.out.println("El nombre no puede ser igual al anterior");
            }
            else {
                System.out.println("Nombre modificado correctamente.");
            }
        } else if (opcionModificar == 2) {
            System.out.print("Escribe el nuevo apellido: ");
            String nuevoApellido = scanner.next();
            if (Objects.equals(nuevoApellido, apellidoJugador)){
                System.out.println("El apellido no puede ser igual al anterior");
            }
            else {
                System.out.println("Apellido modificado correctamente.");
            }
        } else if (opcionModificar == 3) {
            System.out.print("Escribe el nuevo rol: ");
            String nuevoRol = scanner.next();

            if (Objects.equals(nuevoRol, rolJugador)){
                System.out.println("El rol no puede ser igual al anterior");
            }
            else {
                System.out.println("Rol modificado correctamente.");
            }
            if (nuevoRol.equalsIgnoreCase("defensa") || nuevoRol.equalsIgnoreCase("portero") ||
                nuevoRol.equalsIgnoreCase("delantero") || nuevoRol.equalsIgnoreCase("mediocampista")) {
                System.out.println("Rol valido");
            } else {
                System.out.println("Rol no valido");
            }
        } else {
            System.out.println("Opcion no valida.");
        }
    } else {
        System.out.println("Opcion no valida.");
    }

}
}