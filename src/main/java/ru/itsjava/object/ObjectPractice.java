package ru.itsjava.object;

import lombok.AllArgsConstructor;


public class ObjectPractice {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1 == obj2);
        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        obj2 = obj1;
        System.out.println("obj2.equals(obj1) = " + obj2.equals(obj1));

        Dog gerda = new Dog("Герда", 4);
        Dog gerda2 = new Dog("Герда", 4);
        Dog eva = new Dog("Ева", 4);
        System.out.println("gerda.equals(gerda2) = " + gerda.equals(gerda2));
        System.out.println("gerda.equals(eva) = " + gerda.equals(eva));

        System.out.println("gerda.toString() = " + gerda);

        System.out.println("gerda.toString() = " + gerda);

    }
}
