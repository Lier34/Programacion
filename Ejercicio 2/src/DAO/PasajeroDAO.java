package DAO;

import Modelo.Pasajero;
import Utilidades.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PasajeroDAO {

    public boolean insertar(Pasajero p) {
        String sql = "INSERT INTO pasajeros VALUES (?, ?, ?, ?)";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, p.getDni());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getApellido());
            ps.setString(4, p.getCodigoVuelo());

            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error al insertar pasajero: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(String dni) {
        String sql = "DELETE FROM pasajeros WHERE dni=?";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, dni);
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error al eliminar pasajero: " + e.getMessage());
            return false;
        }
    }

    public boolean modificar(Pasajero p) {
        String sql = "UPDATE pasajeros SET nombre=?, apellido=?, codigo_vuelo=? WHERE dni=?";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, p.getNombre());
            ps.setString(2, p.getApellido());
            ps.setString(3, p.getCodigoVuelo());
            ps.setString(4, p.getDni());

            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error al modificar pasajero: " + e.getMessage());
            return false;
        }
    }

    public Pasajero consultarPorDNI(String dni) {
        String sql = "SELECT * FROM pasajeros WHERE dni=?";
        Pasajero pasajero = null;

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                pasajero = new Pasajero(
                        rs.getString("dni"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("codigo_vuelo")
                );
            }

        } catch (Exception e) {
            System.out.println("Error al consultar pasajero: " + e.getMessage());
        }

        return pasajero;
    }

    public String vueloDePasajero(String dni) {
        String sql = "SELECT codigo_vuelo FROM pasajeros WHERE dni=?";
        String vuelo = null;

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                vuelo = rs.getString("codigo_vuelo");
            }

        } catch (Exception e) {
            System.out.println("Error al obtener vuelo de pasajero: " + e.getMessage());
        }

        return vuelo;
    }

    public List<Pasajero> listaPasajerosPorVuelo(String codigoVuelo) {
        List<Pasajero> lista = new ArrayList<>();
        String sql = "SELECT * FROM pasajeros WHERE codigo_vuelo=?";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, codigoVuelo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new Pasajero(
                        rs.getString("dni"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("codigo_vuelo")
                ));
            }

        } catch (Exception e) {
            System.out.println("Error al listar pasajeros: " + e.getMessage());
        }

        return lista;
    }
}
