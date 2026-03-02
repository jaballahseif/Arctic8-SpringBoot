package tn.esprit.tpstationdeski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpstationdeski.entity.Skieur;

import java.time.LocalDate;
import java.util.List;

@Repository // java bean + options
// JpaRepository
// CRUD SQL vs CRUD SPRING
// create / insert = save()
// select = findById ()
// delete = deleteById ()
public interface ISkieurRepo extends JpaRepository<Skieur, Long> {

    List<Skieur> findByNumSkieurAfterAndDateNaissanceBetween(Long numSkieur, LocalDate dateStart, LocalDate dateEnd);

}
