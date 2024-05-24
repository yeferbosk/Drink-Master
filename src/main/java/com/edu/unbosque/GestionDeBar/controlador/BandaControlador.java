package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import com.edu.unbosque.GestionDeBar.servicio.BandaServicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.excepcion.RecursoNoEncontradoExcepcion;
import com.edu.unbosque.GestionDeBar.modelo.Banda;
import com.edu.unbosque.GestionDeBar.servicio.IBandaServicio;

@RestController
@RequestMapping("/api/bandas")
@CrossOrigin(value = "http://localhost:4200")
public class BandaControlador {

	private static final Logger logger = LoggerFactory.getLogger(BandaControlador.class);
	
    @Autowired
    private BandaServicio bandaServicio;
    
    @GetMapping("/bandas")
    public List<Banda> listarBandas() {
    	List<Banda> banda = this.bandaServicio.listarBanda();
    	logger.info("Banda obtenida:" + banda);
    	banda.forEach((Banda -> logger.info(banda.toString())));
        return bandaServicio.listarBanda();
    }

    @PostMapping("/guardar")
    public Banda guardarBanda(@RequestBody Banda banda) {
    	logger.info("Banda a agregar: " + banda);
    	return this.bandaServicio.guardarBanda(banda);
    }

    @GetMapping("/buscar")
    public ResponseEntity<Banda> buscarBandaPorId(@PathVariable Integer id) {
        Banda banda = bandaServicio.buscarBandaPorId(id);
        if (banda != null) {
        	return ResponseEntity.ok(banda);
        } else {
        	throw new RecursoNoEncontradoExcepcion("No se encontro el id: " + id);
        }
    }


}
