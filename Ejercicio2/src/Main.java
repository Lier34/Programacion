import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe una fecha de caducidad (dd/mm/yyyy): ");
        String fechaCaducidad = scanner.nextLine();

        System.out.print("Quieres escribir mas fechas(si/no): ");
        String respuesta = scanner.nextLine();

        if(respuesta.equalsIgnoreCase("si")) {
            main(args);
        }else if(respuesta.equalsIgnoreCase("no")) {
            System.out.print("Escribe el nombre del producto: ");
            String nombreProducto = scanner.nextLine();
        }else {
            System.out.println("Respuesta no valida");
            scanner.close();
        }

        System.out.print("Quieres escribir mas nombres(si/no): ");
        String respuestaNombre = scanner.nextLine();

        if(respuestaNombre.equalsIgnoreCase("si")) {
            System.out.print("Escribe el nombre del producto: ");
            String nombreProducto2 = scanner.nextLine();
            System.out.print("Escribe la fecha de hoy: ");
            String fechaHoy = scanner.nextLine();

        }else if(respuestaNombre.equalsIgnoreCase("no")) {
            System.out.print("Escribe la fecha de hoy: ");
            String fechaHoy2 = scanner.nextLine();
        }
        else {
            System.out.println("Respuesta no valida");
        }
        scanner.close();
    }
}