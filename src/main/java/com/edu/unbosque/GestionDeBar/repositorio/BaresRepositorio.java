package com.edu.unbosque.GestionDeBar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.unbosque.GestionDeBar.modelo.Bar;

public interface BaresRepositorio extends JpaRepository<Bar, Integer> {
}
