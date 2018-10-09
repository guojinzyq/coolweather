package com.example.qw.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by qw on 2018/10/9.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
