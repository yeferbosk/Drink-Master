package com.edu.unbosque.GestionDeBar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.unbosque.GestionDeBar.modelo.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{
}
