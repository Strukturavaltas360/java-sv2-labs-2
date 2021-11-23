package defaultconstructor;

public class SimpleDate {
    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if (isCorrect(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Nem megfelelő dátum!");
        }
    }

    private boolean isCorrect(int year, int month, int day) {
        if (year < 1900) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > calculateMonthLength(year, month)) {
            return false;
        }
        return true;
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0;
    }

    private int calculateMonthLength(int year, int month) {
        int monthLength;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                monthLength = 31;
                break;
            case 2:
                monthLength = isLeapYear(year) ? 29 : 28;
                break;
            default:
                monthLength = 30;
        }
        return monthLength;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
