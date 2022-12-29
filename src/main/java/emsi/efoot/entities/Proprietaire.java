package emsi.efoot.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
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
    @OneToOne(mappedBy = "proprietaire")
    private Complexe complexe;
    @OneToMany
    @JoinTable(name = "liste_paiements_pour_proprietaire")
    private List<Paiement> listPaiements;

    @OneToMany(mappedBy = "proprietaire")
    @JsonManagedReference
    private List<Evenement> evenementList;

    @OneToMany(mappedBy = "proprietaire")
    private List<Sponsor> sponsorList;
}
