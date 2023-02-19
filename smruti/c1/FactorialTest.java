import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FactorialTest {
    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        int result = factorial.factorial(5);
        assertEquals(120, result);
    }
}

