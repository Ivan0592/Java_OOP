package HomeWork1.Task1;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jon", "Dee", 1840, 1915, "male");
        Person person2 = new Person("Emmy", "Dee", 1842, 1928, "female");
        Childrens person3 = new Childrens("Sam", "Dee", 1898, 1962, "male");
        Childrens person4 = new Childrens("Kate", "Bush", 1900, 1978, "female");
        Childrens person5 = new Childrens("Lucky", "Trump", 1952, "male");
        System.out.println(person1);
        System.out.println(person3);
        person2.makeChildren(person1, person3);
        System.out.println(person1);
        System.out.println(person2);
        person3.makeChildren(person2,person3);
        System.out.println(person3);

        person3.makeChildren(person4, person5);
        System.out.println(person3);
        System.out.println(person5);
        System.out.println("Grandparents list of " + person5.getName() + " " + person5.getSurname() + " - " + person5.printGrandParentsList());
        Father father1 = new Father("Donald", "Bush", 1980);
        Mother mother1 = new Mother("Eliza", "Bush", 1985, father1);
        father1.setMother(mother1);
    }
}
