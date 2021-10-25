package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    List<String> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(title);
    }

    public void findBookAndSetAuthor(String title, String author) {
        int bookIndex = -1;
        for (int i = 0; i < books.size() && bookIndex < 0; i++) {
            if (books.get(i).equals(title)) bookIndex = i;
        }
        if (bookIndex >= 0) {
            books.set(bookIndex, author + ": " + title);
        }
    }

    public List<String> getBooks() {
        return books;
    }
}
