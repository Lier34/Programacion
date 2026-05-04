package com.example.entorno_grafico.Modelo;

import com.example.entorno_grafico.Controladores.AlmacenController;
import com.example.entorno_grafico.Controladores.ProductoController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductoDAO {

    private static String plantilla;
    private static PreparedStatement ps;
    private static ResultSet rs;

    private static Producto producto;

    public static Producto buscarProducto(String nombre) throws Exception
    {
        plantilla = " select * from productos where descripcion = ?";
        Connection con = com.example.entorno_grafico.Utilidades.DBConnection.getConnection();
        ps = con.prepareStatement(plantilla);
        ps.setString(1,nombre);
        rs = ps.executeQuery();

        if(rs.next())
            return crearObjeto();

        throw new Exception("El producto no existe");
    }

    public static Producto crearObjeto() throws Exception{
        producto = new Producto();
        producto.setCodigo(rs.getInt(1));
        producto.setNombre(rs.getString(2));
        producto.setUnidades(rs.getInt(3));
        producto.setPrecio(rs.getFloat(4));

        // Buscar proveedores por producto
        ProductoController.buscarPorProducto(producto.getCodigo());

        return producto;
    }
}
