package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.unbosque.GestionDeBar.modelo.Banda;
import com.edu.unbosque.GestionDeBar.repositorio.BandaRepositorio;
import org.springframework.stereotype.Service;

@Service
public class BandaServicio implements IBandaServicio{

	@Autowired
	private BandaRepositorio repositorio;
	
	@Override
	public List<Banda> listarBanda() {
		return this.repositorio.findAll();
	}

	@Override
	public Banda buscarBandaPorId(Integer idBanda) {
		Banda banda = this.repositorio.findById(idBanda).orElse(null);
		return banda;
	}

	@Override
	public Banda guardarBanda(Banda banda) {
		return this.repositorio.save(banda);
	}

	@Override
	public void eliminarBandaPorId(Integer idBanda) {
		this.repositorio.deleteById(idBanda);
	}
}
