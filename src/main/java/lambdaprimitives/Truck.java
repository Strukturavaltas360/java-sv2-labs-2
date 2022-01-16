package lambdaprimitives;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Locale;

public class Truck {
    private List<Cargo> thingsToLoad;

    public Truck(List<Cargo> thingsToLoad) {
        if (thingsToLoad == null) {
            throw new IllegalArgumentException("List must not be zero!");
        }
        this.thingsToLoad = thingsToLoad;
    }

    public double getShortestLength() {
        return thingsToLoad.stream()
                .mapToDouble(cargo -> cargo.getLength())
                .min()
                .orElse(0);
    }

    public int getTotalWeight() {
        return thingsToLoad.stream()
                .mapToInt(cargo -> cargo.getWeight())
                .sum();
    }

    public double getAverageWeight() {
        return thingsToLoad.stream()
                .mapToInt(cargo -> cargo.getWeight())
                .average()
                .orElseThrow(() -> new IllegalArgumentException("No cargo."));
    }

    public int getMaxWeight() {
        return thingsToLoad.stream()
                .mapToInt(cargo -> cargo.getWeight())
                .max().orElse(0);
    }

    public String getWeightStatistics() {
        IntSummaryStatistics statistics = thingsToLoad.stream()
                .mapToInt(cargo -> cargo.getWeight())
                .summaryStatistics();
        if (statistics.getCount() == 0) {
            return "No cargo.";
        } else {
            return String.format(Locale.ROOT, "A rakományban található %d tétel, melyeknek összsúlya %d kg, " +
                    "közülük a legnehezebb %d kg, a legkönnyebb %d kg. A súlyuk átlagosan %.1f kg.",
                    statistics.getCount(), statistics.getSum(), statistics.getMax(), statistics.getMin(), statistics.getAverage());
        }
    }

    public List<Cargo> getThingsToLoad() {
        return thingsToLoad;
    }
}
