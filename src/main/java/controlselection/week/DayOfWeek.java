package controlselection.week;

public class DayOfWeek {
    String getDayDescription(String dayName) {
        String description = null;
        switch (dayName.toLowerCase()) {
            case "hétfő":
                description = "hét eleje";
                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                description = "hét közepe";
                break;
            case "péntek":
                description = "majdnem hétvége";
                break;
            case "szombat":
            case "vasárnap":
                description = "hét vége";
                break;
            default:
                description = "ismeretlen nap";
        }
        return description;
    }
}
