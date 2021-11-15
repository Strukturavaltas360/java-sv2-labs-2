package introexceptionmoreexceptions;

import java.util.Locale;

public class Person {
    public static void main(String[] args) {
        Person person = new Person(null, 32);
        System.out.println(person);
        System.out.println(person.getName());
        //Kivétel, mert null értékű a String példány aminek a metódusát hívjuk meg
        System.out.println(person.getName().toUpperCase(Locale.ROOT));
    }

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, age: %d", name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
