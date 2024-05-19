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
public class Banda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_banda;
    String nombre;
    Integer numero_integrantes;
    String tipo_musica;
	public Integer getId_banda() {
		return id_banda;
	}
	public void setId_banda(Integer id_banda) {
		this.id_banda = id_banda;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getNumero_integrantes() {
		return numero_integrantes;
	}
	public void setNumero_integrantes(Integer numero_integrantes) {
		this.numero_integrantes = numero_integrantes;
	}
	public String getTipo_musica() {
		return tipo_musica;
	}
	public void setTipo_musica(String tipo_musica) {
		this.tipo_musica = tipo_musica;
	}
}
