package Operaciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitTestEjercicio2 {

	
	@Test
    public void testFindHighestNumberWithN1Greater() {
        int result = Operaciones.findHighestNumber(5, 3, 2);
        assertEquals(5, result);
    }
	
	@Test
    public void testFindHighestNumberWithN3Greater() {
        int result = Operaciones.findHighestNumber(2, 3, 5);
        assertEquals(5, result);
    }
	
	@Test
	    public void testFindHighestNumberWithN2Greater() {
	        int result = Operaciones.findHighestNumber(2, 5, 3);
	        assertEquals(5, result);
	    }
	 
	@Test
	    public void testFindHighestNumberWithEqualNumbers() {
	        int result = Operaciones.findHighestNumber(2, 2, 2);
	        assertEquals(2, result);
	    }

}
