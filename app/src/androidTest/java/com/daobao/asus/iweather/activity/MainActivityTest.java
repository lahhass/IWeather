package com.daobao.asus.iweather.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.FloatingActionButton;
import android.support.test.filters.MediumTest;
import android.test.ActivityInstrumentationTestCase2;
import android.test.InstrumentationTestCase;

import com.daobao.asus.iweather.R;
import com.daobao.asus.iweather.util.MySharedpreference;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static android.support.v4.content.ContextCompat.startActivity;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/8/6.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;
    SharedPreferences.Editor editor;
    private Intent intent;
    private FloatingActionButton fab;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        setActivityInitialTouchMode(true);
        mainActivity = getActivity();
        intent = new Intent(getInstrumentation().getTargetContext(), MainActivity.class);
        startActivity(getActivity(), intent, null);
        fab = getActivity().findViewById(R.id.fab);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testOnCreate() throws Exception {
        editor = MySharedpreference.getInstance(getActivity());
        assertNotNull("mainActivity is null", mainActivity);
        assertNotNull("editor is null", editor);
    }


}