package searching;

import java.text.Collator;
import java.util.Locale;
import java.util.Objects;

public class Book implements Comparable<Book> {
    static private int nextId = 1;
    static private int getNextId() {
        return nextId++;
    }

    private int id;
    private String title;
    private String author;

    public Book(String title, String author) {
        if (title == null || author == null || title.isBlank() || author.isBlank()) {
            throw new IllegalArgumentException("Title and author must not be blank!");
        }
        this.title = title;
        this.author = author;
        this.id = getNextId();
    }

    @Override
    public int compareTo(Book o) {
        if (this.author.equals(o.author)) {
            return this.title.compareTo(o.title);
        }
        return this.author.compareTo(o.author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
