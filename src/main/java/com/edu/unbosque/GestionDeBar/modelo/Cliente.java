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
public class Cliente {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_cliente;
    String direccion;
    Character estado;
    Integer edad;
    Integer historial_gasto;
    String nombre;
    String ocupacion;
    String telefono;
    Integer id_beneficio;
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Character getEstado() {
		return estado;
	}
	public void setEstado(Character estado) {
		this.estado = estado;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getHistorial_gasto() {
		return historial_gasto;
	}
	public void setHistorial_gasto(Integer historial_gasto) {
		this.historial_gasto = historial_gasto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Integer getId_beneficio() {
		return id_beneficio;
	}
	public void setId_beneficio(Integer id_beneficio) {
		this.id_beneficio = id_beneficio;
	}
}
