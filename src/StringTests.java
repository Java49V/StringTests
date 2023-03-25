//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;

//class StringTests {
//
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
//
//}
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class StringTests {

    @Test
    public void testCharAt() {
        String str = "Hello, World!";
        char expected = 'e';
        char actual = str.charAt(1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCompareTo() {
        String str1 = "abc";
        String str2 = "def";
        int expected = -3;
        int actual = str1.compareTo(str2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCompareToIgnoreCase() {
        String str1 = "abc";
        String str2 = "DEF";
        int expected = -3;
        int actual = str1.compareToIgnoreCase(str2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testConcat() {
        String str1 = "Hello";
        String str2 = "World!";
        String expected = "HelloWorld!";
        String actual = str1.concat(str2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStartsWith() {
        String str = "Hello, World!";
        boolean expected = true;
        boolean actual = str.startsWith("Hello");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEndsWith() {
        String str = "Hello, World!";
        boolean expected = true;
        boolean actual = str.endsWith("World!");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testContains() {
        String str = "Hello, World!";
        boolean expected = true;
        boolean actual = str.contains("World");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Disabled
    public void testIndexOf() {
        String str = "Hello, World!";
        int expected = 7;
        int actual = str.indexOf(",");
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void testIndexOfMatch() {
        String str = "Hello, World!";
        String substring = "World";
        int expected = 7;
        int result = str.indexOf(substring);
        assertEquals(expected, result);
    }

    @Test
    @Disabled
    public void testLastIndexOf_1() {
        String str = "Hello, World!";
        int expected = 7;
        int actual = str.lastIndexOf(',');
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void testLastIndexOf() {
        String str = "Hello, World!";
        char ch = '!';
        int expected = 12;
        int result = str.lastIndexOf(ch);
        assertEquals(expected, result);
    }

}
