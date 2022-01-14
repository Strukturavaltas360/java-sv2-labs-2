package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {

    @Test
    void getHighestIncome() {
        Income income = new Income(new int[] {200, 100, 300, 550, 340, 20});
        assertEquals(550, income.getHighestIncome());
    }
}