package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import com.edu.unbosque.GestionDeBar.servicio.EventoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.modelo.Evento;
import com.edu.unbosque.GestionDeBar.servicio.IEventoServicio;

@RestController
@RequestMapping("/api/evento")
@CrossOrigin(value = "http://localhost:4200")
public class EventoControlador {

    @Autowired
    private EventoServicio eventoServicio;
    
    @GetMapping("/evento")
    public List<Evento> listarEventos() {
        return eventoServicio.listarEventos();
    }

    @GetMapping("/buscar")
    public ResponseEntity<Evento> buscarEventoPorId(@PathVariable Integer id) {
        Evento evento = eventoServicio.buscarEventoPorId(id);
        if (evento != null) {
            return new ResponseEntity<>(evento, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<Evento> guardarEvento(@RequestBody Evento evento) {
        eventoServicio.guardarEvento(evento);
        return new ResponseEntity<>(evento, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Evento> actualizarEvento(@PathVariable Integer id, @RequestBody Evento detallesEvento) {
        Evento evento = eventoServicio.buscarEventoPorId(id);
        if (evento != null) {
            evento.setTematica(detallesEvento.getTematica());
            evento.setTipoEvento(detallesEvento.getTipoEvento());
            evento.setHoraDuracion(detallesEvento.getHoraDuracion());
            evento.setRegaloConcurso(detallesEvento.getRegaloConcurso());
            evento.setIdBar(detallesEvento.getIdBar());
            eventoServicio.guardarEvento(evento);
            return new ResponseEntity<>(evento, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/eliminar")
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
