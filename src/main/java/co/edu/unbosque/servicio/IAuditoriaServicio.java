package co.edu.unbosque.servicio;

import java.util.List;

import co.edu.unbosque.modelo.Auditoria;

public interface IAuditoriaServicio {
	
    public List<Auditoria> listarAuditoria();

    public Auditoria buscarBaresPorId(Integer idAuditoria);

    public void guardarBares(Auditoria bares);

    public void eliminarBaresPorId(Integer idAuditoria);
}
