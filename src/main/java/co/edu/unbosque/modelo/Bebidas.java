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
public class Bebidas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_bar;
	String nombre;
	String descripcion;
	String marca;
	String tipo;
	boolean disponibilidad;
	//Posible a cambiar
	double precio;
	Integer id_provedor;
}
