package DAO;

import Utilidades.ConexionBD;
import Modelo.*;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TitularDAO {

    public void insertar(Titular titular) {
        String sql = "INSERT INTO titulares (dni, nombre) VALUES (?, ?)";

        try
        {
            Connection conn = ConexionBD.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, titular.getDni());
            ps.setString(2, titular.getNombre());
            ps.executeUpdate();

            System.out.println(" (DAO)Titular insertado correctamente.");
            ConexionBD.closeConnection();

        }
        catch (Exception e)
        {
            System.out.println(" (DAO)Error al insertar titular: " + e.getMessage());
        }
    }

    public int borrar(int id) throws Exception{
        String sql = "DELETE FROM titulares WHERE ID = ?";

        int n=0;
        try
        {
            Connection conn = ConexionBD.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);
            n = ps.executeUpdate();

            if (n != 1) {
                System.out.println(" (DAO) Titular no borrado.");

                throw new Exception(" No se encontró ningún titular con el ID proporcionado.");
            }
            else
            {
                System.out.println(" (DAO) Titular borrado correctamente.");
            }

        }
        catch (Exception e)
        {
            System.out.println(" (DAO) Error al borrar titular: " + e.getMessage());
        }
        finally
        {
            ConexionBD.closeConnection();
            return n;
        }
    }

    public Titular buscarPorId(int id) {
        String sql = "SELECT * FROM titulares WHERE id = ?";

        try {
            Connection conn = ConexionBD.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Titular(
                        rs.getInt("id"),
                        rs.getString("dni"),
                        rs.getString("nombre")
                );
            }
            ConexionBD.closeConnection();

        }
        catch (Exception e)
        {
            System.out.println(" (DAO) Error al buscar titular: " + e.getMessage());
        }

        return null;
    }

    public Titular buscarPorDni(String dni) {
        String sql = "SELECT * FROM titulares WHERE dni = ?";

        try {
            Connection conn = ConexionBD.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Titular(
                        rs.getInt("id"),
                        rs.getString("dni"),
                        rs.getString("nombre")
                );
            }
            ConexionBD.closeConnection();

        }
        catch (Exception e)
        {
            System.out.println(" (DAO) Error al buscar titular por dni: " + e.getMessage());
        }

        return null;
    }

    public ArrayList<Titular>  buscarPorNombre(String nombre) {
        String sql = "SELECT * FROM titulares WHERE nombre = ?";

        try {
            Connection conn = ConexionBD.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            ArrayList<Titular> lista = new ArrayList<>();

            while (rs.next()) {
                lista.add(new Titular(
                        rs.getInt("id"),
                        rs.getString("dni"),
                        rs.getString("nombre")
                ));
            }

            ConexionBD.closeConnection();
            return lista;

        }
        catch (Exception e)
        {
            System.out.println("(DAO) Error al buscar titulares por nombre: " + e.getMessage());
        }

        return null;
    }

    public void modificar(Titular titular)  {
        String sql = "UPDATE titulares SET nombre = ? WHERE id = ?";

        try
        {
            Connection conn = ConexionBD.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, titular.getNombre());
            ps.setInt(2, titular.getId());
            int n = ps.executeUpdate();

            System.out.println(" (DAO) Titular modificado correctamente.");

            ConexionBD.closeConnection();
        }
        catch (Exception e)
        {
            System.out.println(" (DAO) Error al modificar titular: " + e.getMessage());
        }
    }

    public List<Titular> listarTodos() {
        List<Titular> lista = new ArrayList<>();
        String sql = "SELECT * FROM titulares";

        try (Connection conn = ConexionBD.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Titular(
                        rs.getInt("id"),
                        rs.getString("dni"),
                        rs.getString("nombre")
                ));
            }

            ConexionBD.closeConnection();

        }
        catch (Exception e) {
            System.out.println(" (DAO) Error al listar titulares: " + e.getMessage());
        }

        return lista;
    }
}

