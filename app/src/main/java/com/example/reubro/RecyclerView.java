package com.example.reubro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import static com.example.reubro.R.id.recyclerView;

public class RecyclerView extends AppCompatActivity {

    android.support.v7.widget.RecyclerView recyclerView;
    String s1[], s2[];
    int images[] = {R.drawable.bmw, R.drawable.ferrari, R.drawable.fiat, R.drawable.fod, R.drawable.honda, R.drawable.hyu, R.drawable.maruti, R.drawable.maserati,
            R.drawable.reno, R.drawable.toyota};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.cars);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
