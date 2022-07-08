package com.shuwen.shuweather.db;

import com.google.gson.annotations.SerializedName;

import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {

    private int id;

    @SerializedName("name")
    private String cityName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
