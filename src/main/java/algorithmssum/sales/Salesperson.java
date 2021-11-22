package algorithmssum.sales;

public class Salesperson {
    private String name;
    private double amount;

    public Salesperson(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
}
