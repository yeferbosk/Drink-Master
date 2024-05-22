package com.edu.unbosque.GestionDeBar.servicio;

import com.edu.unbosque.GestionDeBar.modelo.Bebida;
import com.edu.unbosque.GestionDeBar.repositorio.BebidasRepositorio;
import com.edu.unbosque.GestionDeBar.servicio.IBebidasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BebidasSerivicio implements IBebidasServicio {

	@Autowired
	private BebidasRepositorio repositorio;

	@Override
	public List<Bebida> listarBebida() {
		return this.repositorio.findAll();
	}

	@Override
	public Bebida buscarBebidaPorId(Integer idBebidas) {
		return this.repositorio.findById(idBebidas).orElse(null);
	}

	@Override
	public Bebida buscarBebidaPorNombreYDisponibilidad(String nombre, int disponibilidad) {
		List<Bebida> bebidas = repositorio.findByNombre(nombre);
		for (Bebida bebida : bebidas) {
			if (bebida.getDisponibilidad() >= disponibilidad) {
				return bebida;
			}
		}
		return null;
	}

	@Override
	public void guardarBebida(Bebida bebida) {
		this.repositorio.save(bebida);
	}

	@Override
	public void eliminarBebidaPorId(Integer idBebidas) {
		this.repositorio.deleteById(idBebidas);
	}
}