package HomeWork1.Task1;

import java.util.*;

public class Person {
    private String name;
    private String surname;
    private int DateOfBirth;
    private int DateOfDeath;
    private String gender;
    private ArrayList<Childrens> ChildrenList;

    public Person(String name, String surname, int DateOfBirth, int DateOfDeath, String gender, ArrayList<Childrens> ChildrenList) {
        this.name = name;
        this.surname = surname;
        this.DateOfBirth = DateOfBirth;
        this.DateOfDeath = DateOfDeath;
        while (gender.toLowerCase().equals("male") && gender.toLowerCase().equals("female")) {
            System.out.println("Wrong gender. Put 1- male of 2 - female");
            Map<Integer, String> genderList = new HashMap<>();
            genderList.put(1, "male");
            genderList.put(2, "female");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            gender = genderList.get(n);
        }
        this.gender = gender.toLowerCase();
        this.ChildrenList = ChildrenList;
    }

    public Person(String name, String surname, int DateOfBirth, int DateOfDeath, String gender) {
        this(name, surname, DateOfBirth, DateOfDeath, gender, new ArrayList<>());
    }

    public Person(String name, String surname, int DateOfBirth, String gender){
        this(name, surname, DateOfBirth, 99999, gender, new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public int getDateOfDeath() {
        return DateOfDeath;
    }

    public String getGender() {
        return gender;
    }

    public ArrayList<Childrens> getChildrenList() {
        return ChildrenList;
    }


    @Override
    public String toString() {
        String DeathDate;
        if (DateOfDeath >= 99999) {
            DeathDate = "up to now";
        } else {
            DeathDate = Integer.toString(this.DateOfDeath);
        }

        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                ", DateOfDeath=" + DeathDate +
                ", gender='" + gender + '\'' +
                ", Children=" + this.printChildrenList()+
                '}';
    }

    public Map<Integer , String> printChildrenList(){
        int i = 1;
        Map <Integer, String> s = new HashMap<>();
        for (Person ch:this.getChildrenList()) {
            s.put(i, "name-" +ch.getName()+ " surname-" + ch.getSurname() + " DOB-"+ ch.getDateOfBirth());
        }
        return s;
    }

    public boolean checkTomakeChildren (Person parent2,Childrens children ){
        if (this.DateOfDeath < parent2.getDateOfBirth() || this.DateOfBirth > parent2.getDateOfDeath()) {
            System.out.println("Error. One of the parents already DEAD");
            return false;
        }
        if (this.gender.toLowerCase().equals(parent2.getGender().toLowerCase())) {
            System.out.println("Error. Parents have same gender");
            return false;
        }
        if (children.getDateOfBirth() < this.DateOfBirth || children.getDateOfBirth() < parent2.getDateOfBirth()) {
            System.out.println("Error. Children older then one of the parent");
            return false;
        }
        if (children.getPerentsList().isEmpty()==false  ){
            System.out.println("Children " + children.getName()+ " " + children.getSurname() +" already has parents");
            return false;
        }
        return true;
    }
    public void makeChildren(Person parent2, Childrens children) {
        if (this.checkTomakeChildren(parent2, children) == false) {
            return;
        }
        this.ChildrenList.add(children);
        parent2.ChildrenList.add(children);
        children.PerentsList.add(this);
        children.PerentsList.add(parent2);
    }

}
