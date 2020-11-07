package com.imran.android.memorableplaces;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created by Shah Md Imran Hossain on 07, November, 2020
 */
public class MemorablePlacesRecyclerAdapter extends RecyclerView.Adapter<MemorablePlacesRecyclerAdapter.ViewHolder> {
    private final Context context;
    private final LayoutInflater layoutInflater;
    private final List<String> memorablePlaces;

    public MemorablePlacesRecyclerAdapter(Context context, List<String> memorablePlaces) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        this.memorablePlaces = memorablePlaces;
    }
    
    @NonNull
    @Override
    public MemorablePlacesRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MemorablePlacesRecyclerAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
