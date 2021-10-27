package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Írjon be egy mondatot, mely több tagmondatból áll: ");
        String sentence1 = scanner1.nextLine();

        Scanner wordScanner = new Scanner(sentence1);
        for (;wordScanner.hasNext();) {
            String word = wordScanner.next();
            System.out.println(word);
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Írjon be egy másik mondatot, mely több tagmondatból áll: ");
        String sentence2 = scanner2.nextLine();

        Scanner subSentenceScanner = new Scanner(sentence2);
        subSentenceScanner.useDelimiter(", ");
        for (; subSentenceScanner.hasNext();) {
            String subSentence = subSentenceScanner.next();
            System.out.println(subSentence);
        }
    }
}
