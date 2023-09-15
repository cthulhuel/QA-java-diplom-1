import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class TestIngredient {

    private final IngredientType type;
    private final String name;
    private final float price;

    public TestIngredient(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters()
    public static Object[][] parameters() {
        return new Object[][]{
                {IngredientType.FILLING,"Курица",100},
                {IngredientType.FILLING,"Говядина",150},
                {IngredientType.SAUCE,"Майонез",15},
                {IngredientType.SAUCE,"Кетчуп",10},
        };
    }

    @Test
    public void testIngredient() {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertThat(ingredient.getType()).isEqualTo(type);
        assertThat(ingredient.getName()).isEqualTo(name);
        assertThat(ingredient.getPrice()).isEqualTo(price);
    }

}
