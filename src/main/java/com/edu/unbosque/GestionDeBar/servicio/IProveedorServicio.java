package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import com.edu.unbosque.GestionDeBar.modelo.Proveedor;

public interface IProveedorServicio {
    List<Proveedor> listarProveedores();

    Proveedor buscarProveedorPorId(Integer idProveedor);

    void guardarProveedor(Proveedor proveedor);

    void eliminarProveedorPorId(Integer idProveedor);
}
