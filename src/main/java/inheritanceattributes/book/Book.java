package inheritanceattributes.book;

public class Book {
    private String title;
    protected int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public int purchase(int pieces) {
        return pieces * price;
    }

    public String getTitle() {
        return title;
    }
}
