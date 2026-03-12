package Modelo;

public class Vuelo {

    private String codigo;
    private String origen;
    private String destino;
    private String fecha;

    public Vuelo(String codigo, String origen, String destino, String fecha) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public String getCodigo() { return codigo; }
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public String getFecha() { return fecha; }

    public void setOrigen(String origen) { this.origen = origen; }
    public void setDestino(String destino) { this.destino = destino; }
    public void setFecha(String fecha) { this.fecha = fecha; }
}