package Operaciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
class JUnitTestEjercicio1 {

	//N = 0
	@Test
    public void testAddFirstNumbersExceptionWithZero() {
        int result = Operaciones.addFirstNumbersException(0);
        assertEquals(0, result);
    }
	//N > 0
	@Test
    public void testAddFirstNumbersExceptionWithPositiveNumber() {
        int result = Operaciones.addFirstNumbersException(5);
        assertEquals(15, result);
    }
	//N < 0
	@Test
    public void testAddFirstNumbersExceptionWithNegativeNumber() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Operaciones.addFirstNumbersException(-5);
        });
    }
	
	@Test
    public void testAddFirstNumbersExceptionWithRecursiveCall() {
        int result = Operaciones.addFirstNumbersException(3);
        assertEquals(6, result);
    }

}
