package interfacestaticmethods.schoolcild;

public interface PrimarySchoolChild {
    static PrimarySchoolChild of(int age) {
        if (age >= 6 && age <= 10) {
            return new LowerClassSchoolChild(age);
        } else if (age >= 11 && age <= 14) {
            return new UpperClassSchoolChild(age);
        } else {
            throw new IllegalArgumentException("Invalid age!");
        }
    }
}
