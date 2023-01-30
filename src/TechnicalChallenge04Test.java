import org.junit.Test; //
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TechnicalChallenge04Test {
    @Test
    @DisplayName(value = "Remove the last character from the string. !")
    public void removeTest() {
        char[] s = {'a','b','c'};
        char[] sMinus = TechnicalChallenge04.remove(s);
        assertEquals(2, sMinus.length);
        assertEquals("ab",new String(sMinus));
    }
    @Test
    @DisplayName(value = "Concat a lowercase character at the end...")
    public void concatTest() {
        char[] s = {'a','b','c'};
        char[] splus = TechnicalChallenge04.concat(s,'d');
        assertEquals(4, splus.length);
        assertEquals("abcd",new String(splus));
    }
}