package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.unbosque.GestionDeBar.modelo.Proveedor;
import com.edu.unbosque.GestionDeBar.repositorio.ProveedorRepositorio;

@Service
public class ProveedorServicio implements IProveedorServicio {

    @Autowired
    private ProveedorRepositorio proveedorRepositorio;

    @Override
    public List<Proveedor> listarProveedores() {
        return proveedorRepositorio.findAll();
    }

    @Override
    public Proveedor buscarProveedorPorId(Integer idProveedor) {
        return proveedorRepositorio.findById(idProveedor).orElse(null);
    }

    @Override
    public Proveedor guardarProveedor(Proveedor proveedor) {
       return proveedorRepositorio.save(proveedor);
    }

    @Override
    public void eliminarProveedorPorId(Integer idProveedor) {
        proveedorRepositorio.deleteById(idProveedor);
    }
}