package virtualmethod.vehicle;

public class FerryBoat extends Vehicle {
    public static final int MAX_CARRY_WEIGHT = 1500;
    private Car car;

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + (car != null ? car.getGrossLoad() : 0);
    }

    public boolean canCarry(Car car) {
        return car.getGrossLoad() <= MAX_CARRY_WEIGHT;
    }

    public boolean load(Car car) {
        if (canCarry(car)) {
            this.car = car;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FerryBoat{" +
                "car=" + (car != null ? car.toString() : "null") +
                '}';
    }

    public Car getCar() {
        return car;
    }
}
