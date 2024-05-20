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
public class Bar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_bar;
    String nombre_dueno;
    String nombre_bar;
    String tipo_bar;
    String direccion;
    String horario;
    Integer capacidad;
    String telefono;
    
	public Integer getId_bar() {
		return id_bar;
	}
	public void setId_bar(Integer id_bar) {
		this.id_bar = id_bar;
	}
	public String getNombre_dueno() {
		return nombre_dueno;
	}
	public void setNombre_dueno(String nombre_dueno) {
		this.nombre_dueno = nombre_dueno;
	}
	public String getNombre_bar() {
		return nombre_bar;
	}
	public void setNombre_bar(String nombre_bar) {
		this.nombre_bar = nombre_bar;
	}
	public String getTipo_bar() {
		return tipo_bar;
	}
	public void setTipo_bar(String tipo_bar) {
		this.tipo_bar = tipo_bar;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
