package array;

public class ArrayHandler {
    public static void main(String[] args) {
        int[] intArray = {5, 4, 3, 2, 1};
        String[] stringArray = {"első", "második", "harmadik", "negyedik"};

        System.out.println("intArray[]: ");
        for (int elem: intArray) System.out.println(elem);

        addIndexToNumber(intArray);
        System.out.print("intArray[]: ");
        for (int i = 0; i < intArray.length; i++)
            System.out.print((i > 0 ? ", " : "") + intArray[i]);
        System.out.println();

        System.out.println("stringArray[]: ");
        for (String elem: stringArray) System.out.println(elem);

        concatenateIndexToWord(stringArray);
        System.out.print("stringArray[]: ");
        for (int i = 0; i < stringArray.length; i++)
            System.out.print((i > 0 ? ", " : "") + stringArray[i]);
        System.out.println();
    }

    static void addIndexToNumber(int[] source) {
        for (int i = 0; i < source.length; i++) source[i] += i;
    }

    static void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) source[i] = i + source[i];
    }
}
