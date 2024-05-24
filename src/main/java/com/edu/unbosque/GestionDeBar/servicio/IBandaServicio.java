package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import com.edu.unbosque.GestionDeBar.modelo.Banda;

public interface IBandaServicio {
	
    public List<Banda> listarBanda();

    public Banda buscarBandaPorId(Integer idBanda);

    public Banda guardarBanda(Banda bares);

    public void eliminarBandaPorId(Integer idBanda);
}
