package emsi.efoot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Stade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int capacite;
    private String disponibilite;
    private String description;
    private String image;
    private boolean supporteur;

    @OneToMany
    @JoinTable(name = "liste_joueurs_dans_stade")
    private List<Joueur> listJoueurs;
    @OneToMany
    @JoinTable(name = "liste_reservation_dans_stade")
    private List<Reservation> listReservations;

}
