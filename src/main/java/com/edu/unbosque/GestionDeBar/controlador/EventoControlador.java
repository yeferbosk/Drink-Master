package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import com.edu.unbosque.GestionDeBar.servicio.EventoServicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private static final Logger logger = LoggerFactory.getLogger(EventoControlador.class);
	
    @Autowired
    private EventoServicio eventoServicio;
    
    @GetMapping("/evento")
    public List<Evento> listarEventos() {
    	List<Evento> evento = this.eventoServicio.listarEventos();
    	logger.info("Eventos obtenidos" + evento);
    	evento.forEach((Evento -> logger.info((evento.toString()))));
        return evento;
    }

    @PostMapping("/guardar")
    public Evento guardarEvento(@RequestBody Evento evento) {
    	logger.info("Evento a agregar: " + evento);
    	return this.eventoServicio.guardarEvento(evento);
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

}
