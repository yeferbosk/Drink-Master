package co.edu.unbosque.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.modelo.Banda;

public interface BandaRepositorio extends JpaRepository<Banda, Integer>{
}
