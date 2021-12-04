package interfacerules.bill;

public class BillItem {
    private String name;
    private int price;
    private int quantity;

    public BillItem(String line) {
        String[] parts = line.split(";");
        name = parts[0];
        price = Integer.parseInt(parts[1]);
        quantity = Integer.parseInt(parts[2]);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getValue() {
        return quantity * price;
    }
}
