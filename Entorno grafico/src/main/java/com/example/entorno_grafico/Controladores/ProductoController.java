package com.example.entorno_grafico.Controladores;

import com.example.entorno_grafico.Modelo.Producto;
import com.example.entorno_grafico.Modelo.ProductoDAO;

public class ProductoController {

    public static Producto buscarProducto(String nombre) throws Exception
    {
        Producto producto = ProductoDAO.buscarProducto(nombre);
        return producto;
    }

    public static void buscarPorProducto(int codigo) throws Exception
    {
        AlmacenController.buscarPorProducto(codigo);
    }

}
