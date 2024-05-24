package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import com.edu.unbosque.GestionDeBar.modelo.Cliente;

public interface IClienteServicio {
	
    public List<Cliente> listarClientes();

    public Cliente buscarClientePorId(Integer idCliente);

    public Cliente guardarCliente(Cliente bares);

    public void eliminarClientePorId(Integer idCliente);
    
    public List<Cliente> buscarClientePorNombre(String nombre);
}
