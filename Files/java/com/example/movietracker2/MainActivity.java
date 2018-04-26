package com.example.movietracker2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    protected String json=null;
    protected  ImportJSON importJSON = new ImportJSON();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        try {
            InputStream is = this.getAssets().open("MoviesJSON.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");

        } catch (IOException e) {
            e.printStackTrace();
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        importJSON.readJSON(json);

        MovieList allMovies = new MovieList(importJSON.getMovies());
        //List<String> list=allMovies.getPosterPathList();
        List<String> genres= new ArrayList<>();
        genres.add("horror");
        genres.add("comedy");


        List<Movie> filteredMovies=allMovies.filterMovies(genres);

        for (Movie it: filteredMovies){
            Log.v("ListTest", it.getTitle());
        }

        /*PopupFragment popupFragment = new PopupFragment();

        getFragmentManager().beginTransaction()
                .replace(R.id.container, popupFragment).commit();*/
    }

}
