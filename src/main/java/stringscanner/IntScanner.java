package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntScanner {
    public static void main(String[] args) {
        String ints1 = "5;3;107;12;123;18;198";
        String ints2 = "123";
        String ints3 = "12;3;56;45";
        String ints4 = "";

        IntScanner intScanner = new IntScanner();
        System.out.println(intScanner.convertInts(ints1));
        System.out.println(intScanner.convertInts(ints2));
        System.out.println(intScanner.convertInts(ints3));
        System.out.println(intScanner.convertInts(ints4));
    }

    public String convertInts(String ints) {
        List<Integer> intList = parseInts(ints);
        return intListToString(intList);
    }

    List<Integer> parseInts(String ints) {
        List<Integer> intList = new ArrayList<>();

        if (ints != null & ints.length() >0) {
            Scanner scanner = new Scanner(ints);
            scanner.useDelimiter(";");
            for (; scanner.hasNext(); ) {
                intList.add(scanner.nextInt());
            }
        }

        return intList;
    }

    String intListToString(List<Integer> intList) {
        StringBuilder sb = new StringBuilder();

        int counter = 0;
        for (int value: intList) {
            if (value > 100) {
                if (counter > 0) {
                    sb.append(',');
                }
                counter++;
                sb.append(value);
            }
        }

        return sb.toString();
    }

}
