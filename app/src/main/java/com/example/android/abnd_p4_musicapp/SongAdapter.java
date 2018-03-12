package com.example.android.abnd_p4_musicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Efehan on 11.3.2018.
 */

public class SongAdapter extends ArrayAdapter<Song>{

    private Context mContext;
    private List<Song> songList=new ArrayList<>();

    public SongAdapter(@NonNull Context context, ArrayList<Song> list) {
        super(context,0,list);
        mContext = context;
        songList= list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

        Song currentSong = songList.get(position);
        TextView Artist = (TextView) listItem.findViewById(R.id.artist);
        Artist.setText(currentSong.getArtist());
        TextView songName = (TextView) listItem.findViewById(R.id.songName);
        songName.setText(currentSong.getsongName());
        return listItem;
    }
}