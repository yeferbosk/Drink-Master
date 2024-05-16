package com.edu.unbosque.GestionDeBar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.unbosque.GestionDeBar.modelo.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer>{
}
