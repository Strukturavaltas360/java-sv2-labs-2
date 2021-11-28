package inheritancemethods;

public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        if (fuel >= 0 && fuel <= tankCapacity) {
            this.fuel = fuel;
        } else {
            throw new IllegalArgumentException("Too much fuel!");
        }
    }

    public void drive(int km) {
        if (calcFuelConsumption(km) <= fuel) {
            fuel -= calcFuelConsumption(km);
        } else {
            throw new IllegalArgumentException("Fuel is not enough for this distance!");
        }
    }

    protected double calcFuelConsumption(int km) {
        return fuelRate * km / 100;
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
}
