package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import com.edu.unbosque.GestionDeBar.servicio.BebidasSerivicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.modelo.Bebida;
import com.edu.unbosque.GestionDeBar.servicio.IBebidasServicio;
@CrossOrigin(value = "http://localhost:4200")
@RestController
@RequestMapping("/api/bebidas")
public class BebidaControlador {

    @Autowired
    private BebidasSerivicio bebidaServicio;
    
    @GetMapping("/bebida")
    public List<Bebida> listarBebidas() {
        return bebidaServicio.listarBebida();
    }

    @GetMapping("/buscarId")
    public ResponseEntity<Bebida> buscarBebidaPorId(@PathVariable Integer id) {
        Bebida bebida = bebidaServicio.buscarBebidaPorId(id);
        if (bebida != null) {
            return new ResponseEntity<>(bebida, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<Bebida> guardarBebida(@RequestBody Bebida bebida) {
        bebidaServicio.guardarBebida(bebida);
        return new ResponseEntity<>(bebida, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Bebida> actualizarBebida(@PathVariable Integer id, @RequestBody Bebida detallesBebida) {
        Bebida bebida = bebidaServicio.buscarBebidaPorId(id);
        if (bebida != null) {
            bebida.setNombre(detallesBebida.getNombre());
            bebida.setDescripcion(detallesBebida.getDescripcion());
            bebida.setMarca(detallesBebida.getMarca());
            bebida.setTipo(detallesBebida.getTipo());
            bebida.setDisponibilidad(detallesBebida.getDisponibilidad());
            bebida.setPrecio(detallesBebida.getPrecio());
            bebida.setIdProveedor(detallesBebida.getIdProveedor());
            bebidaServicio.guardarBebida(bebida);
            return new ResponseEntity<>(bebida, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<Void> eliminarBebida(@PathVariable Integer id) {
        Bebida bebida = bebidaServicio.buscarBebidaPorId(id);
        if (bebida != null) {
            bebidaServicio.eliminarBebidaPorId(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/buscar")
    public ResponseEntity<Bebida> buscarBebida(@RequestParam String nombre, @RequestParam int disponibilidad) {
        Bebida bebida = bebidaServicio.buscarBebidaPorNombreYDisponibilidad(nombre, disponibilidad);
        if (bebida != null) {
            return new ResponseEntity<>(bebida, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
