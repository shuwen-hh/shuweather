package com.shuwen.shuweather.api;

import com.shuwen.shuweather.db.City;
import com.shuwen.shuweather.db.County;
import com.shuwen.shuweather.db.Province;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {

    @GET("china")
    Call<List<Province>> queryProvinces();

    @GET("china/{city}")
    Call<List<City>> queryCities(@Path("city") int city);

    @GET("china/{city}/{county}")
    Call<List<County>> queryCounties(@Path("city") int city,
                               @Path("county") int county);


}
