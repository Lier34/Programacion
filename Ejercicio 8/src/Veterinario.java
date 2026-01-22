public class Veterinario {
    String nombre;
    int direccion;
    int telefono;
    int DNI;
    int numero_seguridad_social;

    public Veterinario(int direccion, int DNI, String nombre, int numero_seguridad_social, int telefono) {
        this.direccion = direccion;
        this.DNI = DNI;
        this.nombre = nombre;
        this.numero_seguridad_social = numero_seguridad_social;
        this.telefono = telefono;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_seguridad_social() {
        return numero_seguridad_social;
    }

    public void setNumero_seguridad_social(int numero_seguridad_social) {
        this.numero_seguridad_social = numero_seguridad_social;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
