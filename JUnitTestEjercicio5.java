package Operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestEjercicio5 {

	//Sin palabras
	@Test
    public void testReverseWordWithEmptyString() {
        String result = Operaciones.reverseWord("");
        assertEquals("", result);
    }
	//Con una sola palabra
	@Test
    public void testReverseWordWithSingleWord() {
        String result = Operaciones.reverseWord("hola");
        assertEquals("aloh", result);
    }
	//Con multiples palabras
	@Test
    public void testReverseWordWithMultipleWords() {
        String result = Operaciones.reverseWord("hola mundo");
        assertEquals("odnum aloh", result);
    }
	//Con multiples palabras y espacios
	@Test
    public void testReverseWordWithExtraSpaces() {
        String result = Operaciones.reverseWord("  hola   mundo  ");
        assertEquals("  aloh   odnum  ", result);
    }

}
