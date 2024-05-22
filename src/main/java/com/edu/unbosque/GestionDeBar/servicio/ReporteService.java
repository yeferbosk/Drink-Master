package com.edu.unbosque.GestionDeBar.servicio;

import com.edu.unbosque.GestionDeBar.modelo.Cliente;
import com.edu.unbosque.GestionDeBar.modelo.Proveedor;
import com.edu.unbosque.GestionDeBar.repositorio.ClienteRepositorio;
import com.edu.unbosque.GestionDeBar.repositorio.ProveedorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporteService {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private ProveedorRepositorio proveedorRepositorio;

    public List<Cliente> obtenerClientesMayorGasto() {
        return clienteRepositorio.findTop10ByOrderByHistorialGastoDesc();
    }

    public List<Proveedor> obtenerProveedoresMayorCompras() {
        return proveedorRepositorio.findTop10ByOrderByHistorialComprasDesc();
    }
}
