package lambdaintermediate;

public class Coffee {
    public enum CoffeeType {
        ESPRESSO, MACCHIATO, RISTRETTO, MOCHA, LATTE, CAPPUCCINO, AMERICANO
    }
    private final CoffeeType type;
    private final int price;

    public Coffee(CoffeeType type, int price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }

    public CoffeeType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}
