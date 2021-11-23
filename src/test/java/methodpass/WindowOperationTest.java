package methodpass;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WindowOperationTest {

    @Test
    void riseSize() {
        List<Window> windows = new ArrayList<>();
        windows.add(new Window("Konyha", 120, 120));
        windows.add(new Window("Szoba1", 120, 150));
        windows.add(new Window("Szoba2", 60, 150));
        windows.add(new Window("Spájz", 60, 60));

        WindowOperation windowOperation = new WindowOperation();
        windowOperation.riseSize(windows, -10);
        assertEquals(110, windows.get(0).getHeight());
        assertEquals(50, windows.get(3).getHeight());
    }
}