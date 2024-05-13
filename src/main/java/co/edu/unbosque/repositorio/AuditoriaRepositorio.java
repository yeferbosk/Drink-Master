package co.edu.unbosque.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.modelo.Auditoria;

public interface AuditoriaRepositorio extends JpaRepository<Auditoria, Integer>{
}
