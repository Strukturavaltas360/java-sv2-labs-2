package catalog;

import java.util.List;

public class Validators {
    public static boolean isBlank(String value) {
        return value == null || value.trim().isBlank();
    }

    public static boolean isEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }
}
