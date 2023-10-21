package Operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JUnitTestEjercico9 {

	@Test
    public void testDivTwoNumbersWithIntegers() {
        double result = Operaciones.divTwoNumbers(10, 2);
        assertEquals(5.0, result, 0.0);
    }
	
	@Test
    public void testDivTwoNumbersWithDivisorZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Operaciones.divTwoNumbers(10, 0);
        });
    }
	
	@Test
    public void testDivTwoNumbersWithFloatingPointNumber() {
        double result = Operaciones.divTwoNumbers(10, 3);
        assertEquals(3.3333333333333335, result, 0.000000000000001);
    }
	
	@Test
    public void testDivTwoNumbersWithTwoFloatingPointNumbers() {
        double result = Operaciones.divTwoNumbers(10.5, 2.5);
        assertEquals(4.2, result, 0.0);
    }
	
	
}
