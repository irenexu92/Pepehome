package edu.gatech.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }

    /*
    To test normal string counts
     */
    @Test
    public void testCountNumbers1() {
        mycustomstring.setString("H3y, l3t'5 put s0me d161ts in this 5tr1n6!11!!");
        assertEquals(9, mycustomstring.countNumbers());
    }

    /*
    To test string counts for the cases tht no numbers in the string.
     */
    @Test
    public void testCountNumbers2() {
        mycustomstring.setString("Hey, let's put some digits in this string!!");
        assertEquals(0, mycustomstring.countNumbers());
    }
    /*
    To test string counts for an empty string.
     */
    @Test
    public void testCountNumbers3() {
        mycustomstring.setString(" ");
        assertEquals(0, mycustomstring.countNumbers());
    }
    /*
    To test string counts for strings that is contiguous digits.
     */
    @Test
    public void testCountNumbers4() {
        mycustomstring.setString("111111111111");
        assertEquals(1, mycustomstring.countNumbers());
    }
    /*
    To test string counts for strings that is a set of contiguous digits.
     */
    @Test
    public void testCountNumbers5() {
        mycustomstring.setString("1111 1111 1111");
        assertEquals(3, mycustomstring.countNumbers());
    }
    /*
    To test string counts for strings that is a cobinaion of letters, contiguous digits.
     */
    @Test
    public void testCountNumbers6() {
        mycustomstring.setString("My numbers are 1 11 111, 1111 1111 1111");
        assertEquals(6, mycustomstring.countNumbers());
    }
    /*
    To test a normal string while n=4, false.
     */
    @Test
    public void testRotateCharacters1() {
        mycustomstring.setString("1234!!! H3y, l3t'5 put 50me d161ts in this 5tr1n6!11!1");
        assertEquals("2341!! !3y,Hl3t 5 p't 5ume 0161ds it thns 5ir1nt!1161!", mycustomstring.rotateCharacters(4, false));
    }
    /*
    To test a normal string while n=4, true.
     */
    @Test
    public void testRotateCharacters2() {
        mycustomstring.setString("1234!!! H3y, l3t'5 put 50me d161ts in this 5tr1n6!11!1");
        assertEquals("4123 !!!,H3yt l3p'5 5ut  0me1d16its hn t5is ntr116!11!", mycustomstring.rotateCharacters(4, true));
    }
     /*
    To test a normal string while n=2, false.
     */
    @Test
    public void testRotateCharacters3() {
        mycustomstring.setString("hello 90, bye 2");
        assertEquals("ehll o09 ,yb e2", mycustomstring.rotateCharacters(2, false));
    }
     /*
    To test a normal string while n=2, true.
     */
    @Test
    public void testRotateCharacters4() {
        mycustomstring.setString("hello 90, bye 2");
        assertEquals("ehll o09 ,yb e2", mycustomstring.rotateCharacters(2, true));
    }
     /*
    To test a digit-only  string while n=4, false. String length is not multiple of 4.
     */
    @Test
    public void testRotateCharacters5() {
        mycustomstring.setString("1234567890");
        assertEquals("2341678509", mycustomstring.rotateCharacters(4, false));
    }
     /*
    To test a digit-only string while n=4, true. String length is not multiple of 4.
     */
    @Test
    public void testRotateCharacters6() {
        mycustomstring.setString("1234567890");
        assertEquals("4123856709", mycustomstring.rotateCharacters(4, true));
    }
      /*
    To test a digit-only  string while n=4, false. String length is multiple of 4.
     */
    @Test
    public void testRotateCharacters7() {
        mycustomstring.setString("12345678");
        assertEquals("23416785", mycustomstring.rotateCharacters(4, false));
    }
     /*
    To test a digit-only string while n=4, true. String length is multiple of 4.
     */
    @Test
    public void testRotateCharacters8() {
        mycustomstring.setString("12345678");
        assertEquals("41238567", mycustomstring.rotateCharacters(4, true));
    }
      /*
    To test a digit-only string while n=4, false. String length is smaller than n.
     */
    @Test
    public void testRotateCharacters9() {
        mycustomstring.setString("123");
        assertEquals("312", mycustomstring.rotateCharacters(4, false));
    }
    /*
    To test a digit-only string while n=4, true. String length is smaller than n.
     */
    @Test
    public void testRotateCharacters10() {
        mycustomstring.setString("123");
        assertEquals("231", mycustomstring.rotateCharacters(4, true));
    }
      /*
    To test when no string was set. 
     */
    @Test(expected = NullPointerException.class)
    public void testRotateCharacters11() {
        mycustomstring.setString();
        rotateCharacters(4, false);
    }
     /*
    To test a case while n =0 
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRotateCharacters12() {
        mycustomstring.setString("");
        rotateCharacters(0, false);
    }

     /*
    To test a normal string. 
     */
    @Test
    public void testConvertLettersToDigitsInSubstring1() {
        mycustomstring.setString("H3y, l3t'5 put 50me D161ts in this 5tr1n6!11!!");
        mycustomstring.convertLettersToDigitsInSubstring(18, 30);
        assertEquals("H3y, l3t'5 put 50m5 416120,19 9,14 20his 5tr1n6!11!!", mycustomstring.getString());
    }
     /*
    Null string test. 
     */
    @Test(expected = NullPointerException.class)
    public void testConvertLettersToDigitsInSubstring2() {
        MyCustomString string = new MyCustomString();
        mycustomstring.convertLettersToDigitsInSubstring(1, 100);
    }
     /*
    test case when start position < 1
     */
    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertLettersToDigitsInSubstring3() { 
        mycustomstring.setString("Hello World")
        mycustomstring.convertLettersToDigitsInSubstring(0, 6);
    }
      /*
    test case when endposition > string length
     */
    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertLettersToDigitsInSubstring4() {
        mycustomstring.setString("Hello World")
        mycustomstring.convertLettersToDigitsInSubstring(1, 100);
    }
      /*
    test case when endposition < start position
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConvertLettersToDigitsInSubstring5() {
        mycustomstring.setString("Hello World")
        mycustomstring.convertLettersToDigitsInSubstring(200, 100);
    }
    /*
    Test string with only numbers
    */
    @Test
    public void testConvertLettersToDigitsInSubstring6() {
        mycustomstring.setString("1234567890");
        mycustomstring.convertLettersToDigitsInSubstring(1, 10);
        assertEquals("1234567890", mycustomstring.getString());
    }
    /*
    Test empty strings
    */
    @Test
    public void testConvertLettersToDigitsInSubstring7() {
        mycustomstring.setString(" ");
        mycustomstring.convertLettersToDigitsInSubstring(1, 1);
        assertEquals(" ", mycustomstring.getString());
    }
     /*
    Test strings with number and letters
    */
    @Test
    public void testConvertLettersToDigitsInSubstring8() {
        mycustomstring.setString("3 Cats.");
        mycustomstring.convertLettersToDigitsInSubstring(1, 7);
        assertEquals("3 3,1,20,19.", mycustomstring.getString());
    }
     /*
    Test strings with comma in the end
    */
    @Test
    public void testConvertLettersToDigitsInSubstring9() {
        mycustomstring.setString("3 Cats,");
        mycustomstring.convertLettersToDigitsInSubstring(1, 7);
        assertEquals("3 3,1,20,19,", mycustomstring.getString());
    }
      /*
    Test strings with comma at the end position
    */
    @Test
    public void testConvertLettersToDigitsInSubstring10() {
        mycustomstring.setString("3 Cats, 4 Dogs,");
        mycustomstring.convertLettersToDigitsInSubstring(1, 7);
        assertEquals("3 3,1,20,19, 4 Dogs,", mycustomstring.getString());
    }

}
