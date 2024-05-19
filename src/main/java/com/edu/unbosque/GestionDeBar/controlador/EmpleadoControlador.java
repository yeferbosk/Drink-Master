package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.modelo.Empleado;
import com.edu.unbosque.GestionDeBar.servicio.IEmpleadoServicio;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoControlador {

    @Autowired
    private IEmpleadoServicio empleadoServicio;
    
    @GetMapping
    public List<Empleado> listarEmpleados() {
        return empleadoServicio.listarEmpleados();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> buscarEmpleadoPorId(@PathVariable Integer id) {
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if (empleado != null) {
            return new ResponseEntity<>(empleado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Empleado> guardarEmpleado(@RequestBody Empleado empleado) {
        empleadoServicio.guardarEmpleado(empleado);
        return new ResponseEntity<>(empleado, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Integer id, @RequestBody Empleado detallesEmpleado) {
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if (empleado != null) {
            empleado.setNombre(detallesEmpleado.getNombre());
            empleado.setCedula(detallesEmpleado.getCedula());
            empleado.setHorario(detallesEmpleado.getHorario());
            empleado.setCodigo(detallesEmpleado.getCodigo());
            empleado.setSueldo(detallesEmpleado.getSueldo());
            empleado.setRol(detallesEmpleado.getRol());
            empleado.setId_bar(detallesEmpleado.getId_bar());
            empleadoServicio.guardarEmpleado(empleado);
            return new ResponseEntity<>(empleado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEmpleado(@PathVariable Integer id) {
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if (empleado != null) {
            empleadoServicio.eliminarEmpleadoPorId(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
