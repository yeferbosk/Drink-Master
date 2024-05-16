package com.edu.unbosque.GestionDeBar.modelo;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Contiene {
    Integer id_pedido;
    Integer id_bebida;
}
