package com.cucc.movietracker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import static com.cucc.movietracker.R.*;

public class DrawerAdapter extends BaseAdapter {

    private String[] textViews;
    private Context context;

    public DrawerAdapter(Context c){

        this.context = c;
        textViews = c.getResources().getStringArray(array.MenuOptions);

    }

    @Override
    public int getCount() {
        return textViews.length;
    }

    @Override
    public Object getItem(int position) {
        return textViews[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ResourceType")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = null;

        if( convertView == null ) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout.custom_drawer_row, parent, false);

        } else {

            row = convertView;

        }

        TextView tv = (TextView) row.findViewById(id.textView1);
        tv.setText(textViews[position]);

        return row;
    }
}
