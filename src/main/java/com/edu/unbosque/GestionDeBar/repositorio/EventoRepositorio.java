package com.edu.unbosque.GestionDeBar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.unbosque.GestionDeBar.modelo.Evento;

public interface EventoRepositorio extends JpaRepository<Evento, Integer> {

}
