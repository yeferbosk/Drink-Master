package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import com.edu.unbosque.GestionDeBar.modelo.Evento;

public interface IEventoServicio {
    List<Evento> listarEventos();

    Evento buscarEventoPorId(Integer idEvento);

    Evento guardarEvento(Evento evento);

    void eliminarEventoPorId(Integer idEvento);
}
