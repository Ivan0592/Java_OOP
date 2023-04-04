package Seminar1;
public class Person {
    private String name;
    private Integer age;
    private String status;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Integer getAge () {
        return age;
    }
        public String getName () {
            return name;
        }
}