package com.imran.android.memorableplaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.location.Address;
import android.os.Bundle;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    static List<String> placesName = new ArrayList<String>();
    static List<LatLng> locations = new ArrayList<LatLng>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (placesName.size() < 1) {
            placesName.add("Add a new place...");
            locations.add(new LatLng(0, 0));
        }

        final RecyclerView recyclerView = findViewById(R.id.placeRecyclerView);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        final MemorablePlacesRecyclerAdapter memorablePlacesRecyclerAdapter = new MemorablePlacesRecyclerAdapter(this, placesName);
        recyclerView.setAdapter(memorablePlacesRecyclerAdapter);
    }

    static void addLocations(String place, LatLng latLng) {
        placesName.add(place);
        locations.add(latLng);
    }
}