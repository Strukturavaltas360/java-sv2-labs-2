package typeconversion;

import java.util.Arrays;

public class ConversionMain {
    public static void main(String[] args) {
        Double number = 34.57;
        System.out.println("convertDoubleToDouble(" + number + "): " + Conversion.convertDoubleToDouble(number));
        int[] integers = {5, -14, 6, 2, 125, 354, 9738, 3};
        System.out.println("convertIntArrayToByteArray(" + Arrays.toString(integers) + "): " +
                Arrays.toString(Conversion.convertIntArrayToByteArray(integers)));
        System.out.println("getFirstDecimal(" + number + "): " + Conversion.getFirstDecimal(number));
    }
}
