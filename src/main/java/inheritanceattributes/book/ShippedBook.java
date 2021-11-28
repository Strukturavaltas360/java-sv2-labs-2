package inheritanceattributes.book;

public class ShippedBook extends Book {
    private int shippingCost;

    public ShippedBook(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingCost = shippingCost;
    }

    public int order(int pieces) {
        return shippingCost + super.purchase(pieces);
    }

    @Override
    public String toString() {
        return String.format("%s: %d Ft, postaköltség: %d Ft", getTitle(), purchase(1), shippingCost);
    }
}
