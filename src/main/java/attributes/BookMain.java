package attributes;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Első könyv");
        System.out.println(book.getTitle());
        book.setTitle("Javított cím");
        System.out.println(book.getTitle());
    }
}
