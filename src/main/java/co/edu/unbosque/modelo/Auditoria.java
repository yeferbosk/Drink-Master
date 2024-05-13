package co.edu.unbosque.modelo;

import java.sql.Date;

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
public class Auditoria {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_auditoria;
	String descripcion;
	Date fecha;
	String valor_nuevo;
	String valor_antiguo;
	Integer id_empleado;
}
