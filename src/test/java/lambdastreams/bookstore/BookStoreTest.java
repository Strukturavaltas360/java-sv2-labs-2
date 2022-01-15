package lambdastreams.bookstore;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookStoreTest {
    Book b1 = new Book("b1", LocalDate.parse("1950-01-01"), 2000, 1);
    Book b2 = new Book("b2", LocalDate.parse("2022-01-01"), 4000, 10);
    Book b3 = new Book("b3", LocalDate.parse("2006-01-01"), 2500, 2);
    Book b4 = new Book("b4", LocalDate.parse("1995-01-01"), 1000, 3);
    Book b5 = new Book("b5", LocalDate.parse("1970-01-01"), 3000, 1);
    BookStore bs = new BookStore(List.of(b1, b2, b3, b4, b5));

    @Test
    void getNumberOfBooks() {
        assertEquals(17, bs.getNumberOfBooks());
    }

    @Test
    void findNewestBook() {
        assertEquals(b2, bs.findNewestBook().get());
    }

    @Test
    void getTotalValue() {
        assertEquals(53000, bs.getTotalValue());
    }
}