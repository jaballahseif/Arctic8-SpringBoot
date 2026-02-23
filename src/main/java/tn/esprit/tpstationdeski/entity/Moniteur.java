package tn.esprit.tpstationdeski.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity

public class Moniteur
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMonsieur;
    private String nomM;
    private String prenomM;
    private LocalDate dateRecru;

    @OneToMany
    private Set<Cours> cours;
}
