package formatlocaleprintf;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Run {
    private List<Double> distances;
    private String name;

    public static void main(String[] args) {
        Run run = new Run("Kiss Béla");
        run.addRun(11.35);
        run.addRun(12);
        run.addRun(14.64);
        System.out.println(run.printFormattedRunText());
    }

    public Run(String name) {
        this.name = name;
        distances = new ArrayList<>();
    }

    public void addRun(double km) {
        distances.add(km);
    }

    public String printFormattedRunText() {
        int runCount = distances.size();
        double lastRun = runCount > 0 ? distances.get(runCount - 1) : 0;
        LocalDate today = LocalDate.now();
        return String.format("Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %.1f km-t futottál. Csak így tovább!",
                name, today.toString(), runCount, lastRun);
    }
}
