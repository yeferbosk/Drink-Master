package co.edu.unbosque.servicio;

import java.util.List;

import co.edu.unbosque.modelo.Beneficio;

public interface IBeneficioServicio {
	
    public List<Beneficio> listarBeneficios();

    public Beneficio buscarBaresPorId(Integer idBeneficio);

    public void guardarBares(Beneficio bares);

    public void eliminarBaresPorId(Integer idBeneficio);
}
