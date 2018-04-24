package com.cucc.movietracker;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment extends android.support.v4.app.Fragment {

    public RecyclerView rv;
    private Context c;

    public Fragment(){ }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){

        /*View root = inflater.inflate(R.layout.search_fragment, viewGroup, false);

        rv = (RecyclerView) root.findViewById(R.id.recycle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(c);
        rv.setLayoutManager(linearLayoutManager);
        rv.setAdapter(new FragmentRecyclerAdapter());*/

        View root = inflater.inflate(R.layout.fragment_item_view, viewGroup, false);

        return root;
    }


    public void getInstance(Context c){
        this.c = c;
    }

}
