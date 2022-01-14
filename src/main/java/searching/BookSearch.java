package searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookSearch {
    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = new ArrayList<>(books);
        Collections.sort(this.books);
    }

    public Book findBookByAuthorTitle(String author, String title) {
        if (title == null || author == null || title.isBlank() || author.isBlank()) {
            throw new IllegalArgumentException("Title and author must not be blank!");
        }
        int index = Collections.binarySearch(books, new Book(title, author));
        if (index < 0) {
            throw new IllegalArgumentException("Can not find such book!");
        }
        return books.get(index);
    }

    public List<Book> getBooks() {
        return books;
    }
}
