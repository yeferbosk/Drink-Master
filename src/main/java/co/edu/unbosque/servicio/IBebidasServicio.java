package co.edu.unbosque.servicio;

import java.util.List;

import co.edu.unbosque.modelo.Bebidas;

public interface IBebidasServicio {
	
    public List<Bebidas> listarBebida();

    public Bebidas buscarBebidaPorId(Integer idBebidas);

    public void guardarBebida(Bebidas bares);

    public void eliminarBebidaPorId(Integer idBebidas);
}
