package lambdaoptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Costumer {
    private List<Costume> costumes = new ArrayList<>();

    public Costumer(List<Costume> costumes) {
        if (costumes == null) {
            throw new IllegalArgumentException("List must not be null!");
        }
        this.costumes = costumes;
    }

    public Optional<Costume> findFirstCostumeWithKeyWord(String keyWord) {
        return findFirst(costume -> costume.getName().contains(keyWord));
    }

    public Optional<Costume> findFirstCheaperCostume(int maxPrice) {
        return findFirst(costume -> costume.getPrice() < maxPrice);
    }

    public Optional<Costume> findFirstCostumeSameSize(Costume.Size size) {
        return findFirst(costume -> costume.getSize() == size);
    }

    private Optional<Costume> findFirst(Predicate<Costume> condition) {
        for (Costume costume: costumes) {
            if (condition.test(costume)) {
                return Optional.of(costume);
            }
        }
        return Optional.empty();
    }

    public List<Costume> getCostumes() {
        return costumes;
    }
}
