package co.edu.unbosque.servicio;

import java.util.List;

import co.edu.unbosque.modelo.Banda;

public interface IBandaServicio {
	
    public List<Banda> listarBanda();

    public Banda buscarBandaPorId(Integer idBanda);

    public void guardarBanda(Banda bares);

    public void eliminarBandaPorId(Integer idBanda);
}
