package operators;

public class HeadingNorth {
    public static void main(String[] args) {
        int numberOfNewDirections = getNumberOfNewDirections();
        System.out.println(numberOfNewDirections);

        int newDirection = 0;
        for (int i = 1; i <= numberOfNewDirections; i++) {
            newDirection += 10 * i;
            System.out.println("Irány " + i + " irányváltás után: " + newDirection);
        }
    }

    static int getNumberOfNewDirections() {
        int headingChanges = 0;
        for (int newHeading = 0; newHeading < 360 ; ) {
            newHeading += 10 * ++headingChanges;
        }
        return headingChanges;
    }
}
