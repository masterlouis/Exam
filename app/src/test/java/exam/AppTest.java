/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package exam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

class AppTest {
    @Test void firstLower() {
        assertEquals(1, Math.min(1, 2));
    }
   

    private static final String EMPTY = "";
	private static final String NON_EMPTY = "abc";

    @Test
	public void testConcat_EmptyEmpty()
	{
		assertSame(EMPTY, EMPTY.concat(""));
	}

    @Test
    public void testConcat_NonEmptyEmpty() 
    {
        assertEquals(NON_EMPTY, EMPTY.concat(NON_EMPTY));
    }

    @Test
    public void testConcat_EmptyNonEmpty()
    {
        assertEquals("abcabc", NON_EMPTY.concat(NON_EMPTY));
    }

    calculator calculator;

    @BeforeEach
    void setup()
    {
        calculator = new calculator();
    }

    @Test
    @DisplayName("La semplice moltiplicazione dovrebbe funzionare")
    void testMultiply()
    {
        assertEquals(20, calculator.multiply(4, 5), "regolare moltiplicazione funzionante");
    }

    class calculatorTest {
        
        calculator calculator;

        @BeforeEach
        void setup() {
            calculator = new calculator();

        }

        @Test
        @DisplayName("simple multiplication should work")
        void testMultiply() {
            assertEquals(20, calculator.multiply(5, 4), "regular multiplication");
        }

        @RepeatedTest(5)
        @DisplayName("assicura il giusto utilizzo dello 0")
        void testMultiplyWithZero(){
            assertEquals(0, calculator.multiply(0, 5), "the result should be zero");
        }
    }
}
