package com.edu.unbosque.GestionDeBar.modelo;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_empleado;
	String nombre;
	String cedula;
	String horario;
	Integer codigo;
	java.math.BigDecimal sueldo;
	String rol;
	Integer id_bar;
}
