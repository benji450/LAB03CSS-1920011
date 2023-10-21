package Operaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class JUnitTestEjercicio8 {

	@Test
    public void testRemoveDuplicatesWithEmptyList() {
        List<Integer> list = new ArrayList<>();
        Operaciones.removeDuplicates(list);
        assertEquals(new ArrayList<>(), list);
    }
	
	@Test
    public void testRemoveDuplicatesWithSingleElementList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(5));
        Operaciones.removeDuplicates(list);
        assertEquals(new ArrayList<>(Arrays.asList(5)), list);
    }
	
	@Test
    public void testRemoveDuplicatesWithMultipleElementList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 3, 8, 1, 5));
        Operaciones.removeDuplicates(list);
        assertEquals(new ArrayList<>(Arrays.asList(2, 5, 3, 8, 1)), list);
    }
	
	@Test
    public void testRemoveDuplicatesWithConsecutiveDuplicateElements() {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 5, 3, 8, 1, 1));
        Operaciones.removeDuplicates(list);
        assertEquals(new ArrayList<>(Arrays.asList(2, 5, 3, 8, 1)), list);
    }
}
