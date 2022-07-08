package com.shuwen.shuweather.db;

import com.google.gson.annotations.SerializedName;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {

    private int id;

    @SerializedName("name")
    private String provinceName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
