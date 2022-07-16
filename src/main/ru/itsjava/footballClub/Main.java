package ru.itsjava.footballClub;

public class Main {
    public static void main(String[] args) {
        Player goalkeeper = new Goalkeeper();
        Player defender = new Defender();
        Player midfielder = new Midfielder();
        Player striker = new Striker();
        System.out.println("GOALKEEPER " + goalkeeper);
        System.out.println("DEFENDER " + defender);
        System.out.println("MIDFIELDER: " + midfielder);
        System.out.println("STRIKER " + striker);
    }
}
