package com.example.movietracker2;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MovieList{
    private List<Movie> movieList;

    public MovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Double> getPopularityList(){
        List<Double> list=new ArrayList<>();
        for (Movie it: movieList){
            list.add(it.getPopularity());
        }
        return list;
    }

    public List<Double> getRatingList(){
        List<Double> list=new ArrayList<>();
        for (Movie it: movieList){
            list.add(it.getVoteAverage());
        }
        return list;
    }

    public List<String> getReleaseDateList(){
        List<String> list=new ArrayList<>();
        for (Movie it: movieList){
            list.add(it.getReleaseDate());
        }
        return list;
    }

    public List<String> getTitleList(){
        List<String> list=new ArrayList<>();
        for (Movie it: movieList){
            list.add(it.getTitle());
        }
        return list;
    }

    public List<String> getPosterPathList(){
        List<String> list=new ArrayList<>();
        for (Movie it: movieList){
            list.add(it.getPosterPath());
        }
        return list;
    }

    public List<Movie> filterMovies (List<String> genres){
        List<Movie> filteredMovieList=new ArrayList<>();
        for (Movie it: movieList){
            List<String> common=new ArrayList<>(it.getGenre());
            common.retainAll(genres);
            if(common.isEmpty()){
                continue;
            } else {
                filteredMovieList.add(it);
            }
        }
        return filteredMovieList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }
}
