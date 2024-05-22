package com.edu.unbosque.GestionDeBar.modelo;


import java.sql.Date;

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
public class Auditoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idAuditoria;
	String descripcion;
	Date fecha;
	int valorNuevo;
	int valorAntiguo;
	Integer idEmpleado;

	public Integer getIdAuditoria() {
		return idAuditoria;
	}

	public void setIdAuditoria(Integer idAuditoria) {
		this.idAuditoria = idAuditoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getValorNuevo() {
		return valorNuevo;
	}

	public void setValorNuevo(int valorNuevo) {
		this.valorNuevo = valorNuevo;
	}

	public int getValorAntiguo() {
		return valorAntiguo;
	}

	public void setValorAntiguo(int valorAntiguo) {
		this.valorAntiguo = valorAntiguo;
	}

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
}