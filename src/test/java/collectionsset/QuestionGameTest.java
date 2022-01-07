package collectionsset;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class QuestionGameTest {
    List<RightAnswer> notEnoughAnswers = List.of(
            new RightAnswer("name1"),
            new RightAnswer("name2"),
            new RightAnswer("name3"),
            new RightAnswer("name4"),
            new RightAnswer("name1"),
            new RightAnswer("name2"),
            new RightAnswer("name3"),
            new RightAnswer("name4")
    );

    List<RightAnswer> enoughAnswers = new ArrayList<>(notEnoughAnswers);
    {
        enoughAnswers.addAll(List.of(
                new RightAnswer("name5"),
                new RightAnswer("name6")
        ));
    }

    @Test
    void drawWinnersEnoughTest() {
        QuestionGame questionGame = new QuestionGame(enoughAnswers);
        Set<String> result = questionGame.drawWinners();
        assertEquals(5, result.size());
    }

    @Test
    void drawWinnersNotEnoughTest() {
        QuestionGame questionGame = new QuestionGame(notEnoughAnswers);
        assertThrows(IllegalArgumentException.class, () -> questionGame.drawWinners());
    }
}