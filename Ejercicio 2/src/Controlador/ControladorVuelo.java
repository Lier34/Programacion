package Controlador;

import Modelo.Vuelo;
import Utilidades.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ControladorVuelo {

    public void insertarVuelo(Vuelo vuelo) {

        String sql = "INSERT INTO vuelos VALUES (?, ?, ?, ?)";

        try {

            Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, vuelo.getCodigo());
            ps.setString(2, vuelo.getOrigen());
            ps.setString(3, vuelo.getDestino());
            ps.setString(4, vuelo.getFecha());

            ps.executeUpdate();

            System.out.println("Vuelo insertado");

        } catch (Exception e) {
            System.out.println("Error al insertar vuelo");
        }
    }

    public void consultarVuelo(String codigo) {

        String sql = "SELECT * FROM vuelos WHERE codigo=?";

        try {

            Connection con = ConexionBD.conectar();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, codigo);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){

                System.out.println("Código: " + rs.getString("codigo"));
                System.out.println("Origen: " + rs.getString("origen"));
                System.out.println("Destino: " + rs.getString("destino"));
                System.out.println("Fecha: " + rs.getString("fecha"));
            }

        } catch (Exception e) {
            System.out.println("Error en consulta");
        }
    }

    public void eliminarVuelo(String codigo) {

        String sql = "DELETE FROM vuelos WHERE codigo=?";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, codigo);
            int filas = ps.executeUpdate();

            if (filas > 0) {
                System.out.println("Vuelo eliminado correctamente");
            } else {
                System.out.println("No se encontró el vuelo con código: " + codigo);
            }

        } catch (Exception e) {
            System.out.println("Error al eliminar vuelo: " + e.getMessage());
        }
    }
}
