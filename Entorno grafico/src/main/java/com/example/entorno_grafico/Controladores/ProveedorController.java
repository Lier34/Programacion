package com.example.entorno_grafico.Controladores;

import com.example.entorno_grafico.Modelo.Proveedor;
import com.example.entorno_grafico.Modelo.ProveedorDAO;

public class ProveedorController
{
    public static Proveedor crearObjetoProveedor(int codigo) throws Exception
    {
        return ProveedorDAO.crearObjetoProveedor(codigo);
    }
}
