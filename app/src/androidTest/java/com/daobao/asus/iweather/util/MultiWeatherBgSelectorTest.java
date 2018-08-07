package com.daobao.asus.iweather.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/8/6.
 */
public class MultiWeatherBgSelectorTest {

    private static MultiWeatherBgSelector selector = new MultiWeatherBgSelector();
    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void multiWeatherBgName() throws Exception {
        assertEquals("overcast_bg", selector.MultiWeatherBgName("210"));
        assertEquals("thundershower_bg", selector.MultiWeatherBgName("302"));
    }

}