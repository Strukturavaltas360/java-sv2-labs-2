package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam {
    List<ExamResult> examResults;

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<String> result = new ArrayList<>();
        List<ExamResult> sortedList = new ArrayList<>(examResults);
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        for (int i = 0; i < places && i < sortedList.size(); i++) {
            result.add(sortedList.get(i).getName());
        }
        return result;
    }

    public List<ExamResult> getExamResults() {
        return examResults;
    }
}
