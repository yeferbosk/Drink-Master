package co.edu.unbosque.servicio;

import co.edu.unbosque.modelo.Bares;

import co.edu.unbosque.repositorio.BaresRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaresServicio implements IBaresServicio{

    @Autowired
    private BaresRepositorio baresRepositorio;

    @Override
    public List<Bares> listarBares() {
    return this.baresRepositorio.findAll();
    }

    @Override
    public Bares buscarBaresPorId(Integer idBares) {
        Bares bares = this.baresRepositorio.findById(idBares).orElse(null);
        return bares;
    }

    @Override
    public void guardarBares(Bares bares) {
    this.baresRepositorio.save(bares);
    }

    @Override
    public void eliminarBaresPorId(Integer idBares) {
    this.baresRepositorio.deleteById(idBares);
    }
}
