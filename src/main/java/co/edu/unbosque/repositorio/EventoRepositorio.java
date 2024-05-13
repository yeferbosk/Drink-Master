package co.edu.unbosque.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.modelo.Evento;

public interface EventoRepositorio extends JpaRepository<Evento, Integer> {

}
