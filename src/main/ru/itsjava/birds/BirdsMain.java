package ru.itsjava.birds;

public class BirdsMain {
    public static void main(String[] args) {
        Birds parrot = new Parrots();
        Birds crow = new Crows();
        System.out.println("parrot.toString() = " + parrot);
        System.out.println("crow.toString() = " + crow);
    }
}