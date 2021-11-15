package introexceptionthrow;

public class Adult {
    String name;
    int age;

    public Adult(String name, int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Csak 18 év felett megengedett!");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
