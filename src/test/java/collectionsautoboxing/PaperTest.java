package collectionsautoboxing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperTest {
    Paper paper = new Paper();

    @BeforeEach
    void init() {
        paper.putFurtherPaper("1.a", 20);
        paper.putFurtherPaper("5.b", 100);
        paper.putFurtherPaper("1.a", 30);
        paper.putFurtherPaper("8.a", 2);
        paper.putFurtherPaper("1.a", 40);
        paper.putFurtherPaper("8.a", 3);
        paper.putFurtherPaper("1.a", 50);
        paper.putFurtherPaper("5.b", 200);
        paper.putFurtherPaper("8.a", 1);
    }

    @Test
    void putFurtherPaper() {
        assertEquals(140, paper.getPapers().get("1.a"));
        assertEquals(300, paper.getPapers().get("5.b"));
        assertEquals(6, paper.getPapers().get("8.a"));
    }

    @Test
    void getWinnerClass() {
        assertEquals("5.b", paper.getWinnerClass());
    }

    @Test
    void getTotalWeight() {
        assertEquals(446, paper.getTotalWeight());
    }
}