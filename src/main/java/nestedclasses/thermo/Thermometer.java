package nestedclasses.thermo;

public class Thermometer {
    private String room;
    private int temp;
    private ThermometerObserver observer;

    public Thermometer(String room, int temp) {
        this.room = room;
        this.temp = temp;
    }

    private void onTemperatureChanged() {
        if (observer != null) {
            observer.handleTemperatureChange(temp, room);
        }
    }

    public void setTemperature(int temp) {
        this.temp = temp;
        onTemperatureChanged();
    }

    public void setThermometerObserver(ThermometerObserver observer) {
        this.observer = observer;
        onTemperatureChanged();
    }

    public String getRoom() {
        return room;
    }

    public int getTemp() {
        return temp;
    }

    public ThermometerObserver getObserver() {
        return observer;
    }
}
