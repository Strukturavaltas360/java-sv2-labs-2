package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public boolean isCheaperThan(Pendrive other) {
        return price < other.price;
    }

    public int comparePricePerCapacity(Pendrive other) {
        int ppc = (int) (((double) price) / capacity);
        int ppcOther = (int) ((double) (other.price) / other.capacity);
        if (ppc > ppcOther) {
            return 1;
        }
        if (ppc < ppcOther) {
            return -1;
        }
        return 0;
    }

    public void risePrice(int percent) {
        price += price * percent / 100;
    }

    @Override
    public String toString() {
        return String.format("name: %s, capacity: %d, price: %d", name, capacity, price);
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }
}
