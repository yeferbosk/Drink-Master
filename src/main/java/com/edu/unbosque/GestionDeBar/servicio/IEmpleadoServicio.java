package com.edu.unbosque.GestionDeBar.servicio;

import java.util.List;

import com.edu.unbosque.GestionDeBar.modelo.Empleado;

public interface IEmpleadoServicio {

    List<Empleado> listarEmpleados();

    Empleado buscarEmpleadoPorId(Integer idEmpleado);

    void guardarEmpleado(Empleado empleado);

    void eliminarEmpleadoPorId(Integer idEmpleado);
}
