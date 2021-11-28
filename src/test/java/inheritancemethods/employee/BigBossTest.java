package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigBossTest {

    @Test
    void getSalary() {
        BigBoss bigBoss = new BigBoss("BigBoss", "adr", 1000, 20,150);
        assertEquals(1250, bigBoss.getSalary());
    }
}