package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public TrackPoints(String fileName) {
        Path path = Paths.get(fileName);
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line: lines) {
                trackPoints.add(new TrackPoint(line));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

    public int getAltitudeDifferenceFromPrevious(int index) {
        return trackPoints.get(index).getElevation() - trackPoints.get(index - 1).getElevation();
    }

    public List<TrackPoint> getTrackCoordinates() {
        return trackPoints;
    }
}
