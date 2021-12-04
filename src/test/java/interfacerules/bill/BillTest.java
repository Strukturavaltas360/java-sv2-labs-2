package interfacerules.bill;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BillTest {

    @Test
    void readBillItemsFromFile() {
        Bill bill = new Bill();
        List<String> list = bill.readBillItemsFromFile(
                Paths.get("src/test/resources/interfacerules/bill/billitems.txt"));
        assertEquals(4, list.size());
    }
}