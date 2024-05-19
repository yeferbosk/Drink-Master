package com.edu.unbosque.GestionDeBar.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	public Integer getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(Integer id_empleado) {
		this.id_empleado = id_empleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public java.math.BigDecimal getSueldo() {
		return sueldo;
	}
	public void setSueldo(java.math.BigDecimal sueldo) {
		this.sueldo = sueldo;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public Integer getId_bar() {
		return id_bar;
	}
	public void setId_bar(Integer id_bar) {
		this.id_bar = id_bar;
	}
}
