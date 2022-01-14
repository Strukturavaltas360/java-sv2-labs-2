package searching;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookSearchTest {
    Book book1 = new Book("Title2", "Author2");
    Book book2 = new Book("Títle1", "Aúthor1");
    Book book3 = new Book("Títle1", "Author1");
    Book book4 = new Book("Title1", "Author1");
    Book book5 = new Book("title1", "author1");
    BookSearch bs = new BookSearch(List.of(book1, book2, book3, book4, book5));

    @Test
    void findBookByAuthorTitleTest() {
        assertEquals(book1, bs.findBookByAuthorTitle("Author2", "Title2"));
    }

    @Test
    void findBookByAuthorTitleNotFoundTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () ->bs.findBookByAuthorTitle("Author1", "title1"));
        assertEquals("Can not find such book!", iae.getMessage());
    }

    @Test
    void findBookByAuthorTitleInvalidParamsTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () ->bs.findBookByAuthorTitle("", "title2"));
        assertEquals("Title and author must not be blank!", iae.getMessage());
        iae = assertThrows(IllegalArgumentException.class, () ->bs.findBookByAuthorTitle(null, "title2"));
        assertEquals("Title and author must not be blank!", iae.getMessage());
        iae = assertThrows(IllegalArgumentException.class, () ->bs.findBookByAuthorTitle("author", ""));
        assertEquals("Title and author must not be blank!", iae.getMessage());
        iae = assertThrows(IllegalArgumentException.class, () ->bs.findBookByAuthorTitle("author", null));
        assertEquals("Title and author must not be blank!", iae.getMessage());
    }

}