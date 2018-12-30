package com.simple.gradle;


import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


public class MainActivityTest extends ActivityInstrumentationTestCase2 {

    private Solo solo;
    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testcase001() throws Exception{
        solo.clickOnButton("tips");
        solo.sleep(3000);
    }

    public void testStartClose() throws Exception {
        Thread.sleep(1000);
    }
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
