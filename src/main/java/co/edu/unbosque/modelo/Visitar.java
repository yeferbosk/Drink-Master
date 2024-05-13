package co.edu.unbosque.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Visitar {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_bar")
    private Bares bar;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
