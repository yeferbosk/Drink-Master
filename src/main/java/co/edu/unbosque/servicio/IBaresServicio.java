package co.edu.unbosque.servicio;

import co.edu.unbosque.modelo.Bares;

import java.util.List;

public interface IBaresServicio {
    public List<Bares> listarBares();

    public Bares buscarBaresPorId(Integer idBares);

    public void guardarBares(Bares bares);

    public void eliminarBaresPorId(Integer idBares);

}
