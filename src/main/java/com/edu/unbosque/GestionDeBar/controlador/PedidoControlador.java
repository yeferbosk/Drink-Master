package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import com.edu.unbosque.GestionDeBar.servicio.PedidoServicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.modelo.Pedido;
import com.edu.unbosque.GestionDeBar.servicio.IPedidoServicio;

@RestController
@RequestMapping("/bares-app/controllerPedido")
@CrossOrigin(value = "http://localhost:4200")
public class PedidoControlador {

	private static final Logger logger = LoggerFactory.getLogger(BarControlador.class);
	
    @Autowired
    private PedidoServicio pedidoServicio;
    
    @GetMapping("/pedido")
    public List<Pedido> listarPedidos() {
        List<Pedido> pedido = this.pedidoServicio.listarPedidos();
        logger.info("Pedido obtenidos: " + pedido);
        pedido.forEach((Pedido -> logger.info(pedido.toString())));
    	return pedidoServicio.listarPedidos();
    }

    @PostMapping("/guardar")
    public Pedido guardarPedido(@RequestBody Pedido pedido) {
    	logger.info("Pedido a agregar: " + pedido);
    	return this.pedidoServicio.guardarPedido(pedido);
    }

    @GetMapping("/buscar")
    public ResponseEntity<Pedido> buscarPedidoPorId(@PathVariable Integer id) {
        Pedido pedido = pedidoServicio.buscarPedidoPorId(id);
        if (pedido != null) {
            return new ResponseEntity<>(pedido, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
