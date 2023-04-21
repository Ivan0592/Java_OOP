package HomeWork2.Task2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Persons {
    public String name;
    public int age;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }
}