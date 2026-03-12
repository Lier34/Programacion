public class Estudio {
    String nombre;
    String ciudad;
    int direccion;
    int direccion_web;
    int fecha_fundacion;
    String pais;
    int telefonos;

    public Estudio(int telefonos, String pais, String nombre, int fecha_fundacion, int direccion_web, int direccion, String ciudad) {
        this.telefonos = telefonos;
        this.pais = pais;
        this.nombre = nombre;
        this.fecha_fundacion = fecha_fundacion;
        this.direccion_web = direccion_web;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(int telefonos) {
        this.telefonos = telefonos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFecha_fundacion() {
        return fecha_fundacion;
    }

    public void setFecha_fundacion(int fecha_fundacion) {
        this.fecha_fundacion = fecha_fundacion;
    }

    public int getDireccion_web() {
        return direccion_web;
    }

    public void setDireccion_web(int direccion_web) {
        this.direccion_web = direccion_web;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


}
