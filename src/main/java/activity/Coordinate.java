package activity;

import java.util.Objects;

public class Coordinate {
    private final double latitude;
    private final double longitude;

    public Coordinate(double latitude, double longitude) {
        validateValue(latitude, 90.0);
        validateValue(longitude, 180.0);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private void validateValue(double value, double maxAbsOfValue) {
        if (Math.abs(value) > maxAbsOfValue) {
            throw new IllegalArgumentException(String.format("Value (%.3f) is out of range (-%2$.3f - +%2$.3f)!", value, maxAbsOfValue));
        }
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return Double.compare(that.latitude, latitude) == 0 && Double.compare(that.longitude, longitude) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude);
    }
}
