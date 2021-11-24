package constructoroverloading.advertisement;

import java.util.List;

public class BikeAdvertisement {
    private String description;
    private double price;
    private List<String> extras;
    private String make;
    private String serialNumber;

    public BikeAdvertisement(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public BikeAdvertisement(String description, double price, String make) {
        this(description, price);
        this.make = make;
    }

    public BikeAdvertisement(String description, double price, List<String> extras, String make) {
        this(description, price, make);
        this.extras = extras;
    }

    public BikeAdvertisement(String description, double price, List<String> extras, String make, String serialNumber) {
        this(description, price, extras, make);
        this.serialNumber = serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getExtras() {
        return extras;
    }

    public String getMake() {
        return make;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
