package genericsusage.withoutgenerics;

import genericsusage.Book;
import genericsusage.withgenerics.Library;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    List books = List.of(new Book("első"), new Book("második"), new Book("harmadik"));
    List wrong = List.of(10, new Book("második"), new Book("harmadik"));
    genericsusage.withgenerics.Library library = new Library();

    @Test
    void getFirstBookTest() {
        assertEquals("első", library.getFirstBook(books).getTitle());
    }

    @Test
    void getFirstBookNullPointerExceptionTest() {
        assertThrows(NullPointerException.class, () -> library.getFirstBook(null));
    }

    @Test
    void getFirstBookIllegalArgumentExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> library.getFirstBook(new ArrayList()));
    }

    @Test
    void getFirstBookClassCastExceptionTest() {
        assertThrows(ClassCastException.class, () -> library.getFirstBook(wrong));
    }
}