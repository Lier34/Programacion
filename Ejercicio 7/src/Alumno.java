public class Alumno extends Persona {
    String DNI;

    public Alumno(int fechanac, String nombre, String paisnac, String DNI) {
        super(fechanac, nombre, paisnac);
        this.DNI = DNI;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }


}
