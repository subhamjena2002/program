import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumTest {
    @Test
    void testSum() {
        Sum sum = new Sum();
        int result = sum.sum(2, 3);
        assertEquals(5, result);
    }
}