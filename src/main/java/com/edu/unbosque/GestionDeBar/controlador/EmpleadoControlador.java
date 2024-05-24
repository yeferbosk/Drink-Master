package com.edu.unbosque.GestionDeBar.controlador;

import java.util.List;

import com.edu.unbosque.GestionDeBar.servicio.EmpleadoServicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edu.unbosque.GestionDeBar.excepcion.RecursoNoEncontradoExcepcion;
import com.edu.unbosque.GestionDeBar.modelo.Empleado;
import com.edu.unbosque.GestionDeBar.servicio.IEmpleadoServicio;

@RestController
@RequestMapping("/api/empleado")
@CrossOrigin(value = "http://localhost:4200")
public class EmpleadoControlador {
	
	private static final Logger logger = LoggerFactory.getLogger(ClienteControlador.class);

    @Autowired
    private EmpleadoServicio empleadoServicio;
    
    @GetMapping("/empleado")
    public List<Empleado> listarEmpleados() {
    	List<Empleado> empleado = this.empleadoServicio.listarEmpleados();
    	logger.info("Empleados obtenidos:" + empleado);
    	empleado.forEach((Empleado -> logger.info(empleado.toString())));
        return empleadoServicio.listarEmpleados();
    }

    @PostMapping("/guardar")
    public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
    	logger.info("EMpleado agregado: " + empleado);
    	return this.empleadoServicio.guardarEmpleado(empleado);
    }

    @GetMapping("/buscar")
    public ResponseEntity<Empleado> buscarEmpleadoPorId(@PathVariable Integer id) {
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if (empleado != null) {
            return ResponseEntity.ok(empleado);
        } else {
        	throw new RecursoNoEncontradoExcepcion("No se encontro el id: " + id);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> validarCredenciales(@RequestBody Empleado empleado) {
        boolean isValid = empleadoServicio.validarCredenciales(empleado.getEmail(), empleado.getContrasena());
        if (isValid) {
            return ResponseEntity.ok(empleadoServicio.findByEmaiEmpleado(empleado.getEmail()));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales incorrectas");
        }
    }


}
