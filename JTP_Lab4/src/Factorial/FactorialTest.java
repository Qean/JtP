package Factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {

    @org.junit.jupiter.api.Test
    void factorial() throws NegativeNumberException {
        assertThrows(NegativeNumberException.class, () -> Factorial.factorial(-3));
        assertThrows(NegativeNumberException.class, () -> Factorial.factorial(-2));
        assertThrows(NegativeNumberException.class, () -> Factorial.factorial(-1));
        assertEquals(1, Factorial.factorial(0));
        assertEquals(1, Factorial.factorial(1));
        assertEquals(2, Factorial.factorial(2));
        assertEquals(6, Factorial.factorial(3));
        assertEquals(24, Factorial.factorial(4));
        assertEquals(120, Factorial.factorial(5));
    }
}