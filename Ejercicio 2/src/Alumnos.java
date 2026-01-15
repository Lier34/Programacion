public class Alumnos {
    int codigo;
    String nombre;
    String domicilio;
    int telefono;

    public Alumnos(int telefono, String nombre, String domicilio, int codigo) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String EscribirDatos(){
        return "Nombre: " + nombre + ", domicilio: " + domicilio + ", telefono: " + telefono;
    }

    public String EscribirCodigo(){
        return "Escribe el codigo: " + codigo;
    }
}
