public class Mascota {
    String tipo;
    String raza;
    String nombre;
    int fechanac;
    String sexo;
    int peso;
    int longitud;
    String tipo_pelo;

    public Mascota(int fechanac, int longitud, String nombre, int peso, String raza, String sexo, String tipo, String tipo_pelo) {
        this.fechanac = fechanac;
        this.longitud = longitud;
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
        this.sexo = sexo;
        this.tipo = tipo;
        this.tipo_pelo = tipo_pelo;
    }

    public String getTipo_pelo() {
        return tipo_pelo;
    }

    public void setTipo_pelo(String tipo_pelo) {
        this.tipo_pelo = tipo_pelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getFechanac() {
        return fechanac;
    }

    public void setFechanac(int fechanac) {
        this.fechanac = fechanac;
    }
}
