package co.edu.unbosque.servicio;

import java.util.List;

import co.edu.unbosque.modelo.Bebidas;

public interface IBebidasServicio {
	
    public List<Bebidas> listarBebida();

    public Bebidas buscarBaresPorId(Integer idBebidas);

    public void guardarBares(Bebidas bares);

    public void eliminarBaresPorId(Integer idBebidas);
}
