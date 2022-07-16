package ru.itsjava.oop;

public class Telephone {
    private final String brand;
    private boolean isHome;

    public Telephone(String brand){
        this.brand = brand;
    }
    public Telephone (String brand, boolean isHome){
        this.brand = brand;
        this.isHome  = isHome;
    }
    public String toString(){
        return "{brand: " + brand + " is home: " + isHome + "}";
    }
}
