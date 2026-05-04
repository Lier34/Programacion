package com.example.entorno_grafico.Controladores;

import com.example.entorno_grafico.Modelo.*;

import java.util.List;

public class ProductoProveedorController {

    public static List<Proveedor> buscarPorProducto(int id) throws Exception
    {
        return ProductoProveedorDAO.buscarPorProducto(id);
    }


    public static Proveedor crearObjetoProveedor(int codigoProveedor) throws Exception
    {
        return AlmacenController.crearObjetoProveedor(codigoProveedor);
    }
}
