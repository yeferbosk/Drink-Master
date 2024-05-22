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
@Table(name = "bar")
public class Bar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_bar")
    private Integer idBar;

    @Column(name = "nombre_dueno")
    private String nombreDueno;

    @Column(name = "nombre_bar")
    private String nombreBar;

    @Column(name = "tipo_bar")
    private String tipoBar;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "horario")
    private String horario;

    @Column(name = "capacidad")
    private long capacidad;

    @Column(name = "telefono")
    private String telefono;

	public Integer getIdBar() {
		return idBar;
	}

	public void setIdBar(Integer idBar) {
		this.idBar = idBar;
	}

	public String getNombreDueno() {
		return nombreDueno;
	}

	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}

	public String getNombreBar() {
		return nombreBar;
	}

	public void setNombreBar(String nombreBar) {
		this.nombreBar = nombreBar;
	}

	public String getTipoBar() {
		return tipoBar;
	}

	public void setTipoBar(String tipoBar) {
		this.tipoBar = tipoBar;
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

	public Long getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Long capacidad) {
		this.capacidad = capacidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}