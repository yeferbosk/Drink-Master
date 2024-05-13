package co.edu.unbosque.servicio;

import java.util.List;

import co.edu.unbosque.modelo.Empleado;

public interface IEmpleadoServicio {

    List<Empleado> listarEmpleados();

    Empleado buscarEmpleadoPorId(Integer idEmpleado);

    void guardarEmpleado(Empleado empleado);

    void eliminarEmpleadoPorId(Integer idEmpleado);
}
