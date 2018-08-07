package com.daobao.asus.iweather;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import com.daobao.asus.iweather.activity.MainActivityTest;
import com.daobao.asus.iweather.util.MultiWeatherBgSelectorTest;
import com.daobao.asus.iweather.util.WeatherIconSelectorTest;

/**
 * Created by Administrator on 2018/8/7.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({MainActivityTest.class,MultiWeatherBgSelectorTest.class,WeatherIconSelectorTest.class})
public class SuiteTest  {
}
