package com.example.movietracker2;

import android.app.DialogFragment;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PopupFragment extends Fragment{
    protected List<Movie> movies = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState, List<Movie> movieList) {
        View rootView = inflater.inflate(R.layout.popup, container, false);

        final Button buttonOk = (Button) rootView.findViewById(R.id.buttonOk);
        final RadioButton radioButtonPopularity = (RadioButton) rootView.findViewById(R.id.radioButton1);
        final RadioButton radioButtonRating = (RadioButton) rootView.findViewById(R.id.radioButton2);
        final RadioButton radioButtonDate = (RadioButton) rootView.findViewById(R.id.radioButton3);
        final RadioButton radioButtonTitle = (RadioButton) rootView.findViewById(R.id.radioButton4);
        final Switch sortingSwitch = (Switch) rootView.findViewById(R.id.switch1);

        movies = movieList;

        buttonOk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (radioButtonPopularity.isChecked()) {
                    Collections.sort(movies, new PopularityComparator());
                }

                if (radioButtonRating.isChecked()) {
                    Collections.sort(movies, new RatingComparator());
                }

                if (radioButtonDate.isChecked()) {
                    Collections.sort(movies, new ReleaseDateComparator());
                }

                if (radioButtonTitle.isChecked()) {
                    Collections.sort(movies, new TitleComparator());
                }

                if (sortingSwitch.isChecked()){
                    Collections.reverse(movies);
                }
            }
        });

        return rootView;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
