package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {
    private List<SimpleTime> timeTable;

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        timeTable = new ArrayList<>();
        for (int hour = firstHour; hour <= lastHour; hour++) {
            addTimes(hour, everyMinute);
        }
    }

    public SimpleTime getNextBus(SimpleTime actual) {
        SimpleTime nextTime = null;
        for (SimpleTime time: timeTable) {
            if (time.getDifference(actual) > 0) {
                if (nextTime == null || nextTime.getDifference(actual) > time.getDifference(actual)) {
                    nextTime = time;
                }
            }
        }
        if (nextTime != null) {
            return nextTime;
        } else {
            throw new IllegalStateException("Nincs következő járat!");
        }
    }

    private void addTimes(int hour, int everyMinute) {
        for (int minute = 0; minute < 60; minute += everyMinute) {
            timeTable.add(new SimpleTime(hour, minute));
        }
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }
}
