package helpers;

public class Person {

    private String name;
    private int age;
    private String nationality;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }
}
