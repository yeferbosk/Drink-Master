package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.modelo.Cliente;
import com.edu.unbosque.GestionDeBar.servicio.IClienteServicio;

@RestController
@RequestMapping("/api/clientes")
public class ClienteControlador {

    @Autowired
    private IClienteServicio clienteServicio;

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteServicio.listarClientes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> obtenerClientePorId(@PathVariable Integer id) {
        Cliente cliente = clienteServicio.buscarClientePorId(id);
        return cliente != null ? ResponseEntity.ok(cliente) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Cliente> guardarCliente(@RequestBody Cliente cliente) {
        clienteServicio.guardarCliente(cliente);
        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> actualizarCliente(@PathVariable Integer id, @RequestBody Cliente cliente) {
        Cliente clienteExistente = clienteServicio.buscarClientePorId(id);
        if (clienteExistente != null) {
            cliente.setId_cliente(id);
            clienteServicio.guardarCliente(cliente);
            return ResponseEntity.ok(cliente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCliente(@PathVariable Integer id) {
        clienteServicio.eliminarClientePorId(id);
        return ResponseEntity.noContent().build();
    }
}
