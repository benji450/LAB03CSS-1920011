package Operaciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitTestEjercicio4 {
	 @Test
	    public void testCalculateCubeWithZero() {
	        int result = Operaciones.calculateCube(0);
	        assertEquals(0, result);
	    }
	 
	 @Test
	    public void testCalculateCubeWithPositiveNumber() {
	        int result = Operaciones.calculateCube(5);
	        assertEquals(125, result);
	    }
	 
	 @Test
	    public void testCalculateCubeWithNegativeNumber() {
	        int result = Operaciones.calculateCube(-5);
	        assertEquals(-125, result);
	    }
	 
	 @Test
	    public void testCalculateCubeWithMaxInt() {
	        int result = Operaciones.calculateCube(Integer.MAX_VALUE);
	        assertEquals(2147483647, result);
	    }

}
