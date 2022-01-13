package nestedclasses.thermo;

import java.util.ArrayList;
import java.util.List;

public class Thermostat {
    private List<Thermometer> thermometers = new ArrayList<>();
    private List<String> roomsToHeat = new ArrayList<>();
    private int temperatureLimit = 23;

    public void addThermometer(Thermometer thermometer) {
        thermometers.add(thermometer);
        thermometer.setThermometerObserver(new ThermometerObserver() {
            @Override
            public void handleTemperatureChange(int temp, String room) {
                if (temp < temperatureLimit && !roomsToHeat.contains(room)) {
                        roomsToHeat.add(room);
                }
                if (temp >= temperatureLimit && roomsToHeat.contains(room)) {
                    roomsToHeat.remove(room);
                }
            }
        });
    }

    public List<String> getRoomsToHeat() {
        return roomsToHeat;
    }

    public int getTemperatureLimit() {
        return temperatureLimit;
    }

    public void setTemperatureLimit(int temperatureLimit) {
        this.temperatureLimit = temperatureLimit;
        for (Thermometer thermometer: thermometers) {
            thermometer.setTemperature(thermometer.getTemp());
        }
    }
}
