package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import com.edu.unbosque.GestionDeBar.servicio.ProveedorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.modelo.Proveedor;
import com.edu.unbosque.GestionDeBar.servicio.IProveedorServicio;

@RestController
@RequestMapping("/api/proveedores")
@CrossOrigin(value = "http://localhost:4200")
public class ProveedorControlador {

    @Autowired
    private ProveedorServicio proveedorServicio;
    
    @GetMapping("/proveedor")
    public List<Proveedor> listarProveedores() {
        return proveedorServicio.listarProveedores();
    }

    @GetMapping("/buscar")
    public ResponseEntity<Proveedor> buscarProveedorPorId(@PathVariable Integer id) {
        Proveedor proveedor = proveedorServicio.buscarProveedorPorId(id);
        if (proveedor != null) {
            return new ResponseEntity<>(proveedor, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<Proveedor> guardarProveedor(@RequestBody Proveedor proveedor) {
        proveedorServicio.guardarProveedor(proveedor);
        return new ResponseEntity<>(proveedor, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Proveedor> actualizarProveedor(@PathVariable Integer id, @RequestBody Proveedor detallesProveedor) {
        Proveedor proveedor = proveedorServicio.buscarProveedorPorId(id);
        if (proveedor != null) {
            proveedor.setEmpresa(detallesProveedor.getEmpresa());
            proveedor.setDescripcion(detallesProveedor.getDescripcion());
            proveedor.setTelefono(detallesProveedor.getTelefono());
            proveedor.setHistorialCompras(detallesProveedor.getHistorialCompras());
            proveedorServicio.guardarProveedor(proveedor);
            return new ResponseEntity<>(proveedor, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<Void> eliminarProveedor(@PathVariable Integer id) {
        Proveedor proveedor = proveedorServicio.buscarProveedorPorId(id);
        if (proveedor != null) {
            proveedorServicio.eliminarProveedorPorId(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
