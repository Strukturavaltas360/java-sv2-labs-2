package collectionsmap;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ClassTripTest {
    ClassTrip classTrip = new ClassTrip();

    @Test
    void loadInpayments() {
        Path inputFile = Path.of("src/test/resources/collectionsmap/inpayments.txt");
        classTrip.loadInpayments(inputFile);
        System.out.println(classTrip.getInpayments());
    }
}