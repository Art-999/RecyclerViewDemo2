package com.example.user.recyclerviewdemo2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by artur.musayelyan on 02/11/2017.
 */


public class MyCustomAdapter1 extends RecyclerView.Adapter<MyCustomAdapter1.MyViewHolder> {
    LayoutInflater inflater;
    List<Information> dataList = Collections.emptyList();//null point chi qci el
    RecyclerViewOnItemClickListener onItemClickListener;

    public MyCustomAdapter1(Context context, List<Information> data, RecyclerViewOnItemClickListener onItemClickListener) {
        Log.d("Art_Log","MyCustomAdapter1 constructor worked");
        inflater = LayoutInflater.from(context);
        this.dataList = data;
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("Art_Log","onCreateViewHolder method worked");
        View view = inflater.inflate(R.layout.custom_row1, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.d("Art_Log","onBindViewHolder method worked");
        Information currentInformation = dataList.get(position);
        holder.title.setText(currentInformation.title);
        holder.image.setImageResource(currentInformation.iconId);
    }

    @Override
    public int getItemCount() {
        //Log.d("Art_Log","getItemCount method worked");
        return dataList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
        ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);
            Log.d("Art_Log","MyViewHolder constructor worked");
            title = itemView.findViewById(R.id.textView_forCustomAdapter1);
            image = itemView.findViewById(R.id.image_forCustomAdapter1);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            Log.d("Art_Log","onClick method worked");
            onItemClickListener.onItemClick(getAdapterPosition(), v);
        }
    }
}
