package collectionsiterator;

public class ChristmasPresent {
    private String description;
    private String person;
    private int price;

    public ChristmasPresent(String description, String person, int price) {
        this.description = description;
        this.person = person;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getPerson() {
        return person;
    }

    public int getPrice() {
        return price;
    }
}
