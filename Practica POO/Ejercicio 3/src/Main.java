//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Persona persona1 = new Persona("Ana Lopez", 5, 15, "Calle Luna 45", 28001, "Madrid", 1990);
            Persona persona2 = new Persona("Carlos Martinez", 8, 22, "Avenida Sol 78", 8002, "Barcelona", 1985);
            Persona persona3 = new Persona("Elena Garcia", 12, 3, "Plaza Estrella 9", 41003, "Sevilla", 1992);

            System.out.println("Persona 1: " + persona1.nombre + ", Nacimiento: " + persona1.dNacimiento + "/" + persona1.mNacimiento + "/" + persona1.aNacimiento + ", Dirección: " + persona1.direccion + ", CP: " + persona1.codigo_postal + ", Ciudad: " + persona1.ciudad);
            System.out.println("Persona 2: " + persona2.nombre + ", Nacimiento: " + persona2.dNacimiento + "/" + persona2.mNacimiento + "/" + persona2.aNacimiento + ", Dirección: " + persona2.direccion + ", CP: " + persona2.codigo_postal + ", Ciudad: " + persona2.ciudad);
    }
}