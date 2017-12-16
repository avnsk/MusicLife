package com.example.android.musiclife.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Song {

    @SerializedName("song")
    @Expose
    private String song;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("artists")
    @Expose
    private String artists;
    @SerializedName("cover_image")
    @Expose
    private String coverImage;

    public String getSong() {
        return song;
    }


    public String getUrl() {
        return url;
    }


    public String getArtists() {
        return artists;
    }


    public String getCoverImage() {
        return coverImage;
    }

}
