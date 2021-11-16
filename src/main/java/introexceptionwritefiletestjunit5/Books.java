package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
    public void transform(Path from, Path to) {
        try {
            Files.write(to, readFromCatalog(from));
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file!", e);
        }
    }

    private List<String> readFromCatalog(Path path) {
        List<String> books = new ArrayList<>();
        try {
            for (String line: Files.readAllLines(path)) {
                Scanner scanner = new Scanner(line);
                scanner.useDelimiter(";");
                String id = scanner.hasNext() ? scanner.next() : null;
                String title = scanner.hasNext() ? scanner.next() : null;
                String author = scanner.hasNext() ? scanner.next() : null;
                books.add(String.format("%s: %s", author, title));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file!", e);
        }
        return books;
    }
}
