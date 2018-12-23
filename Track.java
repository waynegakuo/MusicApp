package com.example.android.musicapp;

public class Track {
    private String mSongName;
    private String mArtistName;
    private int mImageResourceID= NO_IMAGE; //image resource ID for the track
    private static final int NO_IMAGE=-1;

    /**
     *
     * @param songName is the name of the song
     * @param artistName is the name of the artist
     */
    public Track (String songName, String artistName){
        mSongName=songName;
        mArtistName=artistName;
    }

    /**
     *
     * @param songName is the name of the song
     * @param artistName is the name of the artist
     * @param imageResourceID is the drawable resource ID associated with the track
     */
    public Track (String songName, String artistName, int imageResourceID){
        mSongName=songName;
        mArtistName=artistName;
        mImageResourceID=imageResourceID;
    }
    public String getmSongName(){
        return mSongName;
    }
    public String getmArtistName(){
        return mArtistName;
    }
    public int getImageResourceId(){
        return mImageResourceID;
    }

    /**
     *
     * @return whether or not the track has an image or not
     */
    public boolean hasImage(){
        return mImageResourceID!=NO_IMAGE;
    }
}
