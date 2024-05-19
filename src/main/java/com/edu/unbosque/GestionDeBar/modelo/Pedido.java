package com.edu.unbosque.GestionDeBar.modelo;

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
@Table(name = "")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_pedido;
    java.math.BigDecimal precio;
    String descripcion;
    java.sql.Date fecha;
    Integer id_bar;
    Integer id_empleado;
    Integer id_cliente;
}
