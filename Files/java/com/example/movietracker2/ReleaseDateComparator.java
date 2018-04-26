package com.example.movietracker2;

import java.util.Comparator;

public class ReleaseDateComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getReleaseDate().compareTo(o2.getReleaseDate());
    }

}