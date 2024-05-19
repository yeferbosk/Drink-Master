package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.modelo.Auditoria;
import com.edu.unbosque.GestionDeBar.servicio.IAuditoriaServicio;

@RestController
@RequestMapping("/api/auditorias")
public class AuditoriaControlador {

    @Autowired
    private IAuditoriaServicio auditoriaServicio;
    
    @GetMapping
    public List<Auditoria> listarAuditorias() {
        return auditoriaServicio.listarAuditoria();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Auditoria> buscarAuditoriaPorId(@PathVariable Integer id) {
        Auditoria auditoria = auditoriaServicio.buscarAuditoriaPorId(id);
        if (auditoria != null) {
            return new ResponseEntity<>(auditoria, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Auditoria> guardarAuditoria(@RequestBody Auditoria auditoria) {
        auditoriaServicio.guardarAuditoria(auditoria);
        return new ResponseEntity<>(auditoria, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Auditoria> actualizarAuditoria(@PathVariable Integer id, @RequestBody Auditoria detallesAuditoria) {
        Auditoria auditoria = auditoriaServicio.buscarAuditoriaPorId(id);
        if (auditoria != null) {
            auditoria.setDescripcion(detallesAuditoria.getDescripcion());
            auditoria.setFecha(detallesAuditoria.getFecha());
            auditoria.setValor_nuevo(detallesAuditoria.getValor_nuevo());
            auditoria.setValor_antiguo(detallesAuditoria.getValor_antiguo());
            auditoria.setId_empleado(detallesAuditoria.getId_empleado());
            auditoriaServicio.guardarAuditoria(auditoria);
            return new ResponseEntity<>(auditoria, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
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
