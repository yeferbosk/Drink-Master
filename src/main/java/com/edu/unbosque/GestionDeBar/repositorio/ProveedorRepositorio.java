package com.edu.unbosque.GestionDeBar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.unbosque.GestionDeBar.modelo.Proveedor;

import java.util.List;

public interface ProveedorRepositorio extends JpaRepository<Proveedor, Integer> {
	List<Proveedor> findTop10ByOrderByHistorialComprasDesc();
}
