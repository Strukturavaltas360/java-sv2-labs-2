package lambdacomparator.cloud;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloudStorageTest {
    CloudStorage free = new CloudStorage("provider", 500);
    CloudStorage monthly = new CloudStorage("provider", 500, 30, PayPeriod.MONTHLY);
    CloudStorage annual = new CloudStorage("provider", 500, 360, PayPeriod.ANNUAL);

    @Test
    void getAnnualFeePerTb() {
        assertEquals(0, free.getAnnualFeePerTb());
        assertEquals(720, monthly.getAnnualFeePerTb());
        assertEquals(720, annual.getAnnualFeePerTb());
    }
}