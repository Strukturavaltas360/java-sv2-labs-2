package collectionsmap;

import java.util.Map;

public class Casting {
    String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        Integer nextNumber = null;
        for (Map.Entry<Integer, String> entry: applicants.entrySet()) {
            if (entry.getKey() > lastNumber &&
                    (nextNumber == null || nextNumber > entry.getKey())) {
                nextNumber = entry.getKey();
            }
        }
        return nextNumber != null ? applicants.get(nextNumber) : null;
    }
}
