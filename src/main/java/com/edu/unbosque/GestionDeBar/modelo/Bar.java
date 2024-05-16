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
    String nombre_dueño;
    String nombre_bar;
    String tipo_bar;
    String direccion;
    String horario;
    Integer capacidad;
    String telefono;
}
