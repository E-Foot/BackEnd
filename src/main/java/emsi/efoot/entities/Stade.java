package emsi.efoot.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Stade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int capacite;
    private String disponibilite;
    private String description;
    private String image;
    private boolean supporteur;
    private double prixParHeure;

    @OneToMany
    @JoinTable(name = "liste_joueurs_dans_stade")
    private List<Joueur> listJoueurs;

    @ManyToOne
   // @JsonBackReference
    private Complexe complexe;

}
