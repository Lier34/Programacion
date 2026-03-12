package DAO;
import Utilidades.ConexionBD;
import Modelo.Vuelo;
import java.sql.*;

public class VueloDAO {

    public void insertarVuelo(Vuelo vuelo) {

        String sql = "INSERT INTO vuelos VALUES (?, ?, ?, ?)";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, vuelo.getCodigo());
            ps.setString(2, vuelo.getOrigen());
            ps.setString(3, vuelo.getDestino());
            ps.setString(4, vuelo.getFecha());

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error insertando vuelo: " + e.getMessage());
        }
    }

    public void eliminarVuelo(String codigo) {

        String sql = "DELETE FROM vuelos WHERE codigo=?";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, codigo);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error eliminando vuelo");
        }
    }
}