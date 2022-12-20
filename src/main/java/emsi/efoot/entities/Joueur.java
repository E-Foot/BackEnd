package emsi.efoot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("player")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Joueur extends Utilisateur {
    private Date dateCreation;
    private String etatSignal;
    private String etatBlockage;

    @OneToMany
    @JoinTable(name = "liste_paiements_pour_joueur")
    private List<Paiement> listPaiements;
    @OneToMany
    @JoinTable(name = "liste_reservations_pour_joueur")
    private List<Reservation> listReservations;

    @ManyToMany
    @JoinTable(name = "AnnoncesParJoueurs",
        joinColumns = @JoinColumn(name = "joueur_id"),
        inverseJoinColumns = @JoinColumn(name = "annonce_id"))
    private List<Annonce> annonceList;

}
