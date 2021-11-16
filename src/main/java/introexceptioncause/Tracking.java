package introexceptioncause;

public class Tracking {
    public static void main(String[] args) {
        try {
            TrackPoints trackPoints = new TrackPoints("src/main/java/introexceptioncause/tracking.csv");
            int trackPointsCount = trackPoints.getTrackCoordinates().size();
            for (int i = 1; i < trackPointsCount; i++) {
                System.out.println(trackPoints.getAltitudeDifferenceFromPrevious(i));
            }
        }
        catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
            ise.getCause().printStackTrace();
        }
    }
}
