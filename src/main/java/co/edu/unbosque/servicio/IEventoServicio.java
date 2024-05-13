package co.edu.unbosque.servicio;

import java.util.List;

import co.edu.unbosque.modelo.Evento;

public interface IEventoServicio {
    List<Evento> listarEventos();

    Evento buscarEventoPorId(Integer idEvento);

    void guardarEvento(Evento evento);

    void eliminarEventoPorId(Integer idEvento);
}
