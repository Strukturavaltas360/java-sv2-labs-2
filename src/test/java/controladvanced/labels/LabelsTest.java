package controladvanced.labels;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LabelsTest {

    @Test
    void getTableOfNumbers() {
        Labels labels = new Labels();
        int[][] result = labels.getTableOfNumbers(5);
        System.out.println(Arrays.toString(result[0]));
        System.out.println(Arrays.toString(result[1]));
        System.out.println(Arrays.toString(result[2]));
        System.out.println(Arrays.toString(result[3]));
        System.out.println(Arrays.toString(result[4]));
        assertEquals(6, result[3][1]);
    }
}