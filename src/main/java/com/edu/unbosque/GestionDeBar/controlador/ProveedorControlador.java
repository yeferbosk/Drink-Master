package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import com.edu.unbosque.GestionDeBar.servicio.ProveedorServicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.excepcion.RecursoNoEncontradoExcepcion;
import com.edu.unbosque.GestionDeBar.modelo.Proveedor;
import com.edu.unbosque.GestionDeBar.servicio.IProveedorServicio;

@RestController
@RequestMapping("/api/proveedores")
@CrossOrigin(value = "http://localhost:4200")
public class ProveedorControlador {

	private static final Logger logger = LoggerFactory.getLogger(ProveedorControlador.class);
	
    @Autowired
    private ProveedorServicio proveedorServicio;
    
    @GetMapping("/proveedor")
    public List<Proveedor> listarProveedores() {
        List<Proveedor> provedor = this.proveedorServicio.listarProveedores();
        logger.info("Provedor obtenido: ");
        provedor.forEach((Provedor -> logger.info(provedor.toString())));
        return provedor;
    }

    @PostMapping("/guardar")
    public Proveedor guardarProveedor(@RequestBody Proveedor proveedor) {
    	return this.proveedorServicio.guardarProveedor(proveedor);
    }

    @GetMapping("/buscar")
    public ResponseEntity<Proveedor> buscarProveedorPorId(@PathVariable Integer id) {
        Proveedor proveedor = proveedorServicio.buscarProveedorPorId(id);
        if (proveedor != null) {
        	return ResponseEntity.ok(proveedor);
        } else {
        	throw new RecursoNoEncontradoExcepcion("No se encontro el id: " + id);
        }
    }


}
