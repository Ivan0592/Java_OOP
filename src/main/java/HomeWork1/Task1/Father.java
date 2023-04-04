package HomeWork1.Task1;

public class Father extends Childrens {
    protected Mother mother;

    public Father(String name, String surname, int DateOfBirth) {
        super(name, surname, DateOfBirth, "male");
        this.mother = mother;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

}
