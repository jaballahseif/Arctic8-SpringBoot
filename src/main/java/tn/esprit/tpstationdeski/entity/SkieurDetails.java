package tn.esprit.tpstationdeski.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SkieurDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idDetails;
    @ManyToOne
    Skieur skieur;
}
