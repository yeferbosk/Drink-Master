package co.edu.unbosque.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.unbosque.modelo.Cliente;
import co.edu.unbosque.repositorio.ClienteRepositorio;

public class ClienteServicio implements IClienteServicio{
	
	@Autowired
	private ClienteRepositorio repositorio;

	@Override
	public List<Cliente> listarClientes() {
		return this.repositorio.findAll();
	}

	@Override
	public Cliente buscarBaresPorId(Integer idCliente) {
		
		return null;
	}

	@Override
	public void guardarBares(Cliente bares) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarBaresPorId(Integer idCliente) {
		// TODO Auto-generated method stub
		
	}
}
