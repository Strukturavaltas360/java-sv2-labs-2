package collectionsequalshash;

import java.util.Objects;

public class Person {
    public static void main(String[] args) {
        Person p1 = new Person("xxx yyy", 20, "taj1");
        Person p2 = new Person("aa bbb", 30, "taj1");
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() + " " + p2.hashCode());
    }

    private String name;
    private int age;
    private String tajNumber;

    public Person(String name, int age, String tajNumber) {
        this.name = name;
        this.age = age;
        this.tajNumber = tajNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(this.getTajNumber(), person.getTajNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(tajNumber);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTajNumber() {
        return tajNumber;
    }
}
