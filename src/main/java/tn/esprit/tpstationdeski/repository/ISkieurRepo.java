package tn.esprit.tpstationdeski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpstationdeski.entity.Skieur;

@Repository // java bean + options
// JpaRepository
// CRUD SQL vs CRUD SPRING
// create / insert = save()
// select = findById ()
// delete = deleteById ()
public interface ISkieurRepo extends JpaRepository<Skieur,Long> {

}
