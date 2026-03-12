
import Utilidades.ConexionBD;
import Vista.MenuTitular;

public class Main {
    public static void main(String[] args) {

        ConexionBD.crearEMF();

        MenuTitular menu = new MenuTitular();
        menu.mostrarMenu();
    }
}