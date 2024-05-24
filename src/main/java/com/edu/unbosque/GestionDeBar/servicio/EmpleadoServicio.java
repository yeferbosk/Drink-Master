package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.unbosque.GestionDeBar.modelo.Empleado;
import com.edu.unbosque.GestionDeBar.repositorio.EmpleadoRepositorio;

@Service
public class EmpleadoServicio implements IEmpleadoServicio {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    @Override
    public List<Empleado> listarEmpleados() {
        return this.empleadoRepositorio.findAll();
    }

    @Override
    public Empleado buscarEmpleadoPorId(Integer idEmpleado) {
        return this.empleadoRepositorio.findById(idEmpleado).orElse(null);
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return this.empleadoRepositorio.save(empleado);
    }

    @Override
    public void eliminarEmpleadoPorId(Integer idEmpleado) {
        this.empleadoRepositorio.deleteById(idEmpleado);
    }

    @Override
    public boolean validarCredenciales(String email, String password) {
        Empleado usuario = empleadoRepositorio.findByUsername(email);
        return usuario != null && usuario.getContrasena().equals(password);
    }

    @Override
    public Empleado findByEmaiEmpleado(String email) {
        return empleadoRepositorio.findByEmaiEmpleado(email);
    }
}