package methodparam.marriage;

import java.util.ArrayList;
import java.util.List;

public class Man {
    private String name;
    private List<RegisterDate> registerDates = new ArrayList<>();

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<RegisterDate> getRegisterDates() {
        return registerDates;
    }
}
