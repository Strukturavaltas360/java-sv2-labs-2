package algorithmssum.school;

import java.util.List;

public class School {
    public int getNumberOfStudents(List<Integer> headcounts) {
        int total = 0;
        if (headcounts != null) {
            for (Integer elem : headcounts) {
                total += elem;
            }
        }
        return total;
    }
}
