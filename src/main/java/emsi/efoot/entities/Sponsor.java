package emsi.efoot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sponsor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String libelle;
    private String promotion;
    private String description;
    @ManyToOne
    private Proprietaire proprietaire;
}
