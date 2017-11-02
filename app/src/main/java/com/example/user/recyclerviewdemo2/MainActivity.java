package com.example.user.recyclerviewdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

//http://www.vogella.com/tutorials/AndroidRecyclerView/article.html#using-recyclerview
//https://developer.android.com/training/material/lists-cards.html

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView1);
    }
}
