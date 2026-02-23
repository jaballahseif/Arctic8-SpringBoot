package tn.esprit.tpstationdeski.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInscription;
    private int numSemaine;

    @ManyToOne
    private Skieur skieur;
    @ManyToOne
    private Cours cours;

}
