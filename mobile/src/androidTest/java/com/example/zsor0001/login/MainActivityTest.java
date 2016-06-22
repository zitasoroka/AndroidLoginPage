package com.example.zsor0001.login;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by zsor0001 on 20/06/2016.
 */

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @SmallTest
    public void testedittext(){

        EditText et = (EditText)getActivity().findViewById(R.id.editText);
        assertNotNull(et);
    }

    @SmallTest
    public void testeditbutton(){

        Button bt = (Button)getActivity().findViewById(R.id.button);
        assertNotNull(bt);
    }
}
