package formatlocaleprintf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList(new String[] {"Blanka","Dömötör","Szabina"}));

        for (String name: names) {
            String msg = String.format("Kedves %s! Örülünk, hogy termékünket választotta!", name);
            System.out.println(msg);
        }
    }
}
