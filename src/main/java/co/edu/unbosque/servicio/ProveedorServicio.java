package co.edu.unbosque.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.modelo.Proveedor;
import co.edu.unbosque.repositorio.ProveedorRepositorio;

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
    public void guardarProveedor(Proveedor proveedor) {
        proveedorRepositorio.save(proveedor);
    }

    @Override
    public void eliminarProveedorPorId(Integer idProveedor) {
        proveedorRepositorio.deleteById(idProveedor);
    }
}