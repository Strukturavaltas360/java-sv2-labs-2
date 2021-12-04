package interfacerules.bill;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComplexBillWriterTest {

    @Test
    void writeBill() {
        String result = new ComplexBillWriter()
                .writeBill(new Bill()
                        .readBillItemsFromFile(Paths.get("src/test/resources/interfacerules/bill/billitems.txt")));
        String[] parts = result.split("\n");
        assertEquals(4, parts.length);
        assertEquals("kenyér; darabszám: 1, egységár: 400, összesen: 400 Ft", parts[0]);
    }
}