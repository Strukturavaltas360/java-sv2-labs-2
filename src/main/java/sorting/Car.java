package sorting;

public class Car {
    private String name;
    private int yearOfProduction;
    private int price;

    public Car(String name, int yearOfProduction, int price) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getPrice() {
        return price;
    }
}
