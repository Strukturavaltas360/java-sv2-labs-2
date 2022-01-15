package lambdastreams.bookstore;

import java.time.LocalDate;

public class Book {
    private String title;
    private LocalDate printDate;
    private int price;
    private int quantity;

    public Book(String title, LocalDate printDate, int price, int quantity) {
        this.title = title;
        this.printDate = printDate;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getPrintDate() {
        return printDate;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
