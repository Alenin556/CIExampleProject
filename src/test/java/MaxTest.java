import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxTest {
    @Test
    public void max() {
        Max max = new Max();

        int a = 5;
        int b = 10;

        int expected = b;
        int actual = max.max(a,b);

        Assertions.assertEquals(expected,actual);
    }
}
