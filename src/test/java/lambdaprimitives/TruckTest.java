package lambdaprimitives;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {
    Cargo cargo1 = new Cargo("cargo1", 200, 1.5);
    Cargo cargo2 = new Cargo("cargo2", 10, 0.3);
    Cargo cargo3 = new Cargo("cargo3", 100, 1.2);
    Cargo cargo4 = new Cargo("cargo4", 50, 0.6);

    Truck truck = new Truck(List.of(cargo1, cargo2, cargo3, cargo4));

    @Test
    void getShortestLength() {
        assertEquals(0.3, truck.getShortestLength());
    }

    @Test
    void getShortestLengthEmptyTest() {
        assertEquals(0, new Truck(List.of()).getShortestLength());
    }

    @Test
    void getTotalWeight() {
        assertEquals(360, truck.getTotalWeight());
    }

    @Test
    void getAverageWeight() {
        assertEquals(90, truck.getAverageWeight());
    }

    @Test
    void getAverageWeightEmptyTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Truck(List.of()).getAverageWeight());
        assertEquals("No cargo.", iae.getMessage());
    }

    @Test
    void getMaxWeight() {
        assertEquals(200, truck.getMaxWeight());
    }

    @Test
    void getMaxWeightEmptyTest() {
        assertEquals(0, new Truck(List.of()).getMaxWeight());
    }

    @Test
    void getWeightStatistics() {
        assertEquals("A rakományban található 4 tétel, melyeknek összsúlya 360 kg, " +
                "közülük a legnehezebb 200 kg, a legkönnyebb 10 kg. A súlyuk átlagosan 90.0 kg.",
                truck.getWeightStatistics());
    }

    @Test
    void getWeightStatisticsEmptyTest() {
        assertEquals("No cargo.", new Truck(List.of()).getWeightStatistics());
    }

}