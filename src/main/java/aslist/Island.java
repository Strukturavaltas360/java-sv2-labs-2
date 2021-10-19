package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("cipő", "zokni", "nadrág");
        System.out.println(importantThings);

        importantThings = new ArrayList<>(importantThings);
        importantThings.set(1, "gyufa");
        System.out.println(importantThings);
    }
}
