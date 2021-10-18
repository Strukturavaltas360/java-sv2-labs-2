package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(4.75, true);
        System.out.println("km: " + distance.getDistanceInKm() +
                ", exact: " + distance.isExact());
        int distanceInt = (int) distance.getDistanceInKm();
        System.out.println("distanceInt: " + distanceInt);
    }
}
