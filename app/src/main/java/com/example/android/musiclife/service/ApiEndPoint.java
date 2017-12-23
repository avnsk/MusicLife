package com.example.android.musiclife.service;

import com.example.android.musiclife.config.Config;
import com.example.android.musiclife.model.Song;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by hunter on 16-Dec-17.
 */

public interface ApiEndPoint {
    @GET("/studio")
    Call<List<Song>> getRecentTracks();
}
