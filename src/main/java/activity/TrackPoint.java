package activity;

import java.util.Objects;

public class TrackPoint {
    private final Coordinate coordinate;
    private final double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public double getDistanceFrom(TrackPoint point) {
        final int R = 6371; // Radius of the earth
        double latDistance = Math.toRadians(point.getCoordinate().getLatitude() - coordinate.getLatitude());
        double lonDistance = Math.toRadians(point.getCoordinate().getLongitude() - coordinate.getLongitude());
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(point.getCoordinate().getLatitude())) * Math.cos(Math.toRadians(coordinate.getLatitude()))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters
        double height = point.getElevation() - elevation;
        distance = Math.pow(distance, 2) + Math.pow(height, 2);
        return Math.sqrt(distance);
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackPoint that = (TrackPoint) o;
        return Double.compare(that.elevation, elevation) == 0 && Objects.equals(coordinate, that.coordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate, elevation);
    }
}
