package emsi.efoot.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("owner")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor

public class Proprietaire extends Utilisateur {
    private Date dateCreation;
    private String etatSignal;
    private String etatBlockage;
    private String cin;
    @OneToMany
    @JoinTable(name = "liste_paiements_pour_proprietaire")
    private List<Paiement> listPaiements;

    @OneToMany(mappedBy = "proprietaire")
    private List<Evenement> evenementList;

    @OneToMany(mappedBy = "proprietaire")
    private List<Sponsor> sponsorList;
}
