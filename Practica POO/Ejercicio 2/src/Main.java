
public class Main {
    public static void main(String[] args) {

        Alumnos alumno1 = new Alumnos(5551234, "Juan Perez", "Calle Falsa 123", 1001);
        Alumnos alumno2 = new Alumnos(5555678, "Maria Gomez", "Avenida Siempre Viva 742", 1002);
        Alumnos alumno3 = new Alumnos(5558765, "Luis Rodriguez", "Boulevard Central 456", 1003);

        System.out.println("Alumno 1: " + alumno1.getNombre() + ", Teléfono: " + alumno1.getTelefono() + ", Dirección: " + alumno1.getDomicilio() + ", ID Estudiante: " + alumno1.getCodigo());
        System.out.println("Alumno 2: " + alumno2.getNombre() + ", Teléfono: " + alumno2.getTelefono() + ", Dirección: " + alumno2.getDomicilio() + ", ID Estudiante: " + alumno2.getCodigo());

    }
}