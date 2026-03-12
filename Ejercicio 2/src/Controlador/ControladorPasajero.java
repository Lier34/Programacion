package Controlador;

import Modelo.Pasajero;
import Utilidades.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ControladorPasajero {

    public void insertarPasajero(Pasajero p) {

        String sql = "INSERT INTO pasajeros VALUES (?, ?, ?, ?)";

        try {

            Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, p.getDni());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getApellido());
            ps.setString(4, p.getCodigoVuelo());

            ps.executeUpdate();

            System.out.println("Pasajero insertado correctamente");

        } catch (Exception e) {

            System.out.println("Error al insertar pasajero: " + e.getMessage());

        }
    }

    // BAJA PASAJERO
    public void eliminarPasajero(String dni) {

        String sql = "DELETE FROM pasajeros WHERE dni=?";

        try {

            Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, dni);

            ps.executeUpdate();

            System.out.println("Pasajero eliminado");

        } catch (Exception e) {

            System.out.println("Error al eliminar pasajero");

        }
    }

    public void modificarPasajero(Pasajero p) {

        String sql = "UPDATE pasajeros SET nombre=?, apellido=?, codigo_vuelo=? WHERE dni=?";

        try {

            Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, p.getNombre());
            ps.setString(2, p.getApellido());
            ps.setString(3, p.getCodigoVuelo());
            ps.setString(4, p.getDni());

            ps.executeUpdate();

            System.out.println("Pasajero modificado");

        } catch (Exception e) {

            System.out.println("Error al modificar pasajero");

        }
    }

    public void consultarPasajero(String dni) {

        String sql = "SELECT * FROM pasajeros WHERE dni=?";

        try {

            Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, dni);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("DNI: " + rs.getString("dni"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Apellido: " + rs.getString("apellido"));
                System.out.println("Código vuelo: " + rs.getString("codigo_vuelo"));

            } else {

                System.out.println("Pasajero no encontrado");

            }

        } catch (Exception e) {

            System.out.println("Error en la consulta");

        }
    }

    public void vueloDePasajero(String dni) {

        String sql = """
                SELECT v.codigo, v.origen, v.destino, v.fecha
                FROM vuelos v
                JOIN pasajeros p ON v.codigo = p.codigo_vuelo
                WHERE p.dni = ?
                """;

        try {

            Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, dni);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("Vuelo: " + rs.getString("codigo"));
                System.out.println("Origen: " + rs.getString("origen"));
                System.out.println("Destino: " + rs.getString("destino"));
                System.out.println("Fecha: " + rs.getString("fecha"));

            } else {

                System.out.println("El pasajero no tiene vuelo asignado");

            }

        } catch (Exception e) {

            System.out.println("Error al consultar vuelo");

        }
    }
}


