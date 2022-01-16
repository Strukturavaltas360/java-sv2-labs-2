package lambdacollectors.christmastree;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChristmasTreeFair {
    private List<ChristmasTree> trees;

    public ChristmasTreeFair(List<ChristmasTree> trees) {
        if (trees == null) {
            throw new IllegalArgumentException("Trees must not be null!");
        }
        this.trees = trees;
    }

    public Map<PineTreeType, Long> getCountByType() {
        return trees.stream()
                .collect(Collectors.groupingBy(ChristmasTree::getType, Collectors.counting()));
    }

    public double getMaxHeightByType(PineTreeType type) {
        return trees.stream()
                .filter(tree -> tree.getType().equals(type))
                .mapToDouble(ChristmasTree::getHeight)
                .max()
                .orElse(0.0);
    }

    public double getAveragePrice() {
        return trees.stream()
                .mapToDouble(tree -> tree.getHeight() * tree.getType().getPricePerMeter())
                .average()
                .orElse(0.0);
    }
}
