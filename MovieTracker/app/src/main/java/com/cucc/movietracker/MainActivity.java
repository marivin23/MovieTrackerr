package com.cucc.movietracker;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;

import android.widget.ListView;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private Toolbar mToolbar;
    public RecyclerView rv;

    private static FragmentManager fManager = null;
    private static FragmentTransaction fTransaction;
    private ButtonFragment buttons = null;
    private static SearchFragment search = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        if( fManager == null ){
            fManager = getSupportFragmentManager();
        }

        if( fManager.findFragmentById(R.id.header) == null ){

            buttons = new ButtonFragment();
            fTransaction = fManager.beginTransaction();
            fTransaction.replace(R.id.header, buttons).commit();

        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static void changeFragment(){

        search = new SearchFragment();
        fTransaction = fManager.beginTransaction();
        fTransaction.replace(R.id.header, search);
        fTransaction.addToBackStack(null);
        fTransaction.commit();

    }

}
