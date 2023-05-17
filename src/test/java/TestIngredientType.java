import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestIngredientType {

    private final IngredientType type;

    public TestIngredientType(IngredientType type) {
        this.type = type;
    }

    @Parameterized.Parameters()
    public static Object[][] parameters() {
        return new Object[][]{
                {IngredientType.SAUCE},
                {IngredientType.FILLING},
        };
    }

    @Test
    public void testFailedGetIngredientType() {
        Ingredient ingredient = new Ingredient(type,"Майонез",15);
        assertEquals(type,ingredient.getType());

    }

}


