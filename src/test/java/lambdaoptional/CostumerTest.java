package lambdaoptional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CostumerTest {
    Costume c1 = new Costume("nadrág", Costume.Size.S, 1000);
    Costume c2 = new Costume("ing", Costume.Size.M, 1000);
    Costume c3 = new Costume("kalóz nadrág", Costume.Size.S, 1500);
    Costume c4 = new Costume("kalóz ing", Costume.Size.M, 1500);
    Costume c5 = new Costume("bohósapka", Costume.Size.XL, 500);
    Costumer costumer = new Costumer(List.of(c1, c2, c3, c4, c5));

    @Test
    void findFirstCostumeWithKeyWordTest() {
        Optional<Costume> result = costumer.findFirstCostumeWithKeyWord("kalóz");
        assertTrue(result.isPresent());
        assertEquals(c3, result.get());
    }

    @Test
    void findFirstCostumeWithKeyWordNotFoundTest() {
        Optional<Costume> result = costumer.findFirstCostumeWithKeyWord("gengszter");
        assertTrue(result.isEmpty());
    }

    @Test
    void findFirstCheaperCostumeTest() {
        Optional<Costume> result = costumer.findFirstCheaperCostume(700);
        assertTrue(result.isPresent());
        assertEquals(c5, result.get());
    }

    @Test
    void findFirstCheaperCostumeNotFoundTest() {
        Optional<Costume> result = costumer.findFirstCheaperCostume(100);
        assertTrue(result.isEmpty());
    }

    @Test
    void findFirstCostumeSameSizeTest() {
        Optional<Costume> result = costumer.findFirstCostumeSameSize(Costume.Size.M);
        assertTrue(result.isPresent());
        assertEquals(c2, result.get());
    }

    @Test
    void findFirstCostumeSameSizeNotFoundTest() {
        Optional<Costume> result = costumer.findFirstCostumeSameSize(Costume.Size.L);
        assertTrue(result.isEmpty());
    }
}