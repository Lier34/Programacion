import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Escribe el dia del pago: ");
    int diaPago = scanner.nextInt();

    System.out.print("Escribe el mes del pago: ");
    String mesPago = scanner.next();

    System.out.print("Escribe la cantidad pagada: ");
    double cantidadPagada = scanner.nextDouble();

    System.out.println("El total del pago anual es: " + (cantidadPagada * 12) + " euros.");
    scanner.close();
    }
}