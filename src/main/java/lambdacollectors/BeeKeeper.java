package lambdacollectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BeeKeeper {
    private List<Honey> items;

    public BeeKeeper(List<Honey> items) {
        if (items == null) {
            throw new IllegalArgumentException("Items must not be null!");
        }
        this.items = items;
    }

    public int getTotalValueOfGivenGlasses(GlassSize size) {
        return (int) items.stream()
                .filter(honey -> honey.getSize() == size)
                .mapToDouble(honey -> honey.getSize().getCapacity() * honey.getType().getPrice())
                .sum();
    }

    public Map<GlassSize, Long> getAmountsOfGivenType(HoneyType type) {
        return items.stream()
                .filter(honey -> honey.getType() == type)
                .collect(Collectors.groupingBy(Honey::getSize, Collectors.counting()));
    }

    public Map<Boolean, List<Honey>> getGroupsByGivenTypeAndSize(HoneyType type, GlassSize size) {
        return items.stream()
                .collect(Collectors.partitioningBy(honey -> honey.getType() == type && honey.getSize() == size));
    }
}
