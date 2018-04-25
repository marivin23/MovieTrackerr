package com.cucc.movietracker;

import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class FragmentRecyclerAdapter extends RecyclerView.Adapter<FragmentRecyclerAdapter.ViewHolder>{

    private List<String> titles = new ArrayList<>();
    private List<String> descriptions = new ArrayList<>();
    private List<String> images = new ArrayList<>();
    private List<String> dates = new ArrayList<>();

    public FragmentRecyclerAdapter(){

        titles.add("Minions");
        titles.add("Interstellar");
        titles.add("Thor");
        titles.add("Black Panther");

        descriptions.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut.");
        descriptions.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut.");
        descriptions.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut.");
        descriptions.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut.");

        images.add("https://ia.media-imdb.com/images/M/MV5BMTg2MTMyMzU0M15BMl5BanBnXkFtZTgwOTU3ODk4NTE@._V1_UX182_CR0,0,182,268_AL_.jpg");
        images.add("https://ia.media-imdb.com/images/M/MV5BZjdkOTU3MDktN2IxOS00OGEyLWFmMjktY2FiMmZkNWIyODZiXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX182_CR0,0,182,268_AL_.jpg");
        images.add("https://ia.media-imdb.com/images/M/MV5BOGE4NzU1YTAtNzA3Mi00ZTA2LTg2YmYtMDJmMThiMjlkYjg2XkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_UX182_CR0,0,182,268_AL_.jpg");
        images.add("https://ia.media-imdb.com/images/M/MV5BMTg1MTY2MjYzNV5BMl5BanBnXkFtZTgwMTc4NTMwNDI@._V1_UX182_CR0,0,182,268_AL_.jpg");

        dates.add("2015");
        dates.add("2014");
        dates.add("2011");
        dates.add("2018");

    }

    @NonNull
    @Override
    public FragmentRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        Picasso.get()
                .load(images.get(position))
                .fit()
                .centerCrop()
                .into(holder.img);

        holder.text.setText(titles.get(position));
        holder.description.setText(descriptions.get(position));
        holder.releaseDate.setText(dates.get(position));

        holder.itemView.setOnClickListener(new ExternalOnClickListener(titles.get(position), images.get(position), descriptions.get(position), dates.get(position), "8"));

    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView img;
        public TextView text;
        public TextView description;
        public TextView releaseDate;

        public ViewHolder(View itemView) {

            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.poster);
            text = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);
            releaseDate = (TextView) itemView.findViewById(R.id.date);

        }
    }


}
