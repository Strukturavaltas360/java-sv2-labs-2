package streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReadTest {
    Book b1 = new Book("author1", "title3", 100);
    Book b2 = new Book("author1", "title2", 50);
    Book b3 = new Book("author2", "title1", 90);
    Read read = new Read(List.of(b1, b2, b3));

    @Test
    void listBookTitlesShorterThanGiven() {
        assertEquals(List.of("title2", "title1"), read.listBookTitlesShorterThanGiven(100));
    }

    @Test
    void listBookTitlesWithGivenAuthor() {
        assertEquals(List.of("title2", "title3"), read.listBookTitlesWithGivenAuthor("author1"));
    }

    @Test
    void listAuthors() {
        assertEquals(List.of("author1", "author2"), read.listAuthors());
    }
}