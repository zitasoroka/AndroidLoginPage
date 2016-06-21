package com.example.zsor0001.login.MainActivityUnitTest;

import android.test.suitebuilder.annotation.SmallTest;

import com.example.zsor0001.login.MainActivity;

import junit.framework.TestCase;

/**
 * Created by zsor0001 on 21/06/2016.
 */

public class MainActivityUnitTest extends TestCase{

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @SmallTest
    public void testchecker(){

        MainActivity ma = new MainActivity();
        boolean result = ma.checker("MOM");
        assertEquals(false, result);

    }


    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
