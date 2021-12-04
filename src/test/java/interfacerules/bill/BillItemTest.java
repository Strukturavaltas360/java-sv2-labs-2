package interfacerules.bill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillItemTest {
    @Test
    void createTest() {
        BillItem billItem = new BillItem("kenyér;400;1");
        assertEquals("kenyér", billItem.getName());
        assertEquals(400, billItem.getPrice());
        assertEquals(1, billItem.getQuantity());
    }

}