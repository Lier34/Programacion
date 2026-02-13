import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print(" -- MENU -- ");

    System.out.print("1. Ver especies aceptadas");
    System.out.print("2. Añadir nuevo animal a rescatados");
    System.out.print("3. Asignar cuidador a animal");
    System.out.print("4. Asignar animal a la cola de espera para adopción");
    System.out.print("5. Adoptar animal");
    System.out.print("6. Listar animales y cuidadores");
    System.out.print("7. Salir");
    System.out.println("Elige una opción: ");
    int opcion = scanner.nextInt();

    if(opcion == 1){
        System.out.print("Estas son las especies que se aceptan: Perro, Gato, Conejo, Loro, y Tortuga");

    } else if (opcion == 2){
        System.out.println("Escribe el nombre del animal: ");
        String nombreAnimal = scanner.next();
        System.out.println("Escribe la especie del animal: ");
        String especieAnimal = scanner.next();
        System.out.print("Añadiendo " + especieAnimal + " con nombre " + nombreAnimal);

    } else if (opcion == 3){
        System.out.println("Escribe el nombre del animal: ");
        String nombreAnimal2 = scanner.next();
        System.out.println("Escribe el nombre del cuidador: ");
        String nombreCuidador = scanner.next();
        System.out.print("Asignando cuidador " + nombreCuidador + " al animal " + nombreAnimal2);

    } else if (opcion == 4){
        System.out.println("Escribe el nombre del animal: ");
        String nombreAnimal3 = scanner.next();
        System.out.print("Asignando animal " + nombreAnimal3 + " a la cola de espera para adopción");

    } else if (opcion == 5){
        System.out.println("Escribe el nombre del animal: ");
        String nombreAnimal4 = scanner.next();
        System.out.print("El animal con nombre " + nombreAnimal4 + " ha sido adoptado");

    } else if (opcion == 6){
        System.out.println("Has elegido la opcion 6");
        String nombreAnimal5 = scanner.next();
        System.out.println("Quieres ver la lista de cuidadores o animales? (c/a): ");
        String nombreCuidador2 = scanner.next();
        if (nombreCuidador2.equals("c")) {
        System.out.print("Cuidadores: " + nombreCuidador2);
        } else if( nombreCuidador2.equals("a")) {
          System.out.print("Animales: " + nombreAnimal5);
        } else {
          System.out.print("Opción no válida");
    }
    } else if (opcion == 7){
        System.out.println("Saliendo del programa...");
        scanner.close();

    } else {
        System.out.println("Opción no válida");
    }
}
}