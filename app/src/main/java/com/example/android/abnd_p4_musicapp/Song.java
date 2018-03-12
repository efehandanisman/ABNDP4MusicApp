package com.example.android.abnd_p4_musicapp;

/**
 * Created by Efehan on 11.3.2018.
 */

public class Song {
    private String mArtist;
    private String mSongName;

    public Song(String artist, String songName) {
        mArtist = artist;
        mSongName = songName;

    }

    public String getArtist() {
        return mArtist;
    }
    public String getsongName() {
        return mSongName;
    }
}
