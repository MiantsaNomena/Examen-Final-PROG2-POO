package org.example;
import lombok.*;

import java.time.LocalDate;


@Getter
@AllArgsConstructor
public class Promotion {
    private LocalDate date;
    private double montant;
    private String raison;
}
