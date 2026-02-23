package tn.esprit.tpstationdeski.service;

import tn.esprit.tpstationdeski.entity.Skieur;
import tn.esprit.tpstationdeski.entity.Piste;

import java.util.List;

public interface ISkieurService {

    Skieur addSkieur(Skieur skieur);

    Skieur updateSkieur(Long numSkieur, String nomS, String prenomS);

    void deleteSkieur(Long numSkieur);

    List<Skieur> getAllSkieur();

    Skieur getSkieurById(Long numSkieur);

    Piste assignSkieurToPiste(Long numSkieur, Long numPiste);
}
