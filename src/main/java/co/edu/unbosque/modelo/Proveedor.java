package co.edu.unbosque.modelo;

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
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idProveedor;
    String historial;
    String empresa;
    String descripcion;
    String telefono;
}
