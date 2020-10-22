package com.example.baitaptuan9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MusicAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Music> musicList;

    public MusicAdapter(Context context, int layout, List<Music> musicList) {
        this.context = context;
        this.layout = layout;
        this.musicList = musicList;
    }

    @Override
    public int getCount() {
        return musicList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        ImageView imageView;
        TextView txtten, txtmota;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();

            holder.txtten = (TextView) view.findViewById(R.id.tenbh);
            holder.txtmota = (TextView) view.findViewById(R.id.motabh);
            holder.imageView = (ImageView) view.findViewById(R.id.imagehinh);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        Music music = musicList.get(i);

        holder.txtten.setText(music.getTenbh());
        holder.txtmota.setText(music.getMota());
        holder.imageView.setImageResource(music.getHinh());
        return view;
    }
}

