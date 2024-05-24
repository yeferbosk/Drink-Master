package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import com.edu.unbosque.GestionDeBar.modelo.Empleado;

public interface IEmpleadoServicio {

    List<Empleado> listarEmpleados();

    Empleado buscarEmpleadoPorId(Integer idEmpleado);

    Empleado guardarEmpleado(Empleado empleado);

    void eliminarEmpleadoPorId(Integer idEmpleado);

    public boolean validarCredenciales(String email, String password);

    Empleado findByEmailQuery(String email);

}
