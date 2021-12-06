package virtualmethod.vehicle;

public class Vehicle {
    static final public int PERSON_AVERAGE_WEIGHT = 75;
    private int vehicleWeight;

    public Vehicle(int vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleWeight=" + vehicleWeight +
                '}';
    }

    public int getGrossLoad() {
        return vehicleWeight + PERSON_AVERAGE_WEIGHT;
    }

    public int getVehicleWeight() {
        return vehicleWeight;
    }
}
