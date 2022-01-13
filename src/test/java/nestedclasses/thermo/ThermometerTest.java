package nestedclasses.thermo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThermometerTest {
    Thermometer thermometerWithObserver = new Thermometer("with", 20);
    Thermometer thermometerWithoutObserver = new Thermometer("without", 20);

    int countObserverCalls;
    int observedTemp;
    String observedRoom;

    @BeforeEach
    void init() {
        thermometerWithObserver.setThermometerObserver(new ThermometerObserver() {
            @Override
            public void handleTemperatureChange(int temp, String room) {
                countObserverCalls++;
                observedTemp = temp;
                observedRoom = room;
            }
        });
    }

    @Test
    void setTemperatureWithObserverTest() {
        countObserverCalls = 0;
        observedTemp = 0;
        observedRoom = null;
        thermometerWithObserver.setTemperature(25);
        assertEquals(1, countObserverCalls);
        assertEquals(thermometerWithObserver.getTemp(), observedTemp);
        assertEquals(thermometerWithObserver.getRoom(), observedRoom);
    }

    @Test
    void setTemperatureWithoutObserverTest() {
        countObserverCalls = 0;
        observedTemp = 0;
        observedRoom = null;
        thermometerWithoutObserver.setTemperature(25);
        assertEquals(0, countObserverCalls);
        assertEquals(0, observedTemp);
        assertEquals(null, observedRoom);
    }

    @Test
    void setThermometerObserver() {
        countObserverCalls = 0;
        observedTemp = 0;
        observedRoom = null;
        thermometerWithObserver.setThermometerObserver(new ThermometerObserver() {
            @Override
            public void handleTemperatureChange(int temp, String room) {
                countObserverCalls++;
                observedTemp = temp;
                observedRoom = room;
            }
        });
        assertEquals(1, countObserverCalls);
        assertEquals(thermometerWithObserver.getTemp(), observedTemp);
        assertEquals(thermometerWithObserver.getRoom(), observedRoom);
    }

    @Test
    void getRoom() {
        assertEquals("with", thermometerWithObserver.getRoom());
    }

    @Test
    void getTemp() {
        assertEquals(20, thermometerWithObserver.getTemp());
    }

    @Test
    void getObserver() {
        assertNull(thermometerWithoutObserver.getObserver());
        assertNotNull(thermometerWithObserver.getObserver());
    }
}