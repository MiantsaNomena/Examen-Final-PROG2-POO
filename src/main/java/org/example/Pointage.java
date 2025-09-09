package org.example;
import lombok.*;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class Pointage {
    private LocalDate date;
    private TypeTravail type;
    private double quota; // entre 0 et 1
    private String description;

    public void verifierQuota() {
        if (quota <= 0 || quota > 1) {
            throw new IllegalArgumentException("Quota invalide : " + quota);
        }
    }
}
