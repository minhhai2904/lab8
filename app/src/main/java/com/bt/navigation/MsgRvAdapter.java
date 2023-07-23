package com.bt.navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MsgRvAdapter extends RecyclerView.Adapter<MsgRvAdapter.MyHolder>{

    ArrayList<MsgItemRVClass> data;

    public MsgRvAdapter(ArrayList<MsgItemRVClass> data) {
        this.data = data;
    }

    class  MyHolder extends RecyclerView.ViewHolder{
        ImageView img ;
        TextView mess, name,date;

        public  MyHolder (View view){
            super(view);

            img = view.findViewById(R.id.mes_img);
            mess = view.findViewById(R.id.msg_mess);
            name = view.findViewById(R.id.msg_name);
            date = view.findViewById(R.id.msg_date);

        }
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_msg,parent,false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.img.setImageResource(data.get(position).getImg());
        holder.mess.setText(data.get(position).getMess());
        holder.name.setText(data.get(position).getName());
        holder.date.setText(data.get(position).getDate());

    }


    @Override
    public int getItemCount() {
        return data.size();
    }
}
