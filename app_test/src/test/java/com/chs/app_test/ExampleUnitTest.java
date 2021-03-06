package com.chs.app_test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testCalculate(){
        Utils utils = new Utils();
        assertEquals(2,utils.calculate(1,1));
        //3>1+1 是正确的
        assertTrue((3>utils.calculate(1,1)));
//        assertFalse((3>utils.calculate(1,1)));
        List<String> list = new ArrayList<>();
        list.add("2");
        assertTrue(list.size()>0);
    }

    @Test
    public void testToNumber_NotNullOrEmpty(){
        Utils utils = new Utils();
       assertNull(utils.toNumber(null));
       assertNull(utils.toNumber(""));
    }
    @Test
    public void testToNumber_hasSpace(){
        Utils utils = new Utils();
        assertEquals(new Integer("123"),utils.toNumber("123"));
        assertEquals(new Integer("123"),utils.toNumber("123 "));
        assertEquals(new Integer("123"),utils.toNumber(" 123 "));
    }
    @Test
    public void testToNumber_hasMiddleSpace(){
        Utils utils = new Utils();
        assertNull(utils.toNumber("12 3"));
        assertNull(utils.toNumber("12a3"));
    }
}