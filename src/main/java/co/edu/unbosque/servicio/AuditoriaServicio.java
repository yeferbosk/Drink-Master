package co.edu.unbosque.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unbosque.modelo.Auditoria;
import co.edu.unbosque.repositorio.AuditoriaRepositorio;

public class AuditoriaServicio implements IAuditoriaServicio{

    @Autowired
    private AuditoriaRepositorio repositorio;
	
	@Override
	public List<Auditoria> listarAuditoria() {
		return this.repositorio.findAll();
	}

	@Override
	public Auditoria buscarAuditoriaPorId(Integer idAuditoria) {
		Auditoria auditoria = this.repositorio.findById(idAuditoria).orElse(null);
		return auditoria;
	}

	@Override
	public void guardarAuditoria(Auditoria auditoria) {
		this.repositorio.save(auditoria);
	}

	@Override
	public void eliminarAuditoriaPorId(Integer idAuditoria) {
		this.repositorio.deleteById(idAuditoria);
	}
}
