package com.example.android.musiclife.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.android.musiclife.R;
import com.example.android.musiclife.model.Song;
import com.example.android.musiclife.service.ApiEndPoint;
import com.example.android.musiclife.service.ApiMusicEndPointService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApiEndPoint apiEnd = ApiMusicEndPointService.getClient().create(ApiEndPoint.class);
        Call<List<Song>> call = apiEnd.getRecentTracks();
        call.enqueue(new Callback<List<Song>>() {
            @Override
            public void onResponse(Call<List<Song>> call, Response<List<Song>> response) {

                List<Song> songs = response.body();

                for(int i = 0 ; i < songs.size() ; i++) {
                    Log.d(TAG, songs.get(i).toString());
                }

            }

            @Override
            public void onFailure(Call<List<Song>> call, Throwable t) {

                Log.e(TAG, t.toString());

            }

            });
    }
}
