package com.edu.unbosque.GestionDeBar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.unbosque.GestionDeBar.modelo.Auditoria;

public interface AuditoriaRepositorio extends JpaRepository<Auditoria, Integer>{
}
