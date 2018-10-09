package com.example.qw.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by qw on 2018/10/9.
 */

public class Basic {
    @SerializedName("city")
    public  String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
