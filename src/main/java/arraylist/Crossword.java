package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ", "FELHŐ", "CIPŐ",
                "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA");
        List<String> selectedWords = new ArrayList<>();

        for (String elem: wordList)
            if (elem.length() == 6) selectedWords.add(elem);

        System.out.println(selectedWords.toString());
    }
}
