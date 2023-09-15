import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestBurger {

    Burger burger = new Burger();
    @Mock
    private Bun bun;
    @Mock
    private Ingredient ingredient;


    @Test
    public void testGetPriceBurger() {
        Mockito.when(bun.getPrice()).thenReturn(100.0f);
        Mockito.when(ingredient.getPrice()).thenReturn(100.0f);
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        float expectedPrice = 300.0f;
        float actualPrice = burger.getPrice();
        assertEquals(expectedPrice, actualPrice, 0.0f);
    }

    @Test
    public void testGetPriceBurgerWhenAddIngredient() {
        Mockito.when(bun.getPrice()).thenReturn(100.0f);
        Mockito.when(ingredient.getPrice()).thenReturn(100.0f);
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        float expectedPrice = 500.0f;
        float actualPrice = burger.getPrice();
        assertEquals(expectedPrice, actualPrice, 0.0f);
    }

    @Test
    public void testGetPriceBurgerWhenRemoveIngredient() {
        Mockito.when(bun.getPrice()).thenReturn(100.0f);
        Mockito.when(ingredient.getPrice()).thenReturn(100.0f);
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.removeIngredient(2);
        float expectedPrice = 400.0f;
        float actualPrice = burger.getPrice();
        assertEquals(expectedPrice, actualPrice, 0.0f);
    }

    @Test
    public void testGetPriceBurgerWhenMoveIngredient() {
        Mockito.when(bun.getPrice()).thenReturn(100.0f);
        Mockito.when(ingredient.getPrice()).thenReturn(100.0f);
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.moveIngredient(1, 0);
        float expectedPrice = 400.0f;
        float actualPrice = burger.getPrice();
        assertEquals(expectedPrice, actualPrice, 0.0f);
    }

    @Test
    public void testReceipt() {
        Mockito.when(bun.getPrice()).thenReturn(1.0f);
        Mockito.when(bun.getName()).thenReturn("Булка");

        burger.setBuns(bun);
        burger.getReceipt();

        String expectedReceipt = "(==== Булка ====)\n" +
                "(==== Булка ====)\n" +
                "\n" +
                "Price: 2,000000\n";
        String actualReceipt = burger.getReceipt();
        assertEquals(expectedReceipt, actualReceipt);
    }

}
