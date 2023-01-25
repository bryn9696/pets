import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class calculateTest {

    calculate calculate;

    @Test
    // @DisplayName("addition should work")
    public void test() {
        calculate = new calculate();
        assertEquals(8, calculate.add(5));
    }
}