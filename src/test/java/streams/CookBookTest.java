package streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CookBookTest {
    Cake c1 = new Cake("cake1", List.of("ingr1", "ingr2", "ingr3"));
    Cake c2 = new Cake("cake2", List.of("ingr2", "ingr3"));
    Cake c3 = new Cake("cake3", List.of("ingr1", "ingr2", "ingr3", "ingr4"));
    Cake c4 = new Cake("cake4", List.of("ingr2", "ingr4"));
    CookBook cookBook = new CookBook(List.of(c4, c3, c2, c1));

    @Test
    void listCakeNamesWithGivenIngredient() {
        assertEquals(List.of("cake3", "cake1"), cookBook.listCakeNamesWithGivenIngredient("ingr1"));
    }

    @Test
    void listCakeNamesWithMaxIngredients() {
        assertEquals(List.of("cake4", "cake2", "cake1"), cookBook.listCakeNamesWithMaxIngredients(3));
    }
}