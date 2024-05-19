package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.modelo.Pedido;
import com.edu.unbosque.GestionDeBar.servicio.IPedidoServicio;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoControlador {

    @Autowired
    private IPedidoServicio pedidoServicio;
    
    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoServicio.listarPedidos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPedidoPorId(@PathVariable Integer id) {
        Pedido pedido = pedidoServicio.buscarPedidoPorId(id);
        if (pedido != null) {
            return new ResponseEntity<>(pedido, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Pedido> guardarPedido(@RequestBody Pedido pedido) {
        pedidoServicio.guardarPedido(pedido);
        return new ResponseEntity<>(pedido, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedido> actualizarPedido(@PathVariable Integer id, @RequestBody Pedido detallesPedido) {
        Pedido pedido = pedidoServicio.buscarPedidoPorId(id);
        if (pedido != null) {
            pedido.setPrecio(detallesPedido.getPrecio());
            pedido.setDescripcion(detallesPedido.getDescripcion());
            pedido.setFecha(detallesPedido.getFecha());
            pedido.setId_bar(detallesPedido.getId_bar());
            pedido.setId_empleado(detallesPedido.getId_empleado());
            pedido.setId_cliente(detallesPedido.getId_cliente());
            pedidoServicio.guardarPedido(pedido);
            return new ResponseEntity<>(pedido, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPedido(@PathVariable Integer id) {
        Pedido pedido = pedidoServicio.buscarPedidoPorId(id);
        if (pedido != null) {
            pedidoServicio.eliminarPedidoPorId(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
