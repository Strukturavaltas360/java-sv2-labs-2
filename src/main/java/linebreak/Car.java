package linebreak;

public class Car {
    public static void main(String[] args) {
        System.out.println(new Car().getBrandAndTypeInSeparateLines("Renault", "Zoe"));
    }

    public String getBrandAndTypeInSeparateLines(String brand, String type) {
        return brand + System.lineSeparator() + type;
    }
}
