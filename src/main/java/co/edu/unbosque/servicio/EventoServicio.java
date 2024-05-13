package co.edu.unbosque.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.modelo.Evento;
import co.edu.unbosque.repositorio.EventoRepositorio;

@Service
public class EventoServicio implements IEventoServicio {

    @Autowired
    private EventoRepositorio eventoRepositorio;

    @Override
    public List<Evento> listarEventos() {
        return this.eventoRepositorio.findAll();
    }

    @Override
    public Evento buscarEventoPorId(Integer idEvento) {
        return this.eventoRepositorio.findById(idEvento).orElse(null);
    }

    @Override
    public void guardarEvento(Evento evento) {
        this.eventoRepositorio.save(evento);
    }

    @Override
    public void eliminarEventoPorId(Integer idEvento) {
        this.eventoRepositorio.deleteById(idEvento);
    }
}
