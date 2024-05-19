package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.modelo.Banda;
import com.edu.unbosque.GestionDeBar.servicio.IBandaServicio;

@RestController
@RequestMapping("/api/bandas")
public class BandaControlador {

    @Autowired
    private IBandaServicio bandaServicio;
    
    @GetMapping
    public List<Banda> listarBandas() {
        return bandaServicio.listarBanda();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Banda> buscarBandaPorId(@PathVariable Integer id) {
        Banda banda = bandaServicio.buscarBandaPorId(id);
        if (banda != null) {
            return new ResponseEntity<>(banda, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Banda> guardarBanda(@RequestBody Banda banda) {
        bandaServicio.guardarBanda(banda);
        return new ResponseEntity<>(banda, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Banda> actualizarBanda(@PathVariable Integer id, @RequestBody Banda detallesBanda) {
        Banda banda = bandaServicio.buscarBandaPorId(id);
        if (banda != null) {
            banda.setNombre(detallesBanda.getNombre());
            banda.setNumero_integrantes(detallesBanda.getNumero_integrantes());
            banda.setTipo_musica(detallesBanda.getTipo_musica());
            bandaServicio.guardarBanda(banda);
            return new ResponseEntity<>(banda, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarBanda(@PathVariable Integer id) {
        Banda banda = bandaServicio.buscarBandaPorId(id);
        if (banda != null) {
            bandaServicio.eliminarBandaPorId(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
