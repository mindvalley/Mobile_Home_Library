package com.mindvalley.home_library.controller;
import com.mindvalley.home_library.BuildConfig;
import com.mindvalley.home_library.controller.utils.Constants;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import okhttp3.logging.HttpLoggingInterceptor;


/**
 * Created by mindvalley on 12/07/2017.
 */

public class API_Utils {

    public static Retrofit getData() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.ELULA_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(getClient())
                .build();
        return retrofit;
    }

    public static OkHttpClient getClient() {

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.interceptors().add(logging);
        }
        OkHttpClient client = builder.build();

        return client;
    }

}
