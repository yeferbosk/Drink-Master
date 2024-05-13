package co.edu.unbosque.servicio;

import java.util.List;

import co.edu.unbosque.modelo.Banda;

public interface IBandaServicio {
	
    public List<Banda> listarBanda();

    public Banda buscarBaresPorId(Integer idBanda);

    public void guardarBares(Banda bares);

    public void eliminarBaresPorId(Integer idBanda);
}
