package co.edu.unbosque.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unbosque.modelo.Beneficio;
import co.edu.unbosque.repositorio.BeneficioRepositorio;

public class BeneficioServicio implements IBeneficioServicio {

	@Autowired
	private BeneficioRepositorio repositorio;

	@Override
	public List<Beneficio> listarBeneficios() {
		return this.repositorio.findAll();
	}

	@Override
	public Beneficio buscarBaresPorId(Integer idBeneficio) {
		Beneficio beneficio = this.repositorio.findById(idBeneficio).orElse(null);
		return beneficio;
	}

	@Override
	public void guardarBares(Beneficio beneficio) {
		this.repositorio.save(beneficio);
	}

	@Override
	public void eliminarBaresPorId(Integer idBeneficio) {
		// TODO Auto-generated method stub

	}

}
