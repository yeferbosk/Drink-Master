package co.edu.unbosque.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
public class Vende {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_bares")
    private Bares bar;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_bebidas")
    private Bebidas bebida;

}
