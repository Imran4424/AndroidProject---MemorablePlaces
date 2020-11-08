package com.imran.android.memorableplaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> placesName = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        placesName.add("Add a new place...");

        final RecyclerView recyclerView = findViewById(R.id.placeRecyclerView);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        final MemorablePlacesRecyclerAdapter memorablePlacesRecyclerAdapter = new MemorablePlacesRecyclerAdapter(this, placesName);
        recyclerView.setAdapter(memorablePlacesRecyclerAdapter);
    }
}