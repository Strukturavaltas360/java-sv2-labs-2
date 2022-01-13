package nestedclasses.thermo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThermostatTest {
    Thermostat thermostat = new Thermostat();
    Thermometer thermometer1 = new Thermometer("room1", 23);
    Thermometer thermometer2 = new Thermometer("room2", 24);
    Thermometer thermometer3 = new Thermometer("room3", 25);

    @BeforeEach
    void init() {
        thermostat.addThermometer(thermometer1);
        thermostat.addThermometer(thermometer2);
        thermostat.addThermometer(thermometer3);
    }

    @Test
    void createTest() {
        assertTrue(thermostat.getRoomsToHeat().isEmpty());
        thermostat.addThermometer(new Thermometer("room4", 20));
        assertEquals("room4", thermostat.getRoomsToHeat().get(0));
    }

    @Test
    void testThermometerChange() {
        assertTrue(thermostat.getRoomsToHeat().isEmpty());
        thermometer1.setTemperature(15);
        assertEquals(1, thermostat.getRoomsToHeat().size());
        assertEquals("room1", thermostat.getRoomsToHeat().get(0));
        thermometer1.setTemperature(25);
        assertTrue(thermostat.getRoomsToHeat().isEmpty());
    }

    @Test
    void testTermostatChange() {
        assertTrue(thermostat.getRoomsToHeat().isEmpty());
        thermostat.setTemperatureLimit(24);
        assertEquals(List.of("room1"), thermostat.getRoomsToHeat());
        thermostat.setTemperatureLimit(25);
        assertEquals(List.of("room1", "room2"), thermostat.getRoomsToHeat());
        thermostat.setTemperatureLimit(23);
        assertTrue(thermostat.getRoomsToHeat().isEmpty());
    }
}