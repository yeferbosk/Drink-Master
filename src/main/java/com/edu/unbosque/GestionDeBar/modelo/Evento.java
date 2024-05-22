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
public class Evento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idEvento;
	String tematica;
	String tipoEvento;
	String horaDuracion;
	String regaloConcurso;
	Integer idBar;

	public Integer getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public String getHoraDuracion() {
		return horaDuracion;
	}

	public void setHoraDuracion(String horaDuracion) {
		this.horaDuracion = horaDuracion;
	}

	public String getRegaloConcurso() {
		return regaloConcurso;
	}

	public void setRegaloConcurso(String regaloConcurso) {
		this.regaloConcurso = regaloConcurso;
	}

	public Integer getIdBar() {
		return idBar;
	}

	public void setIdBar(Integer idBar) {
		this.idBar = idBar;
	}
}