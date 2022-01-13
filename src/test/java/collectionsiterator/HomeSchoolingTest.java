package collectionsiterator;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeSchoolingTest {
    HomeSchooling hs = new HomeSchooling();
    OnlineLesson lesson1 = new OnlineLesson("teacher", "magyar", LocalDateTime.of(2022, 01, 14, 8, 0));
    OnlineLesson lesson2 = new OnlineLesson("teacher", "matek", LocalDateTime.of(2022, 01, 14, 9, 0));
    OnlineLesson lesson3 = new OnlineLesson("teacher", "történelem", LocalDateTime.of(2022, 01, 14, 10, 0));
    OnlineLesson lesson4 = new OnlineLesson("teacher", "tesi", LocalDateTime.of(2022, 01, 14, 11, 0));
    OnlineLesson lesson5 = new OnlineLesson("teacher", "info", LocalDateTime.of(2022, 01, 14, 12, 0));
    OnlineLesson lesson6 = new OnlineLesson("teacher", "matek", LocalDateTime.of(2022, 01, 14, 12, 0));

    @Test
    void addNewLesson() {
        hs.addNewLesson(lesson5);
        hs.addNewLesson(lesson3);
        hs.addNewLesson(lesson1);
        hs.addNewLesson(lesson6);
        hs.addNewLesson(lesson2);
        hs.addNewLesson(lesson4);
        assertEquals(List.of(lesson1, lesson2, lesson3, lesson4, lesson5, lesson6), hs.getLessons());
    }

    @Test
    void getLessonsByTitle() {
        addNewLesson();
        assertEquals(List.of(lesson2, lesson6), hs.getLessonsByTitle("matek"));
    }

    @Test
    void removeLesson() {
        addNewLesson();
        hs.removeLesson(LocalDateTime.of(2022, 01, 14, 12, 0));
        assertEquals(List.of(lesson1, lesson2, lesson3, lesson4), hs.getLessons());
        hs.removeLesson(LocalDateTime.of(2022, 01, 14, 10, 0));
        assertEquals(List.of(lesson1, lesson2, lesson4), hs.getLessons());
    }
}