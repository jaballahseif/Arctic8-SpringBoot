package tn.esprit.tpstationdeski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpstationdeski.entity.Piste;

@Repository
public interface IPisteRepo extends JpaRepository<Piste, Long> {
}
