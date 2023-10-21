package Operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitTestEjercicio3 {

	@Test
    public void testFindMaxNumberWithEmptyArray() {
        int[] arr = {};
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Operaciones.findMaxNumber(arr);
        });
    }
	
	@Test
    public void testFindMaxNumberWithSingleElementArray() {
        int[] arr = {5};
        int result = Operaciones.findMaxNumber(arr);
        assertEquals(5, result);
    }
	
	@Test
    public void testFindMaxNumberWithMultipleElementArray() {
        int[] arr = {2, 5, 3, 8, 1};
        int result = Operaciones.findMaxNumber(arr);
        assertEquals(8, result);
    }
	
	@Test
    public void testFindMaxNumberWithNegativeElements() {
        int[] arr = {-2, -5, -3, -8, -1};
        int result = Operaciones.findMaxNumber(arr);
        assertEquals(-1, result);
    }
	
	
}
