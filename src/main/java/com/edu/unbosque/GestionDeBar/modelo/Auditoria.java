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
	Integer id_auditoria;
	String descripcion;
	Date fecha;
	String valor_nuevo;
	String valor_antiguo;
	Integer id_empleado;
	public Integer getId_auditoria() {
		return id_auditoria;
	}
	public void setId_auditoria(Integer id_auditoria) {
		this.id_auditoria = id_auditoria;
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
	public String getValor_nuevo() {
		return valor_nuevo;
	}
	public void setValor_nuevo(String valor_nuevo) {
		this.valor_nuevo = valor_nuevo;
	}
	public String getValor_antiguo() {
		return valor_antiguo;
	}
	public void setValor_antiguo(String valor_antiguo) {
		this.valor_antiguo = valor_antiguo;
	}
	public Integer getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(Integer id_empleado) {
		this.id_empleado = id_empleado;
	}
	
	
}
