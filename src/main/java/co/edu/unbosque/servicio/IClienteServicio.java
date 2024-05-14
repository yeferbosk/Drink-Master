package co.edu.unbosque.servicio;

import java.util.List;

import co.edu.unbosque.modelo.Cliente;

public interface IClienteServicio {
	
    public List<Cliente> listarClientes();

    public Cliente buscarClientePorId(Integer idCliente);

    public void guardarCliente(Cliente bares);

    public void eliminarClientePorId(Integer idCliente);
}
