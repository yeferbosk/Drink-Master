package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.unbosque.GestionDeBar.modelo.Bar;
import com.edu.unbosque.GestionDeBar.repositorio.BaresRepositorio;

@Service
public class BaresServicio implements IBaresServicio{

    @Autowired
    private BaresRepositorio baresRepositorio;

    @Override
    public List<Bar> listarBares() {
    return this.baresRepositorio.findAll();
    }

    @Override
    public Bar buscarBaresPorId(Integer idBares) {
        Bar bares = this.baresRepositorio.findById(idBares).orElse(null);
        return bares;
    }

    @Override
    public Bar guardarBares(Bar bares) {
    return this.baresRepositorio.save(bares);
    }

    @Override
    public void eliminarBaresPorId(Integer idBares) {
    this.baresRepositorio.deleteById(idBares);
    }
}
