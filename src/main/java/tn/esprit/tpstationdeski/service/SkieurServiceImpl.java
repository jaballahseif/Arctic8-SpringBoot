package tn.esprit.tpstationdeski.service;

import org.springframework.stereotype.Service;

import lombok.*;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.tpstationdeski.entity.Skieur;
import tn.esprit.tpstationdeski.repository.ISkieurRepo;
import tn.esprit.tpstationdeski.repository.IPisteRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class SkieurServiceImpl implements ISkieurService {
    @Autowired
    ISkieurRepo SkieurRepo;

    @Autowired
    IPisteRepo PisteRepo;

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return SkieurRepo.save(skieur);
    }

    @Override
    public Skieur updateSkieur(Long numSkieur, String nomS, String prenomS) {
        Skieur u = SkieurRepo.findById(numSkieur).orElse(null);
        if (u != null) {
            u.setNomS(nomS);
            u.setPrenomS(prenomS);
            return SkieurRepo.save(u);
        }
        return null;
    }

    @Override
    public void deleteSkieur(Long numSkieur) {
        SkieurRepo.deleteById(numSkieur);

    }

    @Override
    public List<Skieur> getAllSkieur() {
        return SkieurRepo.findAll();

    }

    @Override
    public Skieur getSkieurById(Long numSkieur) {
        return SkieurRepo.findById(numSkieur).orElse(null);
    }

    @Override
    public tn.esprit.tpstationdeski.entity.Piste assignSkieurToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur = SkieurRepo.findById(numSkieur).orElse(null);
        tn.esprit.tpstationdeski.entity.Piste piste = PisteRepo.findById(numPiste).orElse(null);

        if (skieur != null && piste != null) {
            if (skieur.getPiste() == null) {
                skieur.setPiste(new java.util.ArrayList<>());
            }
            skieur.getPiste().add(piste);
            SkieurRepo.save(skieur);
            return piste;
        }
        return null;
    }
}
