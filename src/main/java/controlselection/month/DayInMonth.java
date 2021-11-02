package controlselection.month;

public class DayInMonth {

    public int getDaysInMonth(int year, String monthName) {
        int daysInMonth = 0;
        switch(monthName.toLowerCase()) {
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                daysInMonth = 31;
                break;
            case "február":
                daysInMonth = isLeapYear(year) ? 29 : 28;
                break;
            case "április":
            case "június":
            case "szeptember":
            case "november":
                daysInMonth = 30;
                break;
        }
        return daysInMonth;
    }

    boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
