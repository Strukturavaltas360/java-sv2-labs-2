package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private int waitingPersons;
    private int waitingCargo;
    private List<Ship> ships = new ArrayList<>();

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public void loadShip(int passengers, int cargoWeight) {
        waitingPersons = passengers;
        waitingCargo = cargoWeight;
        for (Ship ship: ships) {
            if (ship instanceof  CanCarryPassengers) {
                waitingPersons = ((CanCarryPassengers) ship).loadPassenger(waitingPersons);
            }
            if (ship instanceof CanCarryGoods) {
                waitingCargo = ((CanCarryGoods) ship).loadCargo(waitingCargo);
            }
        }

    }

    public List<Ship> getShips() {
        return ships;
    }

    public int getWaitingPersons() {
        return waitingPersons;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
