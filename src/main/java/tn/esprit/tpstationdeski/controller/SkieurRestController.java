package tn.esprit.tpstationdeski.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.*;
import tn.esprit.tpstationdeski.entity.Skieur;
import tn.esprit.tpstationdeski.entity.Piste;
import tn.esprit.tpstationdeski.repository.ISkieurRepo;
import tn.esprit.tpstationdeski.service.ISkieurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/skieur")
public class SkieurRestController {

    @Autowired
    ISkieurService iSkieurService;

    @PostMapping(path = "/")
    public Skieur addSkieur(@RequestBody Skieur skieur) {
        return iSkieurService.addSkieur(skieur);

    }

    @PutMapping("/{num}/{first-name}/{last-name}")
    public Skieur updateSkieur(@PathVariable("num") Long numSkieur, @PathVariable("first-name") String nomS,
            @PathVariable("last-name") String prenomS) {
        return iSkieurService.updateSkieur(numSkieur, nomS, prenomS);
    }

    @DeleteMapping("/{id}")
    void deleteSkieur(@PathVariable("id") Long numSkieur) {
        iSkieurService.deleteSkieur(numSkieur);

    }

    @GetMapping("/Users")
    List<Skieur> getAllSkieur() {
        return iSkieurService.getAllSkieur();
    }

    @GetMapping("/{id}")
    Skieur getSkieurById(@PathVariable("id") Long numSkieur) {
        return iSkieurService.getSkieurById(numSkieur);
    }

    @PutMapping("/{numSkieur}/{numPiste}")
    public Piste assignSkieurToPiste(@PathVariable("numSkieur") Long numSkieur,
            @PathVariable("numPiste") Long numPiste) {
        return iSkieurService.assignSkieurToPiste(numSkieur, numPiste);
    }
}
