package com.example.movietracker2;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ImportJSON {

    private List<Movie> movies = new ArrayList<>();

    public void readJSON(String json){
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Movie>>(){}.getType();
        movies = gson.fromJson(json, listType);
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
