package Seminar1;

public class Programm {
    public static void main(String[] args) {


        Person person = new Person("Petr",25);
        Person person2 = new Person("Vasya",3);
        Parents parent = new Parents(person, Status.parents);
        Kids kid = new Kids(person2, Status.children);

        if (Status.parents == parent.getStatus()) {
            System.out.printf("%s Является роителем %s", parent.getName(), kid.getName());

        }
    }
}
