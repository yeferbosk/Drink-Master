package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import com.edu.unbosque.GestionDeBar.servicio.BandaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.modelo.Banda;
import com.edu.unbosque.GestionDeBar.servicio.IBandaServicio;

@RestController
@RequestMapping("/api/bandas")
@CrossOrigin(value = "http://localhost:4200")
public class BandaControlador {

    @Autowired
    private BandaServicio bandaServicio;
    
    @GetMapping("/bandas")
    public List<Banda> listarBandas() {
        return bandaServicio.listarBanda();
    }

    @GetMapping("/buscar")
    public ResponseEntity<Banda> buscarBandaPorId(@PathVariable Integer id) {
        Banda banda = bandaServicio.buscarBandaPorId(id);
        if (banda != null) {
            return new ResponseEntity<>(banda, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<Banda> guardarBanda(@RequestBody Banda banda) {
        bandaServicio.guardarBanda(banda);
        return new ResponseEntity<>(banda, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Banda> actualizarBanda(@PathVariable Integer id, @RequestBody Banda detallesBanda) {
        Banda banda = bandaServicio.buscarBandaPorId(id);
        if (banda != null) {
            banda.setNombre(detallesBanda.getNombre());
            banda.setNumeroIntegrantes(detallesBanda.getNumeroIntegrantes());
            banda.setTipoMusica(detallesBanda.getTipoMusica());
            bandaServicio.guardarBanda(banda);
            return new ResponseEntity<>(banda, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/eliminar")
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
