package algorithmsmax;

public class Plane {
    public int getLongestOcean(String map) {
        int longestOcean = 0;
        int actualOcean = 0;
        for (int i = 0; i < map.length(); i++) {
            char actualChar = map.charAt(i);
            if (actualChar == '0') {
                actualOcean++;
            } else {
                if (actualOcean > longestOcean) {
                    longestOcean = actualOcean;
                }
                actualOcean = 0;
            }
        }
        return longestOcean;
    }
}
