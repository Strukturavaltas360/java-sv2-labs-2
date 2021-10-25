package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person1, person2;
        person1 = new Person("Blanka", 25);
        person2 = person1;
        person2.setName("Bianka");
        System.out.println(person1);
        System.out.println(person2);

        int i1, i2;
        i1 = 24;
        i2 = i1;
        i2++;
        System.out.println("i1: " + i1 + ", i2: " + i2);

        person1 = new Person("Dömötör", 26);
        System.out.println(person1);
        System.out.println(person2);
    }
}
