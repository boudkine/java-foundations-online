package ru.itsjava.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Data
public class Dog {
    private final String nickname;
    private int pawsCount;
   /* public Dog(String nickname, int pawsCount){
        this.nickname = nickname;
        this.pawsCount = pawsCount;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // если обращаемся к одному же объекту, то возварщаем true
        if (!(o instanceof Dog)) return false; // если объект не является собакой, то возвращаем значение false

        Dog dog = (Dog) o; //

        if (pawsCount != dog.pawsCount) return false; //если количество лап не совпало, то false
        return nickname.equals(dog.nickname);
    }

    @Override
    public int hashCode() {
        return nickname.hashCode(); //берет хэшкод
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", pawsCount=" + pawsCount +
                '}';
    }
            */
}
