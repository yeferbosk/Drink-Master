package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.modelo.Evento;
import com.edu.unbosque.GestionDeBar.servicio.IEventoServicio;

@RestController
@RequestMapping("/api/eventos")
public class EventoControlador {

    @Autowired
    private IEventoServicio eventoServicio;
    
    @GetMapping
    public List<Evento> listarEventos() {
        return eventoServicio.listarEventos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> buscarEventoPorId(@PathVariable Integer id) {
        Evento evento = eventoServicio.buscarEventoPorId(id);
        if (evento != null) {
            return new ResponseEntity<>(evento, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Evento> guardarEvento(@RequestBody Evento evento) {
        eventoServicio.guardarEvento(evento);
        return new ResponseEntity<>(evento, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Evento> actualizarEvento(@PathVariable Integer id, @RequestBody Evento detallesEvento) {
        Evento evento = eventoServicio.buscarEventoPorId(id);
        if (evento != null) {
            evento.setTematica(detallesEvento.getTematica());
            evento.setTipo_evento(detallesEvento.getTipo_evento());
            evento.setHora_duracion(detallesEvento.getHora_duracion());
            evento.setRegalo_concurso(detallesEvento.getRegalo_concurso());
            evento.setId_bar(detallesEvento.getId_bar());
            eventoServicio.guardarEvento(evento);
            return new ResponseEntity<>(evento, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEvento(@PathVariable Integer id) {
        Evento evento = eventoServicio.buscarEventoPorId(id);
        if (evento != null) {
            eventoServicio.eliminarEventoPorId(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
