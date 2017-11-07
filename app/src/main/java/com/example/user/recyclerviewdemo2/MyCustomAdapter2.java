package com.example.user.recyclerviewdemo2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by USER on 05.11.2017.
 */

public class MyCustomAdapter2 extends RecyclerView.Adapter<MyCustomAdapter2.MyViewHolder> {
    List<Information> dataList = Collections.emptyList();
    Context context;
    LayoutInflater inflater;


    public MyCustomAdapter2(Context context, List<Information> list) {
        this.context = context;
        this.dataList = list;
        //inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater = LayoutInflater.from(context);

    }

    public void delete(int position){
        dataList.remove(position);
        notifyItemRemoved(position);
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_row1, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder,int position) {
        Information currentInformation = dataList.get(position);
        holder.titlesTextView.setText(currentInformation.title);
        holder.flagsImageView.setImageResource(currentInformation.iconId);

//        //1-in tarberak
//        holder.flagsImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context,"Item clicked at "+position,Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView titlesTextView;
        ImageView flagsImageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            titlesTextView = itemView.findViewById(R.id.textView_forCustomAdapter1);
            flagsImageView = itemView.findViewById(R.id.image_forCustomAdapter1);

            itemView.setOnClickListener(this);
        }


        //2-rd tarberak
        @Override
        public void onClick(View v) {
            //Toast.makeText(context,"Item clicked at "+getAdapterPosition(),Toast.LENGTH_SHORT).show();
            delete(getAdapterPosition());
        }
    }



}
