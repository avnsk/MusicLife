package com.example.android.musiclife.service;

import com.example.android.musiclife.config.Config;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by hunter on 16-Dec-17.
 */

public class ApiMusicEndPointService {

    private volatile static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if(retrofit == null) {
            synchronized (ApiMusicEndPointService.class) {
                if(retrofit == null) {
                    retrofit = new Retrofit.Builder()
                            .baseUrl(Config.API_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                }
            }
        }

        return  retrofit;
    }

}
