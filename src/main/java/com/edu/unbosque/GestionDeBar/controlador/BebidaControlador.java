package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import com.edu.unbosque.GestionDeBar.servicio.BebidasSerivicio;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.excepcion.RecursoNoEncontradoExcepcion;
import com.edu.unbosque.GestionDeBar.modelo.Bebida;
import com.edu.unbosque.GestionDeBar.servicio.IBebidasServicio;

@RequestMapping("/bares-app/controllerBebida")
@CrossOrigin(value = "http://localhost:4200")
@RestController
public class BebidaControlador {

	private static final Logger logger = LoggerFactory.getLogger(BebidaControlador.class);
	
    @Autowired
    private BebidasSerivicio bebidaServicio;
    
    @GetMapping("/bebida")
    public List<Bebida> listarBebidas() {
    	List<Bebida> bebida = this.bebidaServicio.listarBebida();
    	logger.info("Bebida obtenida: " + bebida);
    	bebida.forEach((Bebida -> logger.info(bebida.toString())));
        return bebida;
    }

    @PostMapping("/bebida")
    public Bebida guardarBebida(@RequestBody Bebida bebida) {
		logger.info("Bebida a agregar: " + bebida);
		return this.bebidaServicio.guardarBebida(bebida);
    }

    @GetMapping("/buscar{id}")
    public ResponseEntity<Bebida> buscarBebidaPorId(@PathVariable Integer id) {
        Bebida bebida = bebidaServicio.buscarBebidaPorId(id);
        if (bebida != null) {
            return ResponseEntity.ok(bebida);
        } else {
        	throw new RecursoNoEncontradoExcepcion("No se encontro el id: " + id);
        }
    }
    
    @GetMapping("/buscar")
    public Bebida buscarBebida(@RequestParam String nombre, @RequestParam int disponibilidad) {
        return bebidaServicio.buscarBebidaPorNombreYDisponibilidad(nombre, disponibilidad);
    
	}
}
