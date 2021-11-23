package methodoverloading;

import java.util.List;

public class ClassFiveA {
    private List<String> names;

    public ClassFiveA(List<String> names) {
        this.names = names;
    }

    public String getTodayReferringStudent(int number) {
        return names.get(number);
    }

    public String getTodayReferringStudent(Number number) {
        return names.get(number.getValue());
    }

    public String getTodayReferringStudent(String numberName) {
        for (Number number: Number.values()) {
            if (number.name().equalsIgnoreCase(numberName)) {
                return getTodayReferringStudent(number);
            }
        }
        throw new IllegalArgumentException("Nincs ilyen számnév!");
    }

    public List<String> getNames() {
        return names;
    }
}
