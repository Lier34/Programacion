import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("-- menu --");
       System.out.print("1. Añadir libro: ");
       String titulo = scanner.next();
       System.out.println("2. Consultar libro");
       System.out.println("3. Eliminar libro");
       System.out.println("4. Mostrar todos");
       System.out.println("5. Verificar si esta vacia");
       System.out.println("6. Salir");
       System.out.print("Seleccione una opción (1-6): ");
       int opcion = scanner.nextInt();

       if (opcion == 1) {
           System.out.println("Libro introducido en la parte superior de la pila");

       } else if (opcion == 2) {
           System.out.println("El titulo del libro es: " + titulo);

       } else if (opcion == 3) {
           System.out.println("El libro cuyo titulo es " + titulo + " ha sido eliminado");

       } else if (opcion == 4) {
           System.out.println("Estos son todos los libros en la pila:" + titulo);

       } else if (opcion == 5) {
           System.out.println("Verificando si hay libros en la pila...");

           if (titulo.isEmpty()) {
               System.out.println("La pila está vacía");
           } else {
               System.out.println("La pila no está vacía");
           }

       } else if (opcion == 6) {
           System.out.println("Saliendo del programa...");
           scanner.close();

       } else {
           System.out.println("Opción no válida");
           main(args);
       }
    }
}