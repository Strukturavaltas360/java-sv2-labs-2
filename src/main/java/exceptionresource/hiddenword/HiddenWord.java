package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {
    public String getHiddenWord(Path path) {
        StringBuilder sb = new StringBuilder();
        try (Scanner scanner = new Scanner(path)) {
            while(scanner.hasNext()) {
                sb.append(findChar(scanner.nextLine()));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file!", e);
        }
        return sb.toString();
    }

    private char findChar(String line) {
        Character result = null;
        for(char ch: line.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                if (result != null) {
                    throw new IllegalArgumentException("More than one letter found!");
                }
                result = ch;
            }
        }
        return result == null ? ' ' : result;
    }
}
