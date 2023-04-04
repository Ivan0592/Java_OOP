package HomeWork1.Task1;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
public class Mother extends Childrens {
    protected Father father;

    public Mother(String name, String surname, int YearOfBirth, Father father) {
        super(name, surname, YearOfBirth, "female");
        this.father = father;
    }

}
