package tn.esprit.tpstationdeski.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class SkieurDetails {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idDetails;
    
}
