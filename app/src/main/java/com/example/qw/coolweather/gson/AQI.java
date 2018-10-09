package com.example.qw.coolweather.gson;

/**
 * Created by qw on 2018/10/9.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
