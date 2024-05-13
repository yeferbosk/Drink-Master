package co.edu.unbosque.servicio;

import java.util.List;

import co.edu.unbosque.modelo.Proveedor;

public interface IProveedorServicio {
    List<Proveedor> listarProveedores();

    Proveedor buscarProveedorPorId(Integer idProveedor);

    void guardarProveedor(Proveedor proveedor);

    void eliminarProveedorPorId(Integer idProveedor);
}
