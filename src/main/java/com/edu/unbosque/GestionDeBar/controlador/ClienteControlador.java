package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import com.edu.unbosque.GestionDeBar.servicio.ClienteServicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.modelo.Cliente;
import com.edu.unbosque.GestionDeBar.servicio.IClienteServicio;

@RestController
@RequestMapping("/bares-app/controllerCliente")
@CrossOrigin(value = "http://localhost:4200")
public class ClienteControlador {

	private static final Logger logger = LoggerFactory.getLogger(ClienteControlador.class);
	
    @Autowired
    private ClienteServicio clienteServicio;

    @GetMapping("/clientes")
    public List<Cliente> listarClientes() {
    	List<Cliente> cliente = this.clienteServicio.listarClientes();
    	logger.info("Cliente obtenidos" + cliente);
    	cliente.forEach((Cliente -> logger.info(cliente.toString())));
    	return cliente;
    }

    @PostMapping("/guardar")
    public Cliente guardarCliente(@RequestBody Cliente cliente) {
    	logger.info("Cliente a agregar: " + cliente);
    	return this.clienteServicio.guardarCliente(cliente);
    }

    @GetMapping("/buscarId")
    public ResponseEntity<Cliente> obtenerClientePorId(@PathVariable Integer id) {
        Cliente cliente = clienteServicio.buscarClientePorId(id);
        return cliente != null ? ResponseEntity.ok(cliente) : ResponseEntity.notFound().build();
    }

    @GetMapping("/buscar")
    public List<Cliente> buscarCliente(@RequestParam String nombre) {
        return clienteServicio.buscarClientePorNombre(nombre);
    }
    
   
}
