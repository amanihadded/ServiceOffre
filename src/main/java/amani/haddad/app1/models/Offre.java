package amani.haddad.app1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Offre {
    @Id
    @GeneratedValue
    long code;
    String intitule;
    String specialite;
    String societe;
    int nbpostes;
    String pays;

    // Constructeur sans arguments nécessaire pour Hibernate
    public Offre() {
    }

    // Constructeur avec paramètres
    public Offre(String intitule, String specialite, String societe, int nbpostes, String pays) {
        this.intitule = intitule;
        this.specialite = specialite;
        this.societe = societe;
        this.nbpostes = nbpostes;
        this.pays = pays;
    }
}
