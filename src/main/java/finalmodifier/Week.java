package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {
    public static final List<String> DAY_OF_WEEK = Arrays.asList(
            "hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap");

    public static void main(String[] args) {
        System.out.println(DAY_OF_WEEK);
        DAY_OF_WEEK.set(1, "szerda");
        System.out.println(DAY_OF_WEEK);
    }
}
