import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TechnicalChallenge04Test {
    @Test
    //@DisplayName(value = "Remove the last character from the string. If the string is empty, it will remain empty.!")
    public void removeTest() {
        char[] s = {'a','b','c'};
        char[] sMinus = TechnicalChallenge04.remove(s);
        assertEquals(2, sMinus.length);
        assertEquals("ab",new String(sMinus));
        char[] sMinusMinus = TechnicalChallenge04.remove(sMinus);
        assertEquals("a", new String(sMinusMinus));
        char[] sMinusMinusMinus = TechnicalChallenge04.remove(sMinusMinus);
        assertEquals(0, sMinusMinusMinus.length);
        char[] sMinusMinusMinusMinus = TechnicalChallenge04.remove(sMinusMinusMinus);
        assertEquals(0, sMinusMinusMinusMinus.length);
    }
    @Test
    //@DisplayName(value = "Concat a lowercase character at the end...")
    public void concatTest() {
        char[] s = {'a','b','c'};
        char[] splus = TechnicalChallenge04.concat(s,'d');
        assertEquals(4, splus.length);
        assertEquals("abcd",new String(splus));
    }
}