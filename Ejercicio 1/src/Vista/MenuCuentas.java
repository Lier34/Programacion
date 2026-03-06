package Vista;

import Controlador.BancoController;
import Modelo.CuentaCorriente;
import Utilidades.EntradaDatos;

import javax.swing.*;
import java.util.Scanner;

public class MenuCuentas {

    private Scanner sc;

    private BancoController bancoController;

    public MenuCuentas()
    {
        sc = new Scanner(System.in);
        bancoController = new BancoController();
    }

    public void mostrarMenu()
    {
        int opcion;
        do
        {
            System.out.println("\n====== MENÚ BANCO (CUENTAS)  ======");
            System.out.println("1. Crear cuenta corriente");
            System.out.println("2. Modificar cuenta corriente");
            System.out.println("3. Borrar cuenta corriente");
            System.out.println("4. Listar cuentas");
            System.out.println("5. Listar cuentas con saldo superior a un valor");
            System.out.println("6. Buscar por número de cuenta");
            System.out.println("0. Salir");
            System.out.println("========================");

            opcion = EntradaDatos.leerEntero(sc, "Elige opción: ");

            switch (opcion) {
                case 1 -> crearCuenta();
                case 2 -> modificarCuenta();
                case 3 -> borrarCuenta();
                case 4 -> listarCuentas();
                case 5 -> listarCuentasPorSaldo();
                case 6 -> buscarPorIban();
                case 0 -> System.out.println("Volviendo al menú principal");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
    private void crearCuenta() {
        System.out.println("\n--- CREAR CUENTA ---");
        try
        {
            String iban = EntradaDatos.leerTexto(sc, "Introduce IBAN: ", "^ES[0-9]{22}$");
            if (iban != null) {
                if (EntradaDatos.validacionCompletaIBAN(iban))
                {
                    double saldo  = EntradaDatos.leerDouble(sc, "Introduce el saldo: ");
                    if (saldo != -1) {
                        bancoController.crearCuenta(iban, saldo);
                        JOptionPane.showMessageDialog(null,"Cuenta creada correctamente.");
                    }
                }
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas creando la cuenta");
        }
    }



    private void modificarCuenta() {
        System.out.println("\n--- MODIFICAR CUENTA ---");
        try
        {
            String iban = EntradaDatos.leerTexto(sc, "Introduce el IBAN de la cuenta a modificar: ", "^ES[0-9]{22}$");
            if (iban != null) {
                if (EntradaDatos.validacionCompletaIBAN(iban))
                {
                    CuentaCorriente cuenta = bancoController.buscarCuentaPorIban(iban);
                    if (cuenta == null) {
                        JOptionPane.showMessageDialog(null,"No se ha encontrado ninguna cuenta con ese IBAN.");
                    }
                    else {
                        double nuevoSaldo = EntradaDatos.leerDouble(sc, "Introduce el nuevo saldo: ");
                        if (nuevoSaldo != -1) {
                            bancoController.modificarCuenta(cuenta, nuevoSaldo);
                            JOptionPane.showMessageDialog(null, "Cuenta modificada correctamente.");
                        }
                    }
                }
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas modificando la cuenta");
        }


    }

    private void borrarCuenta() {
        System.out.println("\n--- BORRAR CUENTA ---");
        try {
            String iban = EntradaDatos.leerTexto(sc, "Introduce el IBAN de la cuenta a borrar: ", "^ES[0-9]{22}$");
            if (iban != null) {
                if (EntradaDatos.validacionCompletaIBAN(iban)) {
                    int n = bancoController.eliminarCuenta(iban);
                    if (n == 1) {
                        JOptionPane.showMessageDialog(null, "Cuenta borrada correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se ha encontrado ninguna cuenta con ese IBAN.");
                    }
                }
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas borrando la cuenta");
        }
    }

    private void listarCuentas() {
        String datos = bancoController.listarCuentas();
        JOptionPane.showMessageDialog(null, datos);
    }

    private void listarCuentasPorSaldo() {
        System.out.println("\n--- LISTAR CUENTAS POR SALDO ---");
        try {
            double saldo = EntradaDatos.leerDouble(sc, "Introduce el saldo mínimo: ");
            if (saldo != -1) {
                String datos = bancoController.listarCuentasPorSaldo(saldo);
                JOptionPane.showMessageDialog(null, datos);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas listando las cuentas por saldo");
        }
    }

    private void buscarPorIban() {
        System.out.println("\n--- BUSCAR CUENTA POR IBAN ---");
        try {
            String iban = EntradaDatos.leerTexto(sc, "Introduce el IBAN de la cuenta a buscar: ", "^ES[0-9]{22}$");
            if (iban != null) {
                if (EntradaDatos.validacionCompletaIBAN(iban)) {
                    CuentaCorriente cuenta = bancoController.buscarCuentaPorIban(iban);
                    if (cuenta == null) {
                        JOptionPane.showMessageDialog(null, "No se ha encontrado ninguna cuenta con ese IBAN.");
                    } else {
                        JOptionPane.showMessageDialog(null, cuenta.toString());
                    }
                }
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas buscando la cuenta por IBAN");
        }
    }

}
