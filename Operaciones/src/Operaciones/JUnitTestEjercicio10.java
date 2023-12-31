package Operaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JUnitTestEjercicio10 {
	
        //Probar suma con array vacía
	@Test
    public void testAddWithEmptyList() {
        List<Integer> list = new ArrayList<>();
        Assertions.assertThrows(NullPointerException.class, () -> {
            Operaciones.add(list);
        });
    }
	//Probar suma con un solo elemento en la array
	@Test
    public void testAddWithSingleElementList() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        int result = Operaciones.add(list);
        assertEquals(5, result);
    }
	//Probar suma de elementos de un array con varios números
	@Test
    public void testAddWithMultipleElementList() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        int result = Operaciones.add(list);
        assertEquals(19, result);
    }
	//Probar suma con un elemento nulo
	 @Test
	    public void testAddWithNullElements() {
	        List<Integer> list = new ArrayList<>();
	        list.add(2);
	        list.add(null);
	        list.add(3);
	        Assertions.assertThrows(NullPointerException.class, () -> {
	            Operaciones.add(list);
	        });
	    }

}
