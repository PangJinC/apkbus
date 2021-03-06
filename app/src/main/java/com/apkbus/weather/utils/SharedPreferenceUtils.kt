package com.apkbus.weather.utils

import android.app.Activity
import android.content.SharedPreferences
import com.apkbus.weather.base.MyApplication

/**
 * 获取保存天气的sp
 * key值见{@link com.apkbus.weather.sharedPreference.WeatherSpKey}
 */
fun getWeatherDataSp(): SharedPreferences {
    return MyApplication.INSTANCE.getSharedPreferences("weatherData", Activity.MODE_PRIVATE)
}