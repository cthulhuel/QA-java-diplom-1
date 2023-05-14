import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestBun {

    private final String name;
    private final float price;

    public TestBun(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters()
    public static Object[][] parameters() {
        return new Object[][]{
                {"Булка", 50},
                {"Bulka", 05},
                {" ", 0},
        };
    }

        @Test
    public void testGetName() {
        Bun bun = new Bun(name,price);
        assertEquals(name,bun.getName());
    }

    @Test
    public void testGetPrice() {
        Bun bun = new Bun(name,price);
        assertEquals(price,bun.getPrice(),0);
    }

}
