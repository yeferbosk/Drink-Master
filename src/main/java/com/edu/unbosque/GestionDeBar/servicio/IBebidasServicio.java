package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import com.edu.unbosque.GestionDeBar.modelo.Bebida;

public interface IBebidasServicio {
	
    public List<Bebida> listarBebida();

    public Bebida buscarBebidaPorId(Integer idBebidas);

    public Bebida buscarBebidaPorNombreYDisponibilidad(String nombre, int disponibilidad);

    public void guardarBebida(Bebida bares);

    public void eliminarBebidaPorId(Integer idBebidas);
}
