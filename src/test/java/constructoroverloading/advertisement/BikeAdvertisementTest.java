package constructoroverloading.advertisement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BikeAdvertisementTest {

    @Test
    void constructorTest2Params() {
        BikeAdvertisement bikeAdvertisement = new BikeAdvertisement("testbike", 30);
        assertEquals("testbike", bikeAdvertisement.getDescription());
        assertEquals(30, bikeAdvertisement.getPrice());
        assertEquals(null, bikeAdvertisement.getMake());
        assertEquals(null, bikeAdvertisement.getExtras());
        assertEquals(null, bikeAdvertisement.getSerialNumber());
    }

    @Test
    void constructorTest3Params() {
        BikeAdvertisement bikeAdvertisement = new BikeAdvertisement("testbike", 30, "Csepel");
        assertEquals("testbike", bikeAdvertisement.getDescription());
        assertEquals(30, bikeAdvertisement.getPrice());
        assertEquals("Csepel", bikeAdvertisement.getMake());
        assertEquals(null, bikeAdvertisement.getExtras());
        assertEquals(null, bikeAdvertisement.getSerialNumber());
    }

    @Test
    void constructorTest4Params() {
        List<String> extras = Arrays.asList("csengő", "pumpa");
        BikeAdvertisement bikeAdvertisement = new BikeAdvertisement("testbike", 30, extras, "Csepel");
        assertEquals("testbike", bikeAdvertisement.getDescription());
        assertEquals(30, bikeAdvertisement.getPrice());
        assertEquals("Csepel", bikeAdvertisement.getMake());
        assertEquals(extras, bikeAdvertisement.getExtras());
        assertEquals(null, bikeAdvertisement.getSerialNumber());
    }

    @Test
    void constructorTest5Params() {
        List<String> extras = Arrays.asList("csengő", "pumpa");
        BikeAdvertisement bikeAdvertisement = new BikeAdvertisement("testbike", 30, extras, "Csepel", "SN1");
        assertEquals("testbike", bikeAdvertisement.getDescription());
        assertEquals(30, bikeAdvertisement.getPrice());
        assertEquals("Csepel", bikeAdvertisement.getMake());
        assertEquals(extras, bikeAdvertisement.getExtras());
        assertEquals("SN1", bikeAdvertisement.getSerialNumber());
    }
}