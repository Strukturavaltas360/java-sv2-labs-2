package constructoroverloading.bus;

public class SimpleTime {
    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes) {
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Hibás óra vagy perc érték!");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this(hours, 0);
    }

    public SimpleTime(SimpleTime time) {
        this(time.hours, time.minutes);
    }

    public int getDifference(SimpleTime time) {
        return 60 * hours + minutes - (60 * time.hours + time.minutes);
    }

    @Override
    public String toString() {
        return String.format("%d:%02d", hours, minutes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleTime that = (SimpleTime) o;
        return hours == that.hours && minutes == that.minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
