package com.example.movietracker2;

import java.util.Comparator;

public class PopularityComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return Double.compare(o1.getPopularity(), o2.getPopularity());
    }

}
