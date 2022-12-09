package emsi.efoot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Complexe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String adresse;
    @OneToOne
    private Proprietaire proprietaire;
    @OneToMany
    @JoinTable(name = "liste_stade_dans_complexe")
    private List<Stade> listStades;
}
