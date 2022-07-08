package com.shuwen.shuweather.api;

import com.shuwen.shuweather.db.City;
import com.shuwen.shuweather.db.County;
import com.shuwen.shuweather.db.Province;
import com.shuwen.shuweather.util.ApiUtil;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Retrofit;

public class ApiService {

    ApiUtil apiUtil = ApiUtil.getInstance();

    public void queryProvinces(Callback<List<Province>> callback) {
        Retrofit retrofit = apiUtil.getRetrofit();
        retrofit.create(Api.class).queryProvinces().enqueue(callback);

    }

    public void queryCities(int city, Callback<List<City>> callback) {
        Retrofit retrofit = apiUtil.getRetrofit();
        retrofit.create(Api.class).queryCities(city).enqueue(callback);
    }

    public void queryCounties(int city, int county, Callback<List<County>> callback) {
        Retrofit retrofit = apiUtil.getRetrofit();
        retrofit.create(Api.class).queryCounties(city, county).enqueue(callback);
    }
}
