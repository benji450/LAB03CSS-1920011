package Operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestEjercicio6 {
    
	//Primer numero mayor
	@Test
    public void testCompareTwoNumbersWithN1Greater() {
        int result = Operaciones.compareTwoNumbers(5, 3);
        assertEquals(1, result);
    }
	//Segudo numero mayor
	@Test
    public void testCompareTwoNumbersWithN2Greater() {
        int result = Operaciones.compareTwoNumbers(3, 5);
        assertEquals(-1, result);
    }
	
	//Numeros iguales
	@Test
    public void testCompareTwoNumbersWithEqualNumbers() {
        int result = Operaciones.compareTwoNumbers(5, 5);
        assertEquals(0, result);
    }
	
	//Comparar dos numeros con diferente tipo
	@Test
    public void testCompareTwoNumbersWithDifferentTypes() {
        Integer n1 = new Integer(5);
        int n2 = 5;
        int result = Operaciones.compareTwoNumbers(n1, n2);
        assertEquals(0, result);
    }
}
