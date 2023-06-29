package Stringhe;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringheTest {

	    @Test
	    void testStringProperties_NullString() {
	        String result = Stringhe.stringProperties(null);
	        assertEquals("String is null", result);
	    }

	    @Test
	    void testStringProperties_EmptyString() {
	        String result = Stringhe.stringProperties("");
	        assertEquals("String is empty", result);
	    }

	    @Test
	    void testStringProperties_ShortString() {
	        String result = Stringhe.stringProperties("abcd");
	        assertEquals("String length is less than 5", result);
	    }

	    @Test
	    void testStringProperties_OnlyNumbers() {
	        String result = Stringhe.stringProperties("12345");
	        assertEquals("String contains only numbers", result);
	    }

	    @Test
	    public void testStringProperties_OnlyLetters() {
	        String result = Stringhe.stringProperties("abcABC");
	        assertEquals("String contains only letters", result);
	    }

	    @Test
	    public void testStringProperties_LettersAndNumbers() {
	        String result = Stringhe.stringProperties("abc123");
	        assertEquals("String contains only letters and numbers", result);
	    }

	    @Test
	    void testStringProperties_SpecialCharacters() {
	        String result = Stringhe.stringProperties("abc!@#");
	        assertEquals("String contains special characters", result);
	    }
}
