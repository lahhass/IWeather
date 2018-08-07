package com.daobao.asus.iweather.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/8/6.
 */
public class WeatherIconSelectorTest {
    private static WeatherIconSelector selector = new WeatherIconSelector();
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void weatherIconName() throws Exception {
        assertEquals("hail", selector.WeatherIconName("304"));
        assertEquals("snow",selector.WeatherIconName("403"));
    }

}