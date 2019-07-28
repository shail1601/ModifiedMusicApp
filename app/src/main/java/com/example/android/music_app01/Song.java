package com.example.android.music_app01;

public class Song {

    private String mSinger;

    private String mSong;


    public Song(String singer, String song) {
        mSinger = singer;
        mSong = song;
    }

    public String getSinger() {
        return mSinger;
    }

    public String getSong() {
        return mSong;
    }

}
