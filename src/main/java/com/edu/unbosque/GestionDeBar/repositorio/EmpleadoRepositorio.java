package com.edu.unbosque.GestionDeBar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.edu.unbosque.GestionDeBar.modelo.Empleado;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
    Empleado findByEmail(String email);

    @Query("SELECT e FROM Empleado e WHERE e.email=?1")
    Empleado findByEmailQuery(String email); 
}
