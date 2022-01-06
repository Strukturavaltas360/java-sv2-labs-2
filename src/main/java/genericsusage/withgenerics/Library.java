package genericsusage.withgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {
    public Book getFirstBook(List<Book> books) {
        if (books.isEmpty()) {
            throw new IllegalArgumentException("List is empty!");
        }
        return books.get(0);
    }
}
