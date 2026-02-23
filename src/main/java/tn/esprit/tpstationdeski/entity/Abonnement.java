package tn.esprit.tpstationdeski.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //gestion des valeurs d'id niveau base de donnes auto_increment
    //@GeneratedValue(strategy = GenerationType.IDENTITY)//id++
    //@GeneratedValue(strategy = GenerationType.AUTO)//deleguation de la tache en faveur de l orm  (maniere automatique)
    //@GeneratedValue(strategy = GenerationType.TABLE)//user1,user2
    private Long numAbon;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeavion;

    @OneToOne
    private Skieur skieur;


}
