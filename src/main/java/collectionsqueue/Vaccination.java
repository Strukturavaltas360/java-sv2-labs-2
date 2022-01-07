package collectionsqueue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("person15", 15),
                new Person("person19", 19),
                new Person("person65", 65),
                new Person("person50", 50),
                new Person("person70", 70),
                new Person("person23", 23)
        );
        Vaccination vaccination = new Vaccination();

        Queue<Integer> order = vaccination.getVaccinationOrder(people);
        System.out.println(order);
        System.out.println(order.poll());
        System.out.println(order.poll());
        System.out.println(order.poll());
        System.out.println(order.poll());
    }

    Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> result = new PriorityQueue<>();
        for (Person person: people) {
            int age = person.getAge();
            if (age >= 18 && age <= 65) {
                result.add(age);
            }
        }
        return result;
    }
}
