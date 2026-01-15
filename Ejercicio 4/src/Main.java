
public class Main {
    public static void main(String[] args) {

        Estudio estudio1 = new Estudio(123456789, "Estados Unidos", "Warner Bros", 1923, 987654321, 100, "Burbank");
        Estudio estudio2 = new Estudio(987654321, "Reino Unido", "Universal Pictures", 1912, 123456789, 200, "Londres");
        Estudio estudio3 = new Estudio(555555555, "Canada", "Lionsgate", 1997, 111222333, 300, "Vancouver");

        Pelicula pelicula1 = new Pelicula(1994, 142, "Drama", "The Shawshank Redemption");
        Pelicula pelicula2 = new Pelicula(2008, 152, "Accion", "El caballero oscuro");
        Pelicula pelicula3 = new Pelicula(2010, 148, "Ciencia ficcion", "Inception");


    }
}