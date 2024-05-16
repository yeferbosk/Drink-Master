package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import com.edu.unbosque.GestionDeBar.modelo.Beneficio;

public interface IBeneficioServicio {
	
    public List<Beneficio> listarBeneficios();

    public Beneficio buscarBeneficioPorId(Integer idBeneficio);

    public void guardarBeneficio(Beneficio bares);

    public void eliminarBeneficioPorId(Integer idBeneficio);
}
