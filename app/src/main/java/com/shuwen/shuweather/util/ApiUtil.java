package com.shuwen.shuweather.util;

import android.util.Log;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtil {

    private static ApiUtil apiUtilInstance = null;

    private String BASE_URL = "http://www.guolin.tech/api/";

    public static synchronized ApiUtil getInstance() {
        if (apiUtilInstance == null) {
            apiUtilInstance = new ApiUtil();
        }
        return apiUtilInstance;
    }

    private Retrofit retrofitInit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

    private OkHttpClient okhttpClientInit() {
        Interceptor interceptor = new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                String url = request.url().toString();
                String logStr = url;
                Log.d("Constant",  " request url: " + logStr);
                return chain.proceed(request);
            }
        };
        return new OkHttpClient().newBuilder().addInterceptor(interceptor).build();
    }

    public Retrofit getRetrofit() {
        return retrofitInit(okhttpClientInit());
    }


}