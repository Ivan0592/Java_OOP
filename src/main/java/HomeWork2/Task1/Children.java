package HomeWork2.Task1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Children extends Person {
    public Children(String firstName, int age) {
        super( firstName, age );
    }
}
