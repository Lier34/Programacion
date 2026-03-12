public class Pelicula {
    String titulo;
    int año;
    int duracion;
    String tipo;

    public Pelicula(int año, int duracion, String tipo, String titulo) {
        this.año = año;
        this.duracion = duracion;
        this.tipo = tipo;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}

