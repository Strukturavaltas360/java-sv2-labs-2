package introexceptioncause;

import java.util.Scanner;

public class TrackPoint {
    private double latitude;
    private double longitude;
    private int elevation;

    public TrackPoint(String coordinates) {
        Scanner scanner = new Scanner(coordinates);
        scanner.useDelimiter(";");
        latitude = Double.parseDouble(scanner.next());
        longitude = Double.parseDouble(scanner.next());
        elevation = scanner.nextInt();
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getElevation() {
        return elevation;
    }
}
