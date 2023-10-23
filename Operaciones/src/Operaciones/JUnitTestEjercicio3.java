package Operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitTestEjercicio3 {

	//Encontrar el número mayor con array vacía
	@Test
    public void testFindMaxNumberWithEmptyArray() {
        int[] arr = {};
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Operaciones.findMaxNumber(arr);
        });
    }
	//Encontrar el número mayor con un solo elemento en la array
	@Test
    public void testFindMaxNumberWithSingleElementArray() {
        int[] arr = {5};
        int result = Operaciones.findMaxNumber(arr);
        assertEquals(5, result);
    }
	//Encontrar el número mayor con varios elementos en la array
	@Test
    public void testFindMaxNumberWithMultipleElementArray() {
        int[] arr = {2, 5, 3, 8, 1};
        int result = Operaciones.findMaxNumber(arr);
        assertEquals(8, result);
    }
	//Encontrar el número mayor entre números negativos
	@Test
    public void testFindMaxNumberWithNegativeElements() {
        int[] arr = {-2, -5, -3, -8, -1};
        int result = Operaciones.findMaxNumber(arr);
        assertEquals(-1, result);
    }
	
	
}
