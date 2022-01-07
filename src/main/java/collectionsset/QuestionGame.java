package collectionsset;

import java.util.*;

public class QuestionGame {
    List<RightAnswer> rightAnswers;

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    Set<String> drawWinners() {
        Set<String> result = new HashSet();
        List<RightAnswer> differentAnswers = new ArrayList<>(new HashSet<RightAnswer>(rightAnswers));
        Random random = new Random();
        while (differentAnswers.size() > 0) {
            RightAnswer answer = differentAnswers.get(random.nextInt(differentAnswers.size()));
            result.add(answer.getName());
            if (result.size() == 5) {
                return result;
            }
            differentAnswers.remove(answer);
        }
        throw new IllegalArgumentException("Túl kevés megfejtés érkezett!");
    }

}
