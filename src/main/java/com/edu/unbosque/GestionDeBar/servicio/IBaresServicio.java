package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import com.edu.unbosque.GestionDeBar.modelo.Bar;

public interface  IBaresServicio {
    public List<Bar> listarBares();

    public Bar buscarBaresPorId(Integer idBares);

    public Bar guardarBares(Bar bares);

    public void eliminarBaresPorId(Integer idBares);

}
