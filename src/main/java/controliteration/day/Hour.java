package controliteration.day;

import java.util.Objects;

public class Hour {
    private int hourNumber;
    private DayPeriod period;

    public Hour(int hourNumber) {
        this.hourNumber = hourNumber;
    }

    public int getHourNumber() {
        return hourNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hour hour = (Hour) o;
        return hourNumber == hour.hourNumber && period == hour.period;
    }

    public void setHourNumber(int hourNumber) {
        this.hourNumber = hourNumber;
    }

    public DayPeriod getPeriod() {
        return period;
    }

    public void setPeriod(DayPeriod period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return hourNumber + "/" + period;
    }
}
