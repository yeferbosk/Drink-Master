package co.edu.unbosque.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.modelo.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer>{
}
