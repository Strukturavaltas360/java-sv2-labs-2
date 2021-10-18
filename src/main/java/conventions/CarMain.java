package conventions;

public class CarMain {
    public static void main(String[] args) {
        Car skoda = new Car("Skoda", "1.0 TSI", 5, 5);

        System.out.println("carType: " + skoda.getCarType() +
                ", engineType: " + skoda.getEngineType() +
                ", doors: " + skoda.getDoors() +
                ", persons: " + skoda.getPersons());

        skoda.addModelName("Fabia");

        System.out.println("carType: " + skoda.getCarType() +
                ", engineType: " + skoda.getEngineType() +
                ", doors: " + skoda.getDoors() +
                ", persons: " + skoda.getPersons());

        skoda.setCarType("Renault");
        skoda.setEngineType("1.5 DCI");
        skoda.setDoors(3);
        skoda.setPersons(2);

        System.out.println("carType: " + skoda.getCarType() +
                ", engineType: " + skoda.getEngineType() +
                ", doors: " + skoda.getDoors() +
                ", persons: " + skoda.getPersons());

    }
}
