package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.unbosque.GestionDeBar.modelo.Beneficio;
import com.edu.unbosque.GestionDeBar.repositorio.BeneficioRepositorio;
import org.springframework.stereotype.Service;

@Service
public class BeneficioServicio implements IBeneficioServicio {

	@Autowired
	private BeneficioRepositorio repositorio;

	@Override
	public List<Beneficio> listarBeneficios() {
		return this.repositorio.findAll();
	}

	@Override
	public Beneficio buscarBeneficioPorId(Integer idBeneficio) {
		Beneficio beneficio = this.repositorio.findById(idBeneficio).orElse(null);
		return beneficio;
	}

	@Override
	public void guardarBeneficio(Beneficio beneficio) {
		this.repositorio.save(beneficio);
	}

	@Override
	public void eliminarBeneficioPorId(Integer idBeneficio) {
		this.repositorio.deleteById(idBeneficio);
	}

}
