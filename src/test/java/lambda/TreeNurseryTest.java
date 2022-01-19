package lambda;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeNurseryTest {
    Sapling s1 = new Sapling("sp1", 180);
    Sapling s2 = new Sapling("sp2", 200);
    Sapling s3 = new Sapling("sp2", 280);
    Sapling s4 = new Sapling("sp1", 170);
    TreeNursery treeNursery = new TreeNursery(List.of(s1, s2, s3, s4));

    @Test
    void prune() {
        treeNursery.prune(120);
        assertEquals(4, treeNursery.getSaplings().size());
        IntSummaryStatistics statistics = treeNursery.getSaplings().stream()
                .mapToInt(Sapling::getHeight)
                .summaryStatistics();
        assertEquals(120, statistics.getMin());
        assertEquals(120, statistics.getMax());
    }

    @Test
    void sell() {
        treeNursery.sell("sp1", 170);
        assertEquals(3, treeNursery.getSaplings().size());
        assertFalse(treeNursery.getSaplings().contains(s1));
        assertTrue(treeNursery.getSaplings().contains(s4));
    }
}