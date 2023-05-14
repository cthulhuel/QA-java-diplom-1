import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;
import static org.assertj.core.api.Assertions.assertThat;
import static praktikum.IngredientType.SAUCE;

public class TestIngredient {

    @Test
    public void testGetPriceIngredient() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING,"Курица",100);
        assertThat(ingredient.getPrice()).isEqualTo(100);
    }

    @Test
    public void testGetNameIngredient() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE,"Майонез",15);
        assertThat(ingredient.getName()).isEqualTo("Майонез");
    }

    @Test
    public void testGetTypeIngredient() {
        IngredientType expectedIngredientType = SAUCE;
        Ingredient ingredient = new Ingredient(expectedIngredientType,"Кетчуп",10);
        assertThat(ingredient.getType()).isEqualTo(expectedIngredientType);
    }

}
