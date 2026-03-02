package tn.esprit.tpstationdeski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpstationdeski.entity.Skieur;
import tn.esprit.tpstationdeski.entity.SkieurDetails;

public interface ISkieurDetails extends JpaRepository<SkieurDetails, Long> {
}
