package Operaciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitTestEjercicio4 {

	//Calcular cubo con cero
	 @Test
	    public void testCalculateCubeWithZero() {
	        int result = Operaciones.calculateCube(0);
	        assertEquals(0, result);
	    }
	 //Calcular cubo usando un número positivo
	 @Test
	    public void testCalculateCubeWithPositiveNumber() {
	        int result = Operaciones.calculateCube(5);
	        assertEquals(125, result);
	    }
	 //Calcular usando un número negativo
	 @Test
	    public void testCalculateCubeWithNegativeNumber() {
	        int result = Operaciones.calculateCube(-5);
	        assertEquals(-125, result);
	    }
	 //Calcular usando el mayor valor posible de tipo int
	 @Test
	    public void testCalculateCubeWithMaxInt() {
	        int result = Operaciones.calculateCube(Integer.MAX_VALUE);
	        assertEquals(2147483647, result);
	    }

}
