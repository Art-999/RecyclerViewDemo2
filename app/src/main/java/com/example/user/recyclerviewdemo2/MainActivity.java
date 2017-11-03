package com.example.user.recyclerviewdemo2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//http://www.vogella.com/tutorials/AndroidRecyclerView/article.html#using-recyclerview
//https://developer.android.com/training/material/lists-cards.html

public class MainActivity extends AppCompatActivity implements RecyclerViewOnItemClickListener {
    RecyclerView recyclerView;
    MyCustomAdapter1 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);
        // adapter = new MyCustomAdapter1(this, getData(this));


        // Resources resources=getResources();
        List<Information> data = new ArrayList<>();
        int[] images = {R.drawable.meme1, R.drawable.meme2, R.drawable.meme3, R.drawable.meme4, R.drawable.meme5, R.drawable.meme6, R.drawable.meme7};
        String[] titles = getResources().getStringArray(R.array.titles);
        for (int i = 0; i < titles.length && i < images.length; i++) {
            Information currentInformation = new Information();
            currentInformation.iconId = images[i];
            currentInformation.title = titles[i];
            data.add(currentInformation);
        }

        adapter = new MyCustomAdapter1(this, data, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // recyclerView.setLayoutManager(new GridLayoutManager(this,GridLayoutManager.DEFAULT_SPAN_COUNT));
        //recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL));
    }

    private void setA(String a){

    }

    @Override
    public void onItemClick(int position, View view) {
        Toast.makeText(this, "position " + position, Toast.LENGTH_SHORT).show();

        int resId = view.getId();

        if (resId == R.id.image_forCustomAdapter1){

        }
    }

//    public static List<Information> getData(Context context) {
//        List<Information> data = new ArrayList<>();
//        int[] images = {R.drawable.meme1, R.drawable.meme2, R.drawable.meme3, R.drawable.meme4, R.drawable.meme5, R.drawable.meme6, R.drawable.meme7};
//        String[] titles = context.getResources().getStringArray(R.array.titles);
//        for (int i = 0; i < titles.length && i < images.length; i++) {
//            Information currentInformation = new Information();
//            currentInformation.iconId = images[i];
//            currentInformation.title = titles[i];
//            data.add(currentInformation);
//        }
//        return data;
//    }
}
