package ru.itsjava.object;

public class ObjectHomeWork {
    public static void main(String[] args) {
        Object lada = new Car("Лада", true, 5);
        Object lada2 = new Car("Лада", false, 116);
        Object vaz = new Car("Лада", true, 5);

        System.out.println("Сравнение по трем показателям: lada.equals(lada2) = " + lada.equals(lada2));
        System.out.println("Сравнение по трем показателям: lada.equals(vaz) = " + lada.equals(vaz));
        System.out.println("vaz.toString() = " + vaz);
        System.out.println("lada.toString() = " + lada);
        System.out.println("lada2.toString() = " + lada2);

    }
}