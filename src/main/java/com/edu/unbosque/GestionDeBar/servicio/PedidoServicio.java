package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import com.edu.unbosque.GestionDeBar.modelo.Pedido;
import com.edu.unbosque.GestionDeBar.repositorio.PedidoRepositorio;
import org.springframework.stereotype.Service;

@Service
public class PedidoServicio implements IPedidoServicio{

	private PedidoRepositorio repositorio;
	
	@Override
	public List<Pedido> listarPedidos() {
		return this.repositorio.findAll();
	}

	@Override
	public Pedido buscarPedidoPorId(Integer idPedido) {
		Pedido pedido = this.repositorio.findById(idPedido).orElse(null);
		return pedido;
	}

	@Override
	public void guardarPedido(Pedido pedido) {
		this.repositorio.save(pedido);
	}

	@Override
	public void eliminarPedidoPorId(Integer idPedido) {
		this.repositorio.deleteById(idPedido);
	}

}
