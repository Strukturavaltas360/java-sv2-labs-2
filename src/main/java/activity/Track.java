package activity;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.ToDoubleFunction;

public class Track {
    private static final String EMPTY_TRACK = "Track is empty!";
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void loadFromGpx(InputStream is) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            Coordinate coordinate = null;
            while (null != (line = br.readLine())) {
                if (line.trim().startsWith("<trkpt")) {
                    coordinate = parseCoordinate(line);
                } else if (line.trim().startsWith("<ele") && coordinate != null) {
                    addTrackPoint(new TrackPoint(coordinate, parseElevation(line)));
                } else {
                    coordinate = null;
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file!", e);
        }
    }

    private double parseElevation(String line) {
        return Double.parseDouble(line
                .replace("<ele>", "")
                .replace("</ele>", "")
                .trim());
    }

    private Coordinate parseCoordinate(String line) {
        //<trkpt lat="47.2181020" lon="18.5411940">
        String processed = line
                .replace("<trkpt", "")
                .replace(">", "")
                .replace("lat=", "")
                .replace("lon=", "")
                .replace("\"", "")
                .trim();
        String[] parts = processed.split(" ");
        return new Coordinate(Double.parseDouble(parts[0]), Double.parseDouble(parts[1]));
    }

    public Coordinate findMaximumCoordinate() {
        double maxLatitude = findMax(value -> value.getCoordinate().getLatitude());
        double maxLongitude = findMax(value -> value.getCoordinate().getLongitude());
        return new Coordinate(maxLatitude, maxLongitude);
    }

    public Coordinate findMinimumCoordinate() {
        double minLatitude = findMin(value -> value.getCoordinate().getLatitude());
        double minLongitude = findMin(value -> value.getCoordinate().getLongitude());
        return new Coordinate(minLatitude, minLongitude);
    }

    public double getDistance() {
        return getDifferencies((actual, last) -> actual.getDistanceFrom(last)).stream()
                .mapToDouble(d -> d)
                .sum();
    }

    public double getFullDecrease() {
        return getDifferencies((actual, last) -> last.getElevation() - actual.getElevation()).stream()
                .mapToDouble(d -> d)
                .filter(d -> d > 0)
                .sum();
    }

    public double getFullElevation() {
        return getDifferencies((actual, last) -> actual.getElevation() - last.getElevation()).stream()
                .mapToDouble(d -> d)
                .filter(d -> d > 0)
                .sum();
    }

    public double getRectangleArea() {
        double maxLatitude = findMax(value -> value.getCoordinate().getLatitude());
        double minLatitude = findMin(value -> value.getCoordinate().getLatitude());
        double maxLongitude = findMax(value -> value.getCoordinate().getLongitude());
        double minLongitude = findMin(value -> value.getCoordinate().getLongitude());
        double a = maxLatitude - minLatitude;
        double b = maxLongitude - minLongitude;
        return a * b;
    }

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    private List<Double> getDifferencies(BiFunction<TrackPoint, TrackPoint, Double> differencCalculator) {
        List<Double> result = new ArrayList<>();
        TrackPoint lastTrackPoint = null;
        for (TrackPoint actual : trackPoints) {
            if (lastTrackPoint != null) {
                result.add(differencCalculator.apply(actual, lastTrackPoint));
            }
            lastTrackPoint = actual;
        }
        return result;
    }

    private double findMax(ToDoubleFunction<TrackPoint> toDoubleFunction) {
        return trackPoints.stream()
                .mapToDouble(toDoubleFunction)
                .max()
                .orElseThrow(() -> new IllegalArgumentException(EMPTY_TRACK));
    }

    private double findMin(ToDoubleFunction<TrackPoint> toDoubleFunction) {
        return trackPoints.stream()
                .mapToDouble(toDoubleFunction)
                .min()
                .orElseThrow(() -> new IllegalArgumentException(EMPTY_TRACK));
    }
}
