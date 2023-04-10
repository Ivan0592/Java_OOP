package HomeWork1.Task1;
import java.util.*;

public class Childrens extends Person {
    protected List<Person> PerentsList;

    public Childrens(String name, String surname, int DateOfBirth, int DateOfDeath, String gender, ArrayList<Childrens> ChildrenList, List<Person> PerentsList) {
        super(name, surname, DateOfBirth, DateOfDeath, gender, ChildrenList);
        this.PerentsList = PerentsList;
    }

    public Childrens(String name, String surname, int DateOfBirth, int DateOfDeath, String gender) {
        this(name, surname, DateOfBirth, DateOfDeath, gender, new ArrayList<>(), new ArrayList<>());
    }

    public Childrens(String name, String surname, int DateOfBirth, String gender) {
        super(name, surname, DateOfBirth, gender);
        this.PerentsList = new ArrayList<>();
    }


    public List<Person> getPerentsList() {
        return PerentsList;
    }

    @Override
    public String toString() {

        return super.toString() +
                "Parents=" + this.printParentsList() +
                '}';
    }

    public Map<Integer, String> printParentsList() {
        int i = 1;
        Map<Integer, String> s = new HashMap<>();
        for (Person ch : this.getPerentsList()) {
            s.put(i, "name-" + ch.getName() + " surname-" + ch.getSurname() + " DOB-" + ch.getDateOfBirth());
            i++;
        }
        return s;
    }

    public Map<Integer, String> printGrandParentsList() {
        ;
        Map<Integer, String> s = new HashMap<>();
        for (Person ch : this.getPerentsList()
        ) {
            if (ch instanceof Childrens) {
                s.putAll(((Childrens) ch).printParentsList());
            }
        }
        return s;
    }

}
