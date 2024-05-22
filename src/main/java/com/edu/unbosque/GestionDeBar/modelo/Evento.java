package com.edu.unbosque.GestionDeBar.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "evento")
public class Evento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento")
    private Integer idEvento;

    @Column(name = "tematica")
    private String tematica;

    @Column(name = "tipo_evento")
    private String tipoEvento;

    @Column(name = "hora_duracion")
    private String horaDuracion;

    @Column(name = "regalo_concurso")
    private String regaloConcurso;

    @Column(name = "id_bar")
    private Integer idBar;

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