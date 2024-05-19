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
    Integer id_evento;
    String tematica;
    String tipo_evento;
    String hora_duracion;
    String regalo_concurso;
    Integer id_bar;
    
	public Integer getId_evento() {
		return id_evento;
	}
	public void setId_evento(Integer id_evento) {
		this.id_evento = id_evento;
	}
	public String getTematica() {
		return tematica;
	}
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	public String getTipo_evento() {
		return tipo_evento;
	}
	public void setTipo_evento(String tipo_evento) {
		this.tipo_evento = tipo_evento;
	}
	public String getHora_duracion() {
		return hora_duracion;
	}
	public void setHora_duracion(String hora_duracion) {
		this.hora_duracion = hora_duracion;
	}
	public String getRegalo_concurso() {
		return regalo_concurso;
	}
	public void setRegalo_concurso(String regalo_concurso) {
		this.regalo_concurso = regalo_concurso;
	}
	public Integer getId_bar() {
		return id_bar;
	}
	public void setId_bar(Integer id_bar) {
		this.id_bar = id_bar;
	}
    
    
}
