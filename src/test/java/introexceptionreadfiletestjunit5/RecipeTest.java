package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void addIngredients() {
        Path path = Paths.get("src/test/resources/introexceptionreadfiletestjunit5/recipe.txt");
        Recipe recipe = new Recipe();
        recipe.addIngredients(path);

        List<String> expected = Arrays.asList(new String[] {
                        "liszt",
                        "margarin",
                        "kristálycukor",
                        "tojás",
                        "citrom",
                        "sütőpor",
                        "vanillincukor",
                        "tejföl",
                        "alma",
                        "fahéj"} );

        assertEquals(expected, recipe.getIngredients());
    }

    @Test
    void addIngredientsException() {
        Path path = Paths.get("src/test/resources/introexceptionreadfiletestjunit5/recipe.t");
        Recipe recipe = new Recipe();

        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> recipe.addIngredients(path));
        assertEquals("Can not read file!", exception.getMessage());
    }
}