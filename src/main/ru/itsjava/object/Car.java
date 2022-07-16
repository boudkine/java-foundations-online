package ru.itsjava.object;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Car {
    private final String brand;
    private boolean isNew;
    private int region;
}