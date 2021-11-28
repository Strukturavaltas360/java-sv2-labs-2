package inheritancemethods;

public class Jeep extends Car {
    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        double tankFuel = fuel < getTankCapacity() ? fuel : getTankCapacity();
        double extraFuel = fuel - tankFuel;
        if (extraFuel <= extraCapacity) {
            super.modifyFuelAmount(tankFuel);
            this.extraFuel = extraFuel;
        } else {
            throw new IllegalArgumentException("Too much fuel!");
        }
    }

    @Override
    public void drive(int km) {
        if (calcFuelConsumption(km) <= getFuel() + extraFuel) {
            double restFuel = getFuel() + extraFuel - calcFuelConsumption(km);
            modifyFuelAmount(restFuel);
        } else {
            throw new IllegalArgumentException("Fuel is not enough for this distance!");
        }

    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount() + extraCapacity - extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}
