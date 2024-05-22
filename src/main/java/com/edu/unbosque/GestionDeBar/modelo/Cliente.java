package com.edu.unbosque.GestionDeBar.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
    private Integer idCliente;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "estado")
    private char estado;

    @Column(name = "edad")
    private int edad;

    @Column(name = "historial_gasto")
    private int historialGasto;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "ocupacion")
    private String ocupacion;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "id_beneficio")
    private Integer idBeneficio;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
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

	public long getHistorialGasto() {
		return historialGasto;
	}

	public void setHistorialGasto(int historialGasto) {
		this.historialGasto = historialGasto;
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

	public Integer getIdBeneficio() {
		return idBeneficio;
	}

	public void setIdBeneficio(Integer idBeneficio) {
		this.idBeneficio = idBeneficio;
	}
}