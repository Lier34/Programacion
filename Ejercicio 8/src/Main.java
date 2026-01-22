public class Main {
    public static void main(String[] args) {

        Veterinario veterinario = new Veterinario(123, 45678901, "Dr. Smith", 987654321, 5551234);
        Cliente cliente = new Cliente(456, "John Doe", 5555678);
        Mascota mascota = new Mascota(20150101, 50, "Fido", 20, "Labrador", "Macho", "Perro", "Corto");

        System.out.println("Veterinario: " + veterinario.getNombre() + ", DNI: " + veterinario.getDNI());
        System.out.println("Cliente: " + cliente.getNombre() + ", Teléfono: " + cliente.getTelefono());
        System.out.println("Mascota: " + mascota.getNombre() + ", Raza: " + mascota.getRaza());
}
}