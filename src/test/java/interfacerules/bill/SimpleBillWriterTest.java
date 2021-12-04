package interfacerules.bill;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBillWriterTest {

    @Test
    void writeBill() {
        String result = new SimpleBillWriter()
                .writeBill(new Bill()
                        .readBillItemsFromFile(Paths.get("src/test/resources/interfacerules/bill/billitems.txt")));
        String[] parts = result.split("\n");
        assertEquals(4, parts.length);
        assertEquals("kenyér, 1 * 400 = 400 Ft", parts[0]);
    }
}