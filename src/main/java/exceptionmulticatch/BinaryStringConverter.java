package exceptionmulticatch;

public class BinaryStringConverter {
    public boolean[] binaryStringToBooleanArray(String data) {
        if (data == null) {
            throw new NullPointerException("The string must not be null!");
        }
        boolean[] result = new boolean[data.length()];
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            switch(ch) {
                case '0':
                case '1':
                    result[i] = ch == '1';
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Only 0 and 1 are allowed (%c)!", ch));
            }
        }
        return result;
    }

    public String booleanArrayToBinaryString(boolean[] array) {
        if (array == null) {
            throw new NullPointerException("The array must not be null!");
        }
        StringBuilder sb = new StringBuilder();
        for (boolean b: array) {
            sb.append(b ? '1' : '0');
        }
        return sb.toString();
    }
}
