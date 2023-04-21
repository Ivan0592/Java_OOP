package HomeWork2.Task2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Animals {
    private String nickname;
    private int age;

    public Animals(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }
}
