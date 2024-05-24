package com.edu.unbosque.GestionDeBar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.unbosque.GestionDeBar.modelo.Bebida;

import java.util.List;

public interface BebidasRepositorio extends JpaRepository<Bebida, Integer>{
	  List<Bebida> findByNombre(String nombre);
}
