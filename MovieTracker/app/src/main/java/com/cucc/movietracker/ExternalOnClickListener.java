package com.cucc.movietracker;

import android.content.Intent;
import android.util.Log;
import android.view.View;

public class ExternalOnClickListener implements View.OnClickListener {

    private String title = "";
    private String posterLink = "";
    private String description = "";
    private String releaseYear = "";
    private String rating = "";

    public ExternalOnClickListener(String title, String posterLink, String description, String releaseYear, String rating){

        this.title = title;
        this.posterLink = posterLink;
        this.description = description;
        this.releaseYear = releaseYear;
        this.rating = rating;

    }

    @Override
    public void onClick(View v) {

        Log.i("Movie Pressed", ""+ title );

        Intent intent = new Intent(v.getContext(), Movie.class);
        intent.putExtra("link", posterLink);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        intent.putExtra("year", releaseYear);
        intent.putExtra("rating", rating);

        v.getContext().startActivity(intent);

    }
}
