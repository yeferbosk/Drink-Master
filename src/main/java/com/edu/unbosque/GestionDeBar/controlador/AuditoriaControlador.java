package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import com.edu.unbosque.GestionDeBar.servicio.AuditoriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.modelo.Auditoria;
import com.edu.unbosque.GestionDeBar.servicio.IAuditoriaServicio;

@RestController
@RequestMapping("/api/auditorias")
@CrossOrigin(value = "http://localhost:4200")
public class AuditoriaControlador {

    @Autowired
    private AuditoriaServicio auditoriaServicio;
    
    @GetMapping("/auditoria")
    public List<Auditoria> listarAuditorias() {
        return auditoriaServicio.listarAuditoria();
    }

    @GetMapping("/buscar")
    public ResponseEntity<Auditoria> buscarAuditoriaPorId(@PathVariable Integer id) {
        Auditoria auditoria = auditoriaServicio.buscarAuditoriaPorId(id);
        if (auditoria != null) {
            return new ResponseEntity<>(auditoria, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<Auditoria> guardarAuditoria(@RequestBody Auditoria auditoria) {
        auditoriaServicio.guardarAuditoria(auditoria);
        return new ResponseEntity<>(auditoria, HttpStatus.CREATED);
    }

    @PutMapping("actualizar")
    public ResponseEntity<Auditoria> actualizarAuditoria(@PathVariable Integer id, @RequestBody Auditoria detallesAuditoria) {
        Auditoria auditoria = auditoriaServicio.buscarAuditoriaPorId(id);
        if (auditoria != null) {
            auditoria.setDescripcion(detallesAuditoria.getDescripcion());
            auditoria.setFecha(detallesAuditoria.getFecha());
            auditoria.setValorNuevo(detallesAuditoria.getValorNuevo());
            auditoria.setValorAntiguo(detallesAuditoria.getValorAntiguo());
            auditoria.setIdEmpleado(detallesAuditoria.getIdEmpleado());
            auditoriaServicio.guardarAuditoria(auditoria);
            return new ResponseEntity<>(auditoria, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("eliminar")
    public ResponseEntity<Void> eliminarAuditoria(@PathVariable Integer id) {
        Auditoria auditoria = auditoriaServicio.buscarAuditoriaPorId(id);
        if (auditoria != null) {
            auditoriaServicio.eliminarAuditoriaPorId(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
