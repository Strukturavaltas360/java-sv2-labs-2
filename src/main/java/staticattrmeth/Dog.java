package staticattrmeth;

public class Dog {
    private String name;
    private int age;
    private Spiecies spiecies;
    private long code;

    public Dog(String name, int age, Spiecies spiecies) {
        this.name = name;
        this.age = age;
        this.spiecies = spiecies;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Spiecies getSpiecies() {
        return spiecies;
    }

    public long getCode() {
        return code;
    }
}
