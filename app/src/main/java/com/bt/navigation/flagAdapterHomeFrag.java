package com.bt.navigation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class flagAdapterHomeFrag  extends ArrayAdapter {
    Context context;
    ArrayList<flagHomeFrag> arrayList;
    int layout;
    public flagAdapterHomeFrag(@NonNull View view, int resource, @NonNull
    ArrayList<flagHomeFrag> objects) {
        super(view.getContext(), resource, objects);
        this.context =  view.getContext();
        this.arrayList = objects;
        this.layout = resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull
    ViewGroup parent) {
        flagHomeFrag flag = arrayList.get(position);
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(layout,null);
        }
        ImageView img = convertView.findViewById(R.id.imageFlag);
        img.setImageResource(flag.getId());
        TextView txt = convertView.findViewById(R.id.flagName);
        txt.setText(flag.getName());
        return convertView;
    }

}
