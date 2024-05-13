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
public class Participa {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_banda")
    private Banda banda;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_evento")
    private Evento evento;
}
