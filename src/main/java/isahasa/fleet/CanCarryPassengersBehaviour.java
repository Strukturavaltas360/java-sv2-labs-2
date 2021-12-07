package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers {
    private int passengers;
    private final int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        if (passengers <= maxPassengers) {
            this.passengers = passengers;
            return 0;
        }
        this.passengers = maxPassengers;
        return passengers - this.passengers;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}
