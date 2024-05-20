package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.modelo.Bar;
import com.edu.unbosque.GestionDeBar.servicio.IBaresServicio;

@RestController
@RequestMapping("/api/bares")
public class BarControlador {

    @Autowired
    private IBaresServicio barServicio;
    
    @GetMapping
    public List<Bar> listarBares() {
        return barServicio.listarBares();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bar> buscarBarPorId(@PathVariable Integer id) {
        Bar bar = barServicio.buscarBaresPorId(id);
        if (bar != null) {
            return new ResponseEntity<>(bar, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Bar> guardarBar(@RequestBody Bar bar) {
        barServicio.guardarBares(bar);
        return new ResponseEntity<>(bar, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bar> actualizarBar(@PathVariable Integer id, @RequestBody Bar detallesBar) {
        Bar bar = barServicio.buscarBaresPorId(id);
        if (bar != null) {
            bar.setNombre_dueno(detallesBar.getNombre_dueno());
            bar.setNombre_bar(detallesBar.getNombre_bar());
            bar.setTipo_bar(detallesBar.getTipo_bar());
            bar.setDireccion(detallesBar.getDireccion());
            bar.setHorario(detallesBar.getHorario());
            bar.setCapacidad(detallesBar.getCapacidad());
            bar.setTelefono(detallesBar.getTelefono());
            barServicio.guardarBares(bar);
            return new ResponseEntity<>(bar, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarBar(@PathVariable Integer id) {
        Bar bar = barServicio.buscarBaresPorId(id);
        if (bar != null) {
            barServicio.eliminarBaresPorId(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
