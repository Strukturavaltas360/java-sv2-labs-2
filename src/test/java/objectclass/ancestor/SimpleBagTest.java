package objectclass.ancestor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBagTest {
    SimpleBag simpleBag = new SimpleBag();
    Book book1 = new Book("Author1", "Title1");
    Book book2 = new Book("Author2", "Title2");
    Beer beer1 = new Beer("Beer1", 1);
    Beer beer2 = new Beer("Beer2", 2);

    @Test
    void putItem() {
        simpleBag.putItem(book1);
        simpleBag.putItem(beer1);
        assertEquals(2, simpleBag.size());
    }

    @Test
    void isEmpty() {
        assertTrue(simpleBag.isEmpty());
        simpleBag.putItem(book1);
        assertFalse(simpleBag.isEmpty());
    }

    @Test
    void beforeFirst() {
        simpleBag.putItem(book1);
        simpleBag.putItem(beer1);
        simpleBag.next();
        assertEquals(0, simpleBag.getCursor());
        simpleBag.beforeFirst();
        assertEquals(-1, simpleBag.getCursor());
    }

    @Test
    void hasNext() {
        simpleBag.putItem(book1);
        simpleBag.putItem(beer1);
        simpleBag.next();
        assertTrue(simpleBag.hasNext());
        simpleBag.next();
        assertFalse(simpleBag.hasNext());
    }

    @Test
    void next() {
        simpleBag.putItem(book1);
        simpleBag.putItem(book2);
        assertEquals(book1, simpleBag.next());
        assertEquals(book2, simpleBag.next());
        assertThrows(IndexOutOfBoundsException.class, () -> simpleBag.next());
    }

    @Test
    void contains() {
        simpleBag.putItem(book1);
        simpleBag.putItem(beer1);
        assertTrue(simpleBag.contains(book1));
        assertFalse(simpleBag.contains(beer2));
    }

    @Test
    void getCursor() {
        simpleBag.putItem(book1);
        simpleBag.putItem(beer1);
        simpleBag.next();
        assertEquals(0, simpleBag.getCursor());
    }
}