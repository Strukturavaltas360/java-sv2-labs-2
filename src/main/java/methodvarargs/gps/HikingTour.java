package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {
    private List<FieldPoint> fieldPoints = new ArrayList<>();

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) {
        if (timeOfLogging == null) {
            throw new IllegalArgumentException("A timeOfLogging null!");
        }
        for (FieldPoint fp: fieldPointsToLog) {
            fp.setTimeOfLogging(timeOfLogging);
            fieldPoints.add(fp);
        }
    }

    public List<FieldPoint> getFieldPoints() {
        return fieldPoints;
    }
}
