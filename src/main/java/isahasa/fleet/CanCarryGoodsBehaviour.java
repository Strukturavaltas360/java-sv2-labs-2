package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods {
    private int cargoWeight;
    private final int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        if (cargoWeight <= maxCargoWeight) {
            this.cargoWeight = cargoWeight;
            return 0;
        }
        this.cargoWeight = maxCargoWeight;
        return cargoWeight - this.cargoWeight;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }
}
