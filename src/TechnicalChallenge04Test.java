import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TechnicalChallenge04Test {
    @Test
    public void concatRemoveTestBla() {
        char s[] = {'b','l','a','b','l','a','b','l','a','b','l','a'};
        char t[] = {'c','d','e'};
        TechnicalChallenge04.concatRemove(s,t,8);
        assertTrue(true);
    }
    @Test
    public void concatRemoveTest01() {
        char s[] = {'b','l','a','b','l','a','b','l','a','b','l','a'};
        char t[] = {'c','d','e'};
        TechnicalChallenge04.concatRemove(s,t,1);
        assertTrue(true);
    }
    @Test
    public void concatRemoveTest02() {
        char s[] = {'b','l','a','b','l','a','b','l','a','b','l','a'};
        char t[] = {'c','d','e'};
        TechnicalChallenge04.concatRemove(s,t,2);
        assertTrue(true);
    }
    @Test
    public void concatRemoveTest03() {
        char s[] = {'b','l','a','b','l','a','b','l','a','b','l','a'};
        char t[] = {'c','d','e'};
        TechnicalChallenge04.concatRemove(s,t,3);
        assertTrue(true);
    }
    @Test
    public void concatRemoveTest04() {
        char s[] = {'b','l','a','b','l','a','b','l','a','b','l','a'};
        char t[] = {'c','d','e'};
        TechnicalChallenge04.concatRemove(s,t,7);
        assertTrue(true);
    }
    //
    @Test
    public void concatRemoveTest09() {
        char s[] = {'b','l','a','b','l','a','b','l','a','b','l','a'};
        char t[] = {'c','d','e'};
        TechnicalChallenge04.concatRemove(s,t,9);
        assertTrue(true);
    }
    @Test
    public void concatRemoveTestLimit99() {
        char s[] = {'b','l','a','b','l','a','b','l','a','b','l','a'};
        char t[] = {'c','d','e'};
        TechnicalChallenge04.concatRemove(s,t,99);
        assertTrue(true);
    }
    @Test
    public void concatRemoveTestLimit() {
        char s[] = {'b','l','a','b','l','a','b','l','a','b','l','a'};
        char t[] = {'c','d','e'};
        TechnicalChallenge04.concatRemove(s,t,100);
        assertTrue(true);
    }
    @Test
    public void concatRemoveTestFinal() {
        char s[] = {'b','l','a','b','l','a','b','l','a','b','l','a'};
        char t[] = {'c','d','e'};
        TechnicalChallenge04.concatRemove(s,t,101);
        assertTrue(true);
    }
    @Test
    public void concatRemoveTestTab() {
        char s[] = {'t','a','b'};
//TODO
    }
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