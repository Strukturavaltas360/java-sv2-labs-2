package exceptionresource.siblings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siblings {
    public List<String> getFullNames(String lastName, Path path) {
        List<String> result = new ArrayList<>();
        try (Scanner scanner = new Scanner(path)) {
            while(scanner.hasNext()) {
                result.add(String.format("%s %s", lastName, scanner.nextLine()));
            }
            return result;
        } catch (IOException e) {
            throw new IllegalStateException("Can not read names!", e);
        }
    }
}
