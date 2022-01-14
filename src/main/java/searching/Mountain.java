package searching;

import java.util.Arrays;

public class Mountain {
    int[] heights;

    public Mountain(int[] heights) {
        this.heights = heights;
    }

    boolean searchPike(Pike pike) {
        return Arrays.binarySearch(heights, pike.getHeight()) >= 0;
    }
}
