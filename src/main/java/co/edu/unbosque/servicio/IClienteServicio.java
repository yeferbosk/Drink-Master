package co.edu.unbosque.servicio;

import java.util.List;

import co.edu.unbosque.modelo.Cliente;

public interface IClienteServicio {
	
    public List<Cliente> listarClientes();

    public Cliente buscarBaresPorId(Integer idCliente);

    public void guardarBares(Cliente bares);

    public void eliminarBaresPorId(Integer idCliente);
}
