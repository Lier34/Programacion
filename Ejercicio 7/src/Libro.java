public class Libro {
    String titulo;
    String editorial;
    int numpaginas;

    public Libro(String editorial, int numpaginas, String titulo) {
        this.editorial = editorial;
        this.numpaginas = numpaginas;
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String MostrarDatos() {
        return "Titulo: " + titulo + ", Editorial: " + editorial + ", Numero de Paginas: " + numpaginas;
    }

    public String modificar() {
        return "El libro ha sido modificado";
    }
}
