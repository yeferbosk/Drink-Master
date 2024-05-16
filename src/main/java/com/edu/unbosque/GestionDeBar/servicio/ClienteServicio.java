package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.unbosque.GestionDeBar.modelo.Cliente;
import com.edu.unbosque.GestionDeBar.repositorio.ClienteRepositorio;

public class ClienteServicio implements IClienteServicio{
	
	@Autowired
	private ClienteRepositorio repositorio;

	@Override
	public List<Cliente> listarClientes() {
		return this.repositorio.findAll();
	}

	@Override
	public Cliente buscarClientePorId(Integer idCliente) {
		Cliente cliente = this.repositorio.findById(idCliente).orElse(null);
		return cliente;
	}

	@Override
	public void guardarCliente(Cliente cliente) {
		this.repositorio.save(cliente);
	}

	@Override
	public void eliminarClientePorId(Integer idCliente) {
		this.repositorio.deleteById(idCliente);
	}
}
