package lambdacollectors;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BeeKeeperTest {
    Honey h1 = new Honey(HoneyType.MULTIFLORAL, GlassSize.BIG);
    Honey h2 = new Honey(HoneyType.MULTIFLORAL, GlassSize.TASTER_SIZE);
    Honey h3 = new Honey(HoneyType.LINDEN, GlassSize.SMALL);
    Honey h4 = new Honey(HoneyType.ACACIA, GlassSize.BIG);
    Honey h5 = new Honey(HoneyType.MULTIFLORAL, GlassSize.BIG);
    Honey h6 = new Honey(HoneyType.MULTIFLORAL, GlassSize.BIG);

    BeeKeeper beeKeeper = new BeeKeeper(List.of(h1, h2, h3, h4, h5, h6));

    @Test
    void getTotalValueOfGivenGlasses() {
        assertEquals(5400, beeKeeper.getTotalValueOfGivenGlasses(GlassSize.BIG));
    }

    @Test
    void getAmountsOfGivenType() {
        assertEquals(1, beeKeeper.getAmountsOfGivenType(HoneyType.MULTIFLORAL).get(GlassSize.TASTER_SIZE));
        assertEquals(3, beeKeeper.getAmountsOfGivenType(HoneyType.MULTIFLORAL).get(GlassSize.BIG));
    }

    @Test
    void getGroupsByGivenTypeAndSize() {
        assertEquals(List.of(h1, h5, h6), beeKeeper.getGroupsByGivenTypeAndSize(HoneyType.MULTIFLORAL, GlassSize.BIG).get(true));
        assertEquals(List.of(h2, h3, h4), beeKeeper.getGroupsByGivenTypeAndSize(HoneyType.MULTIFLORAL, GlassSize.BIG).get(false));
    }
}