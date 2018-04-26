package com.cucc.movietracker;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class ButtonFragment extends android.support.v4.app.Fragment implements View.OnClickListener {

    //button declaration
    Button action;
    Button animation;
    Button adventure;
    Button comedy;
    Button crime;
    Button documentary;
    Button drama;
    Button family;
    Button fantasy;
    Button history;
    Button horror;
    Button music;
    Button mystery;
    Button romance;
    Button scifi;
    Button tvmovie;
    Button thriller;
    Button war;
    Button western;
    ImageButton clear;
    ImageButton search;
    ImageButton sort;

    private static int[] states = new int[19]; //each buttons state
    private static List<String> queryItems = new ArrayList<String>(); //search genres

    public ButtonFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.button_fragment, viewGroup, false);

        for(int i = 0; i < 18; i++){
            states[i] = 0;
        }

        action = (Button) view.findViewById(R.id.action);
        animation = (Button) view.findViewById(R.id.animation);
        adventure = (Button) view.findViewById(R.id.adventure);
        comedy = (Button) view.findViewById(R.id.comedy);
        crime = (Button) view.findViewById(R.id.crime);
        documentary = (Button) view.findViewById(R.id.documentary);
        drama = (Button) view.findViewById(R.id.drama);
        family = (Button) view.findViewById(R.id.family);
        fantasy = (Button) view.findViewById(R.id.fantasy);
        history = (Button) view.findViewById(R.id.history);
        horror = (Button) view.findViewById(R.id.horror);
        music = (Button) view.findViewById(R.id.music);
        mystery = (Button) view.findViewById(R.id.mystery);
        romance = (Button) view.findViewById(R.id.romance);
        scifi = (Button) view.findViewById(R.id.scifi);
        tvmovie = (Button) view.findViewById(R.id.tvmovie);
        thriller = (Button) view.findViewById(R.id.thriller);
        war = (Button) view.findViewById(R.id.war);
        western = (Button) view.findViewById(R.id.western);

        clear = (ImageButton) view.findViewById(R.id.clear);
        search = (ImageButton) view.findViewById(R.id.searchButton);
        sort = (ImageButton) view.findViewById(R.id.sortbutton);

        action.setOnClickListener(this);
        animation.setOnClickListener(this);
        adventure.setOnClickListener(this);
        comedy.setOnClickListener((View.OnClickListener) this);
        crime.setOnClickListener((View.OnClickListener) this);
        documentary.setOnClickListener((View.OnClickListener) this);
        drama.setOnClickListener((View.OnClickListener) this);
        family.setOnClickListener((View.OnClickListener) this);
        fantasy.setOnClickListener((View.OnClickListener) this);
        history.setOnClickListener((View.OnClickListener) this);
        horror.setOnClickListener((View.OnClickListener) this);
        music.setOnClickListener((View.OnClickListener) this);
        mystery.setOnClickListener((View.OnClickListener) this);
        romance.setOnClickListener((View.OnClickListener) this);
        scifi.setOnClickListener((View.OnClickListener) this);
        tvmovie.setOnClickListener((View.OnClickListener) this);
        thriller.setOnClickListener((View.OnClickListener) this);
        war.setOnClickListener((View.OnClickListener) this);
        western.setOnClickListener((View.OnClickListener) this);


        clear.setOnClickListener(this);
        search.setOnClickListener(this);
        sort.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

            switch (v.getId()){

                case R.id.action: {
                    if(states[0] == 0) {
                        action.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("action");
                        Log.i("genre", queryItems.get(0));
                        states[0] = 1;
                    } else {
                        action.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("action");
                        states[0] = 0;
                    }
                    break;
                }
                case R.id.adventure: {
                    if(states[1] == 0) {
                        adventure.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("adventure");
                        states[1] = 1;
                    } else {
                        adventure.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("adventure");
                        states[1] = 0;
                    }
                    break;
                }
                case R.id.animation: {
                    if(states[2] == 0) {
                        animation.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("animation");
                        states[2] = 1;
                    } else {
                        animation.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("animation");
                        states[2] = 0;
                    }
                    break;
                }
                case R.id.comedy: {
                    if(states[3] == 0) {
                        comedy.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("comedy");
                        states[3] = 1;
                    } else {
                        comedy.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("comedy");
                        states[3] = 0;
                    }
                    break;
                }
                case R.id.crime: {
                    if(states[4] == 0) {
                        crime.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("crime");
                        states[4] = 1;
                    } else {
                        crime.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("crime");
                        states[4] = 0;
                    }
                    break;
                }
                case R.id.documentary: {
                    if(states[5] == 0) {
                        documentary.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("documentary");
                        states[5] = 1;
                    } else {
                        documentary.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("documentary");
                        states[5] = 0;
                    }
                    break;
                }
                case R.id.drama: {
                    if(states[6] == 0) {
                        drama.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("drama");
                        states[6] = 1;
                    } else {
                        drama.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("drama");
                        states[6] = 0;
                    }
                    break;
                }
                case R.id.family: {
                    if(states[7] == 0) {
                        family.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("family");
                        states[7] = 1;
                    } else {
                        family.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("family");
                        states[7] = 0;
                    }
                    break;
                }
                case R.id.fantasy: {
                    if(states[8] == 0) {
                        fantasy.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("fantasy");
                        states[8] = 1;
                    } else {
                        fantasy.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("fantasy");
                        states[8] = 0;
                    }
                    break;
                }
                case R.id.history: {
                    if(states[9] == 0){
                        history.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("history");
                        states[9] = 1;
                    } else {
                        history.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("history");
                        states[9] = 0;
                    }
                    break;
                }
                case R.id.horror: {
                    if(states[10] == 0){
                        horror.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("horror");
                        states[10] = 1;
                    } else {
                        horror.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("horror");
                        states[10] = 0;
                    }
                    break;
                }
                case R.id.music: {
                    if(states[11] == 0){
                        music.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("musical");
                        states[11] = 1;
                    } else {
                        music.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("musical");
                        states[11] = 0;
                    }
                    break;
                }
                case R.id.mystery: {
                    if(states[12] == 0){
                        mystery.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("mystery");
                        states[12] = 1;
                    } else {
                        mystery.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("mystery");
                        states[12] = 0;
                    }
                    break;
                }
                case R.id.romance: {
                    if(states[13] == 0){
                        romance.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("romance");
                        states[13] = 1;
                    } else {
                        romance.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("romance");
                        states[13] = 0;
                    }
                    break;
                }
                case R.id.scifi: {
                    if(states[14] == 0){
                        scifi.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("science fiction");
                        states[14] = 1;
                    } else {
                        scifi.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("science fiction");
                        states[14] = 0;
                    }
                    break;
                }
                case R.id.tvmovie: {
                    if(states[15] == 0){
                        tvmovie.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("tv movie");
                        states[15] = 1;
                    } else {
                        tvmovie.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("tv movie");
                        states[15] = 0;
                    }
                    break;
                }
                case R.id.thriller: {
                    if(states[16] == 0){
                        thriller.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("thriller");
                        states[16] = 1;
                    } else {
                        thriller.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("thriller");
                        states[16] = 0;
                    }
                    break;
                }
                case R.id.war: {
                    if(states[17] == 0){
                        war.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("war");
                        states[17] = 1;
                    } else {
                        war.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("war");
                        states[17] = 0;
                    }
                    break;
                }
                case R.id.western: {
                    if(states[18] == 0){
                        western.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                        queryItems.add("western");
                        states[18] = 1;
                    } else {
                        western.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                        queryItems.remove("western");
                        states[18] = 0;
                    }
                    break;
                }
                case R.id.clear: {
                    action.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    animation.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    adventure.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    comedy.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    crime.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    documentary.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    drama.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    family.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    fantasy.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    history.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    horror.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    music.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    mystery.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    romance.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    scifi.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    tvmovie.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    thriller.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    war.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    western.setBackground(getResources().getDrawable(R.drawable.buttonshape));

                    for(int i = 0; i <= 18; i++){
                        states[i] = 0;
                    }

                    break;
                }
                case R.id.searchButton: {

                    Log.i("Search", "Clicked");

                        MainActivity.changeFragment();

                    break;

                }
                case R.id.sortbutton: {



                }
            }

    }

    public static List<String> getQueryItems(){
        return queryItems;
    }

}
