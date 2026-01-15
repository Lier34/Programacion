public class Main {
    public static void main(String[] args) {
        Estudio estudio1 = new Estudio(123456789, "Estados Unidos", "Universal Studios", 1912, 100200300, 1234, "Hollywood");
        Estudio estudio2 = new Estudio(987654321, "Reino Unido", "Pinewood Studios", 1936, 400500600, 5678, "Londres");
        Estudio estudio3 = new Estudio(555666777, "Canada", "Vancouver Studios", 1950, 700800900, 9101, "Vancouver");

        Pelicula pelicula1 = new Pelicula(1995, 120, "Acción", "Jurassic Park");
        Pelicula pelicula2 = new Pelicula(2001, 150, "Fantasía", "El Señor de los Anillos: La Comunidad del Anillo");
        Pelicula pelicula3 = new Pelicula(2010, 130, "Ciencia Ficción", "Inception");
    }
}