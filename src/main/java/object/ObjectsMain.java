package object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        // -------- Gyakorlati feladat - Objektumok
        new Book();
        //nem lehetséges később hozzáférni

        System.out.println(new Book());
        //objektum referencia

        //Book emptyBook;
        //System.out.println(emptyBook);
        //hiba, java: variable emptyBook might not have been initialized

        Book emptyBook = null;
        System.out.println(emptyBook);
        //"null"

        System.out.println(emptyBook == null);
        //"true"

        Book book = new Book();
        System.out.println(book);
        //book referencia

        book = null;
        System.out.println(book);
        //"null"

        book = new Book();
        System.out.println(book);
        //book új referencia

        Book anotherBook = new Book();
        System.out.println(book == anotherBook);
        //"false"

        // -------- Gyakorlati feladat - Objektumok száma
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;
        // 5 objektum keletkezett
        // 3-hoz lehet hozzáférni 1., 2., 3.

        // -------- Gyakorlati feladat - Tömbök és listák
        Book[] books = {new Book(), new Book(), new Book()};
        List<Book> bookList = new ArrayList<>(Arrays.asList(books));
        List<Book> otherBookList = new ArrayList<>();
        otherBookList.add(new Book());
        otherBookList.add(new Book());
        otherBookList.add(new Book());
        System.out.println(Arrays.toString(books));
        System.out.println(bookList);
        System.out.println(otherBookList);
    }
}
