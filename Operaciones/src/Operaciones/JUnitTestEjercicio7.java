package Operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestEjercicio7 {

	//Array vacía
	@Test
    public void testSortArrayWithEmptyArray() {
        int[] arr = {};
        Operaciones.sortArray(arr);
        assertArrayEquals(new int[]{}, arr);
    }
	//Array con un solo elemento
	@Test
    public void testSortArrayWithSingleElementArray() {
        int[] arr = {5};
        Operaciones.sortArray(arr);
        assertArrayEquals(new int[]{5}, arr);
    }
	//Array con varios elementos
	@Test
    public void testSortArrayWithMultipleElementArray() {
        int[] arr = {2, 5, 3, 8, 1};
        Operaciones.sortArray(arr);
        assertArrayEquals(new int[]{1, 2, 3, 5, 8}, arr);
    }
	//Array con elementos duplicados
	@Test
    public void testSortArrayWithDuplicateElements() {
        int[] arr = {2, 5, 3, 8, 1, 5};
        Operaciones.sortArray(arr);
        assertArrayEquals(new int[]{1, 2, 3, 5, 5, 8}, arr);
    }

}
