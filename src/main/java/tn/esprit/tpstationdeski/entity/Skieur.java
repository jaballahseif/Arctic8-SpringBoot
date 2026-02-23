package tn.esprit.tpstationdeski.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Skieur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;

    @OneToOne
    private Abonnement abonnement;
    @ManyToMany
    private List<Piste> piste;
    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptionsS;

    public Long getNumSkieur() {
        return numSkieur;
    }

    public void setNumSkieur(Long numSkieur) {
        this.numSkieur = numSkieur;
    }

    public String getNomS() {
        return nomS;
    }

    public void setNomS(String nomS) {
        this.nomS = nomS;
    }

    public String getPrenomS() {
        return prenomS;
    }

    public void setPrenomS(String prenomS) {
        this.prenomS = prenomS;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Abonnement getAbonnement() {
        return abonnement;
    }

    public void setAbonnement(Abonnement abonnement) {
        this.abonnement = abonnement;
    }

    public List<Piste> getPiste() {
        return piste;
    }

    public void setPiste(List<Piste> piste) {
        this.piste = piste;
    }

    public List<Inscription> getInscriptionsS() {
        return inscriptionsS;
    }

    public void setInscriptionsS(List<Inscription> inscriptionsS) {
        this.inscriptionsS = inscriptionsS;
    }
}
