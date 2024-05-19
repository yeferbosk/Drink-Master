package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import com.edu.unbosque.GestionDeBar.modelo.Pedido;

public interface IPedidoServicio {

    public List<Pedido> listarPedidos();

    public Pedido buscarPedidoPorId(Integer idPedido);

    public void guardarPedido(Pedido pedido);

    public void eliminarPedidoPorId(Integer idPedido);
	
}
