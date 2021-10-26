package typeconversion;

public class Conversion {
    static double convertDoubleToDouble(double number) {
        return (double) ((int) number);
    }

    static byte[] convertIntArrayToByteArray(int[] integers) {
        byte[] bytes = new byte[integers.length];
        for (int i = 0; i < integers.length; i++) {
            bytes[i] = integers[i] > 127_000 || integers[i] < 0 ? -1 : (byte) integers[i];
        }
        return bytes;
    }

    static byte getFirstDecimal(double number) {
        double fraction = number - (double) ((int) number);
        return (byte) (fraction * 10);
    }
}
