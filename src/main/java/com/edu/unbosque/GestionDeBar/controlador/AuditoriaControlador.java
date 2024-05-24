package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import com.edu.unbosque.GestionDeBar.servicio.AuditoriaServicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.excepcion.RecursoNoEncontradoExcepcion;
import com.edu.unbosque.GestionDeBar.modelo.Auditoria;
import com.edu.unbosque.GestionDeBar.servicio.IAuditoriaServicio;

@RestController
@RequestMapping("/bares-app/controllerAuditoria")
@CrossOrigin(value = "http://localhost:4200")
public class AuditoriaControlador {

	private static final Logger logger = LoggerFactory.getLogger(AuditoriaControlador.class);

	@Autowired
	private AuditoriaServicio auditoriaServicio;

	@GetMapping("/auditoria")
	public List<Auditoria> listarAuditorias() {
		List<Auditoria> auditoria = this.auditoriaServicio.listarAuditoria();
		logger.info("Auditorias obtenidas: ");
		auditoria.forEach((Auditoria -> logger.info(auditoria.toString())));
		return auditoria;
	}

	@PostMapping("/guardar")
	public Auditoria guardarAuditoria(@RequestBody Auditoria auditoria) {
		logger.info("Auditoria a agregar: " + auditoria);
		return this.auditoriaServicio.guardarAuditoria(auditoria);
	}

	@GetMapping("/buscar")
	public ResponseEntity<Auditoria> buscarAuditoriaPorId(@PathVariable Integer id) {
		Auditoria auditoria = auditoriaServicio.buscarAuditoriaPorId(id);
		if (auditoria != null) {
			return ResponseEntity.ok(auditoria);
		} else {
			throw new RecursoNoEncontradoExcepcion("No se encontro el id: " + id);
		}
	}


}
