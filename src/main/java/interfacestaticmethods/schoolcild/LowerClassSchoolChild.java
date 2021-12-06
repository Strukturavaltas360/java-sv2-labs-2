package interfacestaticmethods.schoolcild;

public class LowerClassSchoolChild implements PrimarySchoolChild {
    private String name;
    private int age;

    public LowerClassSchoolChild(int age) {
        this.age = age;
    }

    public LowerClassSchoolChild(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
