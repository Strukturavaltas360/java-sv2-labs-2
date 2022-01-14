package clone.issuetracker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class IssueTest {
    Issue original = new Issue("original");
    Comment comment1 = new Comment("comment1", LocalDateTime.now());
    Comment comment2 = new Comment("comment2", LocalDateTime.now());

    @BeforeEach
    void init() {
        original.add(comment1);
        original.add(comment2);
    }

    @Test
    void copyWithCommentsTest() {
        Issue copy = new Issue(original, Issue.CopyMode.WITH_COMMENTS);
        assertNotSame(original, copy);
        assertEquals(original.getName(), copy.getName());
        assertEquals(original.getTime(), copy.getTime());
        assertEquals(original.getStatus(), copy.getStatus());

        assertNotSame(original.getComments(), copy.getComments());
        assertEquals(original.getComments(), copy.getComments());
        assertNotSame(original.getComments().get(0), copy.getComments().get(0));
    }

    @Test
    void copyWithoutCommentsTest() {
        Issue copy = new Issue(original, Issue.CopyMode.WITHOUT_COMMENTS);
        assertNotSame(original, copy);
        assertEquals(original.getName(), copy.getName());
        assertEquals(original.getTime(), copy.getTime());
        assertEquals(original.getStatus(), copy.getStatus());
        assertTrue(copy.getComments().isEmpty());
    }
}