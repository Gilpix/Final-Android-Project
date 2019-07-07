package com.padda.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class RegulatoryCustomAdapter extends BaseAdapter {
    Context context;
    String name[];
    int signsImage[];
    LayoutInflater inflter;

    public RegulatoryCustomAdapter(Context applicationContext, String[] name, int[] signsImage) {
        this.context = context;
        this.name = name;
        this.signsImage = signsImage;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.reugulatory_list_view, null);
        TextView country = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        country.setText(name[i]);
        icon.setImageResource(signsImage[i]);
        return view;
    }
}