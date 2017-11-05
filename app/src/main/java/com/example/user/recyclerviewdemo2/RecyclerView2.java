package com.example.user.recyclerviewdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerView2 extends AppCompatActivity {
    RecyclerView recyclerView;
    String[] titlesArray;
    int[] imagesArray={R.drawable.flag1, R.drawable.flag2, R.drawable.flag3, R.drawable.flag4, R.drawable.flag5, R.drawable.flag6, R.drawable.flag7, R.drawable.flag8, R.drawable.flag9, R.drawable.flag9a};

    ArrayList<Information> resoursesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view2);

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView2);
        titlesArray=getResources().getStringArray(R.array.countries);
        resoursesList=new ArrayList<>();
        for (int i=0;i<10;i++){
            resoursesList.add(new Information(titlesArray[i],imagesArray[i]));
        }
        MyCustomAdapter2 adapter=new MyCustomAdapter2(this,resoursesList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
