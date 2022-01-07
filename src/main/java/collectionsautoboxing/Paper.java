package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {
    Map<String, Integer> papers = new HashMap<>();

    public void putFurtherPaper(String className, int kilogramms) {
        Integer classKg = papers.get(className);
        classKg = classKg != null ? classKg + kilogramms : kilogramms;
        papers.put(className, classKg);
    }

    public String getWinnerClass() {
        Map.Entry<String, Integer> winner = null;
        for (Map.Entry<String, Integer> actual: papers.entrySet()) {
            if (winner == null || winner.getValue() < actual.getValue()) {
                winner = actual;
            }
        }
        return winner.getKey();
    }

    public int getTotalWeight() {
        int total = 0;
        for (Map.Entry<String, Integer> actual: papers.entrySet()) {
            total += actual.getValue();
        }
        return total;
    }

    public Map<String, Integer> getPapers() {
        return papers;
    }
}
