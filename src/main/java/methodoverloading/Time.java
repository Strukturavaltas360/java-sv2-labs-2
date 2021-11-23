package methodoverloading;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public boolean isEqual(Time time) {
        return time != null && isEqual(time.hours, time.minutes, time.seconds);
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        return this.hours == hours && this.minutes == minutes && this.seconds == seconds;
    }

    public boolean isEarlier(Time time) {
        return time != null && isEarlier(time.hours, time.minutes, time.seconds);
    }


    public boolean isEarlier(int hours, int minutes, int seconds) {
        return 3600 * this.hours + 60 * this.minutes + this.seconds < 3600 * hours + 60 * minutes + seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
