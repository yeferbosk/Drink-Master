package co.edu.unbosque.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unbosque.modelo.Bebidas;
import co.edu.unbosque.repositorio.BebidasRepositorio;

public class BebidasSerivicio implements IBebidasServicio{

	@Autowired
	private BebidasRepositorio repositorio;
	
	@Override
	public List<Bebidas> listarBebida() {
		return this.repositorio.findAll();
	}

	@Override
	public Bebidas buscarBebidaPorId(Integer idBebidas) {
		Bebidas bebida = this.repositorio.findById(idBebidas).orElse(null);
		return bebida;
	}

	@Override
	public void guardarBebida(Bebidas bares) {
		this.repositorio.save(bares);
	}

	@Override
	public void eliminarBebidaPorId(Integer idBebidas) {
		this.repositorio.deleteById(idBebidas);
	}
}
