package com.imran.android.memorableplaces;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        View itemView = layoutInflater.inflate(R.layout.item_memorable_places, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MemorablePlacesRecyclerAdapter.ViewHolder holder, int position) {
        holder.placeName.setText(memorablePlaces.get(position));
        holder.position = position;
    }

    @Override
    public int getItemCount() {
        return memorablePlaces.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView placeName;
        public int position;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            placeName = itemView.findViewById(R.id.textViewPlaces);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mapIntent = new Intent(context, MapsActivity.class);
                    MapsActivity.position = position;

                    context.startActivity(mapIntent);
                }
            });
        }
    }
}
