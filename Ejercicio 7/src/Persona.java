public class Persona {
    String nombre;
    int fechanac;
    String paisnac;

    public Persona(int fechanac, String nombre, String paisnac) {
        this.fechanac = fechanac;
        this.nombre = nombre;
        this.paisnac = paisnac;
    }

    public int getFechanac() {
        return fechanac;
    }

    public void setFechanac(int fechanac) {
        this.fechanac = fechanac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisnac() {
        return paisnac;
    }

    public void setPaisnac(String paisnac) {
        this.paisnac = paisnac;
    }

    public String MostrarDatos() {;
        return "Nombre: " + nombre + ", Fecha de Nacimiento: " + fechanac + ", Pais de Nacimiento: " + paisnac;
    }
}
