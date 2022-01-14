package lambdaintro;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class UsedCars {
    private List<Car> cars;

    public UsedCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> listCarsByPrice() {
        return sortCars(cars, (car1, car2) -> car1.getPrice() - car2.getPrice());
    }

    public List<Car> listCarsByLengthDesc() {
        return sortCars(cars, (car1, car2) -> -Double.compare(car1.getLength(), car2.getLength()));
    }

    public List<Car> listCarsOneBrandByType(String brand) {
        Collator collator = Collator.getInstance();
        return sortCars(
                filterCars(cars, (car) -> car.getBrand().equals(brand)),
                (car1, car2) -> collator.compare(car1.getType(), car2.getType()));
    }

    private List<Car> sortCars(List<Car> carsToFilter, Comparator<Car> comparator) {
        List<Car> result = new ArrayList<>(carsToFilter);
        result.sort(comparator);
        return result;
    }

    private List<Car> filterCars(List<Car> carsToFilter, Predicate<Car> filter) {
        List<Car> result = new ArrayList<>();
        for (Car car: carsToFilter) {
            if (filter.test(car)) {
                result.add(car);
            }
        }
        return result;
    }
}
