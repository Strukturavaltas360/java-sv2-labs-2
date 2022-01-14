package sorting;

import java.util.*;

public class CarDealer {
    List<Car> cars;

    public CarDealer(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCarsByConstruction() {
        return getCarsByComparator(new CarConstructionComparator());
    }

    public List<Car> getCarsByPrice() {
        return getCarsByComparator(new CarPriceComparator());
    }

    private List<Car> getCarsByComparator(Comparator comparator) {
        List<Car> result = new ArrayList<>(cars);
        Collections.sort(result, comparator);
        return result;
    }

    public List<Car> getCars() {
        return cars;
    }
}
