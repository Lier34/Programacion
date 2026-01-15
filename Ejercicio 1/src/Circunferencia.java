public class Circunferencia {
    int longitud;
    int volumen;
    int area;

    public Circunferencia(int volumen, int longitud, int area) {
        this.volumen = volumen;
        this.longitud = longitud;
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}
