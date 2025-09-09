package org.example;

import java.time.LocalDate;

public class Prestataire extends Travailleur {
    private final double tjm;

    public Prestataire(int id, String nom, String prenom, String email, String telephone, double tjm) {
        super(id, nom, prenom, email, telephone);
        this.tjm = tjm;
    }

    public double getTjm() {
        return tjm;
    }

    public double calculerSalaire(LocalDate debut, LocalDate fin) {
        long joursPrestes = nombreJoursPrestes(debut, fin); // méthode héritée de Travailleur
        return joursPrestes * tjm;
    }
}

