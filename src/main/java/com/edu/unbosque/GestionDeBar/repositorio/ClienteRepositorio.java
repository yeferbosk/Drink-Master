package com.edu.unbosque.GestionDeBar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.unbosque.GestionDeBar.modelo.Cliente;

import java.util.List;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
	List<Cliente> findTop10ByOrderByHistorialGastoDesc();

	List<Cliente> findByNombreIgnoreCase(String nombre);
}
