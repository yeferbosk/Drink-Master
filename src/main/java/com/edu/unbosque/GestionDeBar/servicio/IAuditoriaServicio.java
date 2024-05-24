package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import com.edu.unbosque.GestionDeBar.modelo.Auditoria;

public interface IAuditoriaServicio {
	
    public List<Auditoria> listarAuditoria();

    public Auditoria buscarAuditoriaPorId(Integer idAuditoria);

    public Auditoria guardarAuditoria(Auditoria bares);

    public void eliminarAuditoriaPorId(Integer idAuditoria);
}
