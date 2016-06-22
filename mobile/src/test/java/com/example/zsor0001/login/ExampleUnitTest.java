package com.example.zsor0001.login;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testAddNumber() {
        MainActivity mainActivity = new MainActivity();
        assertEquals(9, mainActivity.addNumbers(6, 3));
    }

    @Test
    public void testChecker () {
        MainActivity myActivity = new MainActivity();
//        String name = "admin";
//        String password = "admjhgjghin";

        assertTrue(myActivity.correctLogin("admin", "admin"));
        assertFalse(myActivity.correctLogin("", ""));

    }

}