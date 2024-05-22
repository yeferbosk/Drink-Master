package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import com.edu.unbosque.GestionDeBar.servicio.BaresServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.modelo.Bar;
import com.edu.unbosque.GestionDeBar.servicio.IBaresServicio;

@RestController
@RequestMapping("/api/bar")
@CrossOrigin(value = "http://localhost:4200")
public class BarControlador {

    @Autowired
    private BaresServicio barServicio;
    
    @GetMapping("/bar")
    public List<Bar> listarBares() {
        return barServicio.listarBares();
    }

    @GetMapping("/buscar")
    public ResponseEntity<Bar> buscarBarPorId(@PathVariable Integer id) {
        Bar bar = barServicio.buscarBaresPorId(id);
        if (bar != null) {
            return new ResponseEntity<>(bar, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<Bar> guardarBar(@RequestBody Bar bar) {
        barServicio.guardarBares(bar);
        return new ResponseEntity<>(bar, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Bar> actualizarBar(@PathVariable Integer id, @RequestBody Bar detallesBar) {
        Bar bar = barServicio.buscarBaresPorId(id);
        if (bar != null) {
            bar.setNombreDueno(detallesBar.getNombreDueno());
            bar.setNombreBar(detallesBar.getNombreBar());
            bar.setTipoBar(detallesBar.getTipoBar());
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

    @DeleteMapping("/eliminar")
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
