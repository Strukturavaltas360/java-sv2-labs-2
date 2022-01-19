package lambda;

import java.util.ArrayList;
import java.util.List;

public class TreeNursery {
    private List<Sapling> saplings;

    public TreeNursery(List<Sapling> saplings) {
        if (saplings == null || saplings.isEmpty()) {
            throw new IllegalArgumentException("Invalid list");
        }
        this.saplings = new ArrayList<>(saplings);
    }

    void prune(int maxHeight) {
        saplings.forEach(sapling -> sapling.cut(maxHeight));
    }

    void sell(String species, int minHeight) {
        saplings.removeIf(sapling -> sapling.getSpecies() == species && sapling.getHeight() > minHeight);
    }

    public List<Sapling> getSaplings() {
        return saplings;
    }
}
