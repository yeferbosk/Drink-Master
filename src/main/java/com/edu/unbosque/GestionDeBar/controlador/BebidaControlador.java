package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.modelo.Bebida;
import com.edu.unbosque.GestionDeBar.servicio.IBebidasServicio;

@RestController
@RequestMapping("/api/bebidas")
public class BebidaControlador {

    @Autowired
    private IBebidasServicio bebidaServicio;
    
    @GetMapping
    public List<Bebida> listarBebidas() {
        return bebidaServicio.listarBebida();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bebida> buscarBebidaPorId(@PathVariable Integer id) {
        Bebida bebida = bebidaServicio.buscarBebidaPorId(id);
        if (bebida != null) {
            return new ResponseEntity<>(bebida, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Bebida> guardarBebida(@RequestBody Bebida bebida) {
        bebidaServicio.guardarBebida(bebida);
        return new ResponseEntity<>(bebida, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bebida> actualizarBebida(@PathVariable Integer id, @RequestBody Bebida detallesBebida) {
        Bebida bebida = bebidaServicio.buscarBebidaPorId(id);
        if (bebida != null) {
            bebida.setNombre(detallesBebida.getNombre());
            bebida.setDescripcion(detallesBebida.getDescripcion());
            bebida.setMarca(detallesBebida.getMarca());
            bebida.setTipo(detallesBebida.getTipo());
            bebida.setDisponibilidad(detallesBebida.getDisponibilidad());
            bebida.setPrecio(detallesBebida.getPrecio());
            bebida.setId_proveedor(detallesBebida.getId_proveedor());
            bebidaServicio.guardarBebida(bebida);
            return new ResponseEntity<>(bebida, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarBebida(@PathVariable Integer id) {
        Bebida bebida = bebidaServicio.buscarBebidaPorId(id);
        if (bebida != null) {
            bebidaServicio.eliminarBebidaPorId(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
