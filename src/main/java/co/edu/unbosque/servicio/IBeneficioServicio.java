package co.edu.unbosque.servicio;

import java.util.List;

import co.edu.unbosque.modelo.Beneficio;

public interface IBeneficioServicio {
	
    public List<Beneficio> listarBeneficios();

    public Beneficio buscarBeneficioPorId(Integer idBeneficio);

    public void guardarBeneficio(Beneficio bares);

    public void eliminarBeneficioPorId(Integer idBeneficio);
}
