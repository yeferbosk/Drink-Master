package co.edu.unbosque.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unbosque.modelo.Banda;
import co.edu.unbosque.repositorio.BandaRepositorio;

public class BandaServicio implements IBandaServicio{

	@Autowired
	private BandaRepositorio repositorio;
	
	@Override
	public List<Banda> listarBanda() {
		return this.repositorio.findAll();
	}

	@Override
	public Banda buscarBaresPorId(Integer idBanda) {
		Banda banda = this.repositorio.findById(idBanda).orElse(null);
		return banda;
	}

	@Override
	public void guardarBares(Banda banda) {
		this.repositorio.save(banda);
	}

	@Override
	public void eliminarBaresPorId(Integer idBanda) {
		
	}
}
