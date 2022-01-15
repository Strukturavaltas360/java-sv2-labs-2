package lambdaoptional;

public class Costume {
    public enum Size {
        S, M, L, XL
    }
    private String name;
    private Size size;
    private int price;

    public Costume(String name, Size size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Costume{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }
}
