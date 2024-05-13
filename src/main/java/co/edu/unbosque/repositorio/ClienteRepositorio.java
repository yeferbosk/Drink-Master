package co.edu.unbosque.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.modelo.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{
}
