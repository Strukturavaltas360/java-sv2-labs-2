package genericsusage.withoutgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {
    public Book getFirstBook(List books) {
        if (books.isEmpty()) {
            throw new IllegalArgumentException("List is empty!");
        }
        return (Book) books.get(0);
    }
}
