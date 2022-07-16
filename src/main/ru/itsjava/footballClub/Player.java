package ru.itsjava.footballClub;

public class Player {
    private final String name;
    private final boolean rightFooted;
    private final int shirtNumber;

    public Player(String name, boolean rightFooted, int shirtNumber) {
        this.name = name;
        this.rightFooted = rightFooted;
        this.shirtNumber = shirtNumber;
    }

    public String toString() {
        return "Name: " + name + ". Right-footed: " + rightFooted + "Shirt number: " + shirtNumber;
    }
}
