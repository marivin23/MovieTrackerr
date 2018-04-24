package com.cucc.movietracker;

import android.provider.ContactsContract;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private Toolbar mToolbar;
    public RecyclerView rv;

    private static int[] states = new int[19];
    private List<String> queryItems = new ArrayList<String>();

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();*/

        mToolbar = (Toolbar) findViewById(R.id.navbar);
        setSupportActionBar(mToolbar);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.OpenD, R.string.CloseD);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        DrawerAdapter adapter = new DrawerAdapter(this);
        ListView lv = (ListView) findViewById(R.id.drawer_list);
        lv.setAdapter(adapter);

        /*ButtonFragment fragment = new ButtonFragment();
        ft.replace(R.id.frag_container, fragment);
        ft.addToBackStack(null);
        ft.commit();*/


        for(int i = 0; i < 18; i++){
            states[i] = 0;
        }

        action = (Button) findViewById(R.id.action);
        animation = (Button) findViewById(R.id.animation);
        adventure = (Button) findViewById(R.id.adventure);
        comedy = (Button) findViewById(R.id.comedy);
        crime = (Button) findViewById(R.id.crime);
        documentary = (Button) findViewById(R.id.documentary);
        drama = (Button) findViewById(R.id.drama);
        family = (Button) findViewById(R.id.family);
        fantasy = (Button) findViewById(R.id.fantasy);
        history = (Button) findViewById(R.id.history);
        horror = (Button) findViewById(R.id.horror);
        music = (Button) findViewById(R.id.music);
        mystery = (Button) findViewById(R.id.mystery);
        romance = (Button) findViewById(R.id.romance);
        scifi = (Button) findViewById(R.id.scifi);
        tvmovie = (Button) findViewById(R.id.tvmovie);
        thriller = (Button) findViewById(R.id.thriller);
        war = (Button) findViewById(R.id.war);
        western = (Button) findViewById(R.id.western);

        clear = (ImageButton) findViewById(R.id.clear);
        search = (ImageButton) findViewById(R.id.searchButton);

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

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v){

        //Log.i("click",  ""+v.getId());

        switch (v.getId()){

            case R.id.action: {
                if(states[0] == 0) {
                    action.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    queryItems.add("action");
                    Log.i("genre", queryItems.get(0));
                    states[0] = 1;
                } else {
                    action.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[0] = 0;
                }
                break;
            }
            case R.id.adventure: {
                if(states[1] == 0) {
                    adventure.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[1] = 1;
                } else {
                    adventure.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[1] = 0;
                }
                break;
            }
            case R.id.animation: {
                if(states[2] == 0) {
                    animation.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[2] = 1;
                } else {
                    animation.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[2] = 0;
                }
                break;
            }
            case R.id.comedy: {
                if(states[3] == 0) {
                    comedy.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[3] = 1;
                } else {
                    comedy.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[3] = 0;
                }
                break;
            }
            case R.id.crime: {
                if(states[4] == 0) {
                    crime.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[4] = 1;
                } else {
                    crime.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[4] = 0;
                }
                break;
            }
            case R.id.documentary: {
                if(states[5] == 0) {
                    documentary.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[5] = 1;
                } else {
                    documentary.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[5] = 0;
                }
                break;
            }
            case R.id.drama: {
                if(states[6] == 0) {
                    drama.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[6] = 1;
                } else {
                    drama.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[6] = 0;
                }
                break;
            }
            case R.id.family: {
                if(states[7] == 0) {
                    family.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[7] = 1;
                } else {
                    family.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[7] = 0;
                }
                break;
            }
            case R.id.fantasy: {
                if(states[8] == 0) {
                    fantasy.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[8] = 1;
                } else {
                    fantasy.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[8] = 0;
                }
                break;
            }
            case R.id.history: {
                if(states[9] == 0){
                    history.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[9] = 1;
                } else {
                    history.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[9] = 0;
                }
                break;
            }
            case R.id.horror: {
                if(states[10] == 0){
                    horror.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[10] = 1;
                } else {
                    horror.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[10] = 0;
                }
                break;
            }
            case R.id.music: {
                if(states[11] == 0){
                    music.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[11] = 1;
                } else {
                    music.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[11] = 0;
                }
                break;
            }
            case R.id.mystery: {
                if(states[12] == 0){
                    mystery.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[12] = 1;
                } else {
                    mystery.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[12] = 0;
                }
                break;
            }
            case R.id.romance: {
                if(states[13] == 0){
                    romance.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[13] = 1;
                } else {
                    romance.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[13] = 0;
                }
                break;
            }
            case R.id.scifi: {
                if(states[14] == 0){
                    scifi.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[14] = 1;
                } else {
                    scifi.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[14] = 0;
                }
                break;
            }
            case R.id.tvmovie: {
                if(states[15] == 0){
                    tvmovie.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[15] = 1;
                } else {
                    tvmovie.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[15] = 0;
                }
                break;
            }
            case R.id.thriller: {
                if(states[16] == 0){
                    thriller.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[16] = 1;
                } else {
                    thriller.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[16] = 0;
                }
                break;
            }
            case R.id.war: {
                if(states[17] == 0){
                    war.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[17] = 1;
                } else {
                    war.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    states[17] = 0;
                }
                break;
            }
            case R.id.western: {
                if(states[18] == 0){
                    western.setBackground(getResources().getDrawable(R.drawable.buttonshapefocused));
                    states[18] = 1;
                } else {
                    western.setBackground(getResources().getDrawable(R.drawable.buttonshape));
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

                LinearLayout lm = (LinearLayout) findViewById(R.id.linearid);
                lm.setVisibility(LinearLayout.GONE);

                Log.i("Search", "Clicked");
                Fragment newSearch = new Fragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_cont, newSearch); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
                transaction.commit();
                break;

            }
        }


}

}
