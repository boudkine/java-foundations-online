package ru.itsjava.birds;

import lombok.AllArgsConstructor;
import lombok.ToString;
@ToString
@AllArgsConstructor
public class Birds {
    private final String breed;
    private final boolean isRare;
    private final int numberOfLegs;
}
