package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    @TempDir
    File tempDir;

    @Test
    void transform() throws IOException {
        Books books = new Books();
        Path readFrom = Paths.get("src/test/resources/introexceptionwritefiletestjunit5/books.txt");
        Path writeTo = tempDir.toPath().resolve("transformed.txt");

        books.transform(readFrom, writeTo);
        List<String> lines = Files.readAllLines(writeTo);

        assertEquals(4, lines.size());
        assertEquals("Molnár Ferenc: Pál utcai fiúk", lines.get(1));
    }
}