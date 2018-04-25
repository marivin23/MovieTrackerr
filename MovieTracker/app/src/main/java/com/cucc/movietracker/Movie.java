package com.cucc.movietracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Movie extends AppCompatActivity {

    private String link = "";
    private String title = "";
    private String description = "";
    private String year = "";
    private String rating = "";

    ImageView poster;
    TextView movietitle;
    TextView moviedescription;
    //TextView movieyear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        poster = (ImageView) findViewById(R.id.movieposter);
        movietitle = (TextView) findViewById(R.id.movietitle);
        moviedescription = (TextView) findViewById(R.id.moviedescrption);
       // movieyear = (TextView) findViewById(R.id.movieyear);

        Intent intent = getIntent();
        link = intent.getStringExtra("link");
        title = intent.getStringExtra("title");
        description = intent.getStringExtra("description");
        year = intent.getStringExtra("year");
        rating = intent.getStringExtra("rating");

        Picasso.get()
                .load(link)
                .fit()
                .centerCrop()
                .into(poster);

        movietitle.setText(title);
        moviedescription.setText(description);
        //movieyear.setText( "(" + year + ")");

    }
}
