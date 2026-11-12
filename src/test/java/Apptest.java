
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App app = new App();

    @Test
    public void testAddition() {
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testAdditionWithZero() {
        assertEquals(10, app.add(10, 0));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, app.subtract(10, 5));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(0, app.add(-5, 5));
    }
}
