package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.unbosque.GestionDeBar.modelo.Bebida;
import com.edu.unbosque.GestionDeBar.repositorio.BebidasRepositorio;

public class BebidasSerivicio implements IBebidasServicio{

	@Autowired
	private BebidasRepositorio repositorio;
	
	@Override
	public List<Bebida> listarBebida() {
		return this.repositorio.findAll();
	}

	@Override
	public Bebida buscarBebidaPorId(Integer idBebidas) {
		Bebida bebida = this.repositorio.findById(idBebidas).orElse(null);
		return bebida;
	}

	@Override
	public void guardarBebida(Bebida bares) {
		this.repositorio.save(bares);
	}

	@Override
	public void eliminarBebidaPorId(Integer idBebidas) {
		this.repositorio.deleteById(idBebidas);
	}
}
