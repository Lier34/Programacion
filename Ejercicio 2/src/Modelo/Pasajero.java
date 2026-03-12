package Modelo;

public class Pasajero {

    private String dni;
    private String nombre;
    private String apellido;
    private String codigoVuelo;

    public Pasajero(String dni, String nombre, String apellido, String codigoVuelo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoVuelo = codigoVuelo;
    }

    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCodigoVuelo() { return codigoVuelo; }
}
