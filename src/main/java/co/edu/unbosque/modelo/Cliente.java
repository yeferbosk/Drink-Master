package co.edu.unbosque.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    private String direccion;
    private char estado;
    private int edad;
    private int historialGasto;
    private String nombre;
    private String ocupacion;
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "id_beneficio", nullable = false)
    private Beneficio beneficio;
}
