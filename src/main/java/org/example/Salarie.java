package org.example;

import lombok.*;

import java.time.LocalDate;

@Getter
public class Salarie extends Travailleur {
    private double salaireMensuel;

    public Salarie(int id, String nom, String prenom, String email, String telephone, double salaireMensuel) {
        super(id, nom, prenom, email, telephone);
        this.salaireMensuel = salaireMensuel;
    }

    @Override
    public double calculerSalaire(LocalDate debut, LocalDate fin) {
        return salaireMensuel;
    }
}
