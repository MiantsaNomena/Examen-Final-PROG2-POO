package org.example;

import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class Travailleur {
    protected int id;
    protected String nom;
    protected String prenom;
    protected String email;
    protected String telephone;
    protected List<Pointage> pointages = new ArrayList<>();
    protected List<Promotion> promotions = new ArrayList<>();

    public Travailleur(int id, String nom, String prenom, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }

    public long nombreJoursPrestes(LocalDate debut, LocalDate fin) {
        return pointages.stream()
                .filter(p -> !p.getType().name().startsWith("ABS"))
                .filter(p -> !p.getDate().isBefore(debut) && !p.getDate().isAfter(fin))
                .count();
    }

    public abstract double calculerSalaire(LocalDate debut, LocalDate fin);
}
