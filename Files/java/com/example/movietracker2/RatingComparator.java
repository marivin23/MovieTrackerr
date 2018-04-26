package com.example.movietracker2;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return Double.compare(o1.getVoteAverage(), o2.getVoteAverage());
    }

}