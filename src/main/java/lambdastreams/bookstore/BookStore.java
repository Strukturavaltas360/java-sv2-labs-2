package lambdastreams.bookstore;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookStore {
    private List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public Integer getNumberOfBooks() {
        return books.stream().reduce(
                0,
                (integer, book) -> integer + book.getQuantity(),
                (integer, integer2) -> integer + integer2);
    }

    public Optional<Book> findNewestBook() {
        return books.stream().max(Comparator.comparing(Book::getPrintDate));
    }

    public Integer getTotalValue() {
        return books.stream().reduce(
                0,
                (integer, book) -> integer + book.getQuantity() * book.getPrice(),
                (integer, integer2) -> integer + integer2);
    }

    public List<Book> getBooks() {
        return books;
    }
}
