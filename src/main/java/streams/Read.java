package streams;

import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Read {
    private List<Book> books;

    public Read(List<Book> books) {
        this.books = books;
    }

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages) {
        return books.stream()
                .filter(book -> book.getPages() < maxNumberOfPages)
                .map(Book::getTitle)
                .collect(Collectors.toList());
    }

    public List<String> listBookTitlesWithGivenAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .map(Book::getTitle)
                .sorted((o1, o2) -> Collator.getInstance().compare(o1, o2))
                .collect(Collectors.toList());
    }

    public List<String> listAuthors() {
        return books.stream()
                .map(Book::getAuthor)
                .distinct()
                .collect(Collectors.toList());
    }
}
