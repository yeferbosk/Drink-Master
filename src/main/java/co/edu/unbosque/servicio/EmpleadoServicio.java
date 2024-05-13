package co.edu.unbosque.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.modelo.Empleado;
import co.edu.unbosque.repositorio.EmpleadoRepositorio;

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
    public void guardarEmpleado(Empleado empleado) {
        this.empleadoRepositorio.save(empleado);
    }

    @Override
    public void eliminarEmpleadoPorId(Integer idEmpleado) {
        this.empleadoRepositorio.deleteById(idEmpleado);
    }
}