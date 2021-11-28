package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {

    @Test
    void getSalary() {
        Boss boss = new Boss("Boss", "adr", 1000, 10);
        assertEquals(1100, boss.getSalary());
    }
}