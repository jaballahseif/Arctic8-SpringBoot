package tn.esprit.tpstationdeski.service;

import org.springframework.stereotype.Service;

import lombok.*;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.tpstationdeski.entity.Piste;
import tn.esprit.tpstationdeski.entity.Skieur;
import tn.esprit.tpstationdeski.entity.SkieurDetails;
import tn.esprit.tpstationdeski.repository.ISkieurDetails;
import tn.esprit.tpstationdeski.repository.ISkieurRepo;
import tn.esprit.tpstationdeski.repository.IPisteRepo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class SkieurServiceImpl implements ISkieurService {
    @Autowired
    ISkieurRepo SkieurRepo;

    @Autowired
    IPisteRepo PisteRepo;

    @Autowired
    ISkieurDetails SkieurDetailsRepo;

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
    public Piste assignSkieurToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur = SkieurRepo.findById(numSkieur).orElse(null);
        Piste piste = PisteRepo.findById(numPiste).orElse(null);

        if (skieur != null && piste != null) {
            if (skieur.getPiste() == null) {
                skieur.setPiste(new ArrayList<>());
            }
            skieur.getPiste().add(piste);
            SkieurRepo.save(skieur);
            return piste;
        }
        return null;
    }

    @Override
    public List<Skieur> getUserByNumSkieurAndDateOfBirth(Long numSkieur, LocalDate dateStart, LocalDate dateEnd) {
        return SkieurRepo.findByNumSkieurAfterAndDateNaissanceBetween(numSkieur, dateStart, dateEnd);
    }

    @Override
    public void aassignSkieurToSkieurDetails(Long idUser, Long idDetails) {
        Skieur skieur = SkieurRepo.findById(idUser).orElse(null);
        SkieurDetails skieurDetails = SkieurDetailsRepo.findById(idDetails).orElse(null);
        skieurDetails.setSkieur(skieur);
        SkieurDetailsRepo.save(skieurDetails);




    }

}
