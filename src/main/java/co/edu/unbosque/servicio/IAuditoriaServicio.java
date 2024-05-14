package co.edu.unbosque.servicio;

import java.util.List;

import co.edu.unbosque.modelo.Auditoria;

public interface IAuditoriaServicio {
	
    public List<Auditoria> listarAuditoria();

    public Auditoria buscarAuditoriaPorId(Integer idAuditoria);

    public void guardarAuditoria(Auditoria bares);

    public void eliminarAuditoriaPorId(Integer idAuditoria);
}
