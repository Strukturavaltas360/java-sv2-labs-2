package exceptionclass.course;

public class SimpleTime {
    private int hour;
    private int minute;

    public SimpleTime(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException(InvalidTimeReason.INVALID_HOUR);
        }
        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException(InvalidTimeReason.INVALID_MINUTE);
        }
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String timeStr) {
        if (timeStr == null) {
            throw new InvalidTimeException(InvalidTimeReason.TIME_IS_NULL);
        }
        if (!timeStr.matches("[0-9][0-9]:[0-9][0-9]")) {
            throw new InvalidTimeException(InvalidTimeReason.INVALID_TIME_FORMAT);
        }
        String[] parts = timeStr.split(":");
        hour = Integer.parseInt(parts[0]);
        minute = Integer.parseInt(parts[1]);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
