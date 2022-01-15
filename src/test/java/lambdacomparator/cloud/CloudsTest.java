package lambdacomparator.cloud;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CloudsTest {
    CloudStorage free = new CloudStorage("FREE", 500);
    CloudStorage monthly1 = new CloudStorage("mprovider", 500, 32, PayPeriod.MONTHLY);
    CloudStorage monthly2 = new CloudStorage("mprovider", 1500, 50, PayPeriod.MONTHLY);
    CloudStorage annual1 = new CloudStorage("aprovider", 500, 360, PayPeriod.ANNUAL);
    CloudStorage annual2 = new CloudStorage("aprovider", 1000, 400, PayPeriod.ANNUAL);
    Clouds clouds = new Clouds(List.of(monthly1, free, annual1, annual2, monthly2));

    @Test
    void alphabeticallyFirst() {
        assertEquals("aprovider", clouds.alphabeticallyFirst().getProvider());
    }

    @Test
    void bestPriceForShortestPeriod() {
        assertEquals(free, clouds.bestPriceForShortestPeriod());
    }

    @Test
    void worstOffers() {
        assertEquals(List.of(monthly1, annual1, annual2), clouds.worstOffers());
    }
}