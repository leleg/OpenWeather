package com.example.gaurav.openweather.ListViewAdapter;

import android.content.Context;
import android.support.v7.internal.view.menu.MenuView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;
import com.example.gaurav.openweather.ListViewAdapter.ItemView;

/**
 * Created by Gaurav on 30/09/2015.
 */
public class DayAdapter extends ArrayAdapter<Day> {

    public DayAdapter(Context c, List<Day> items) {
        super(c, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MenuView.ItemView itemView = (MenuView.ItemView)convertView;
        if (null == itemView)
            itemView = MenuView.ItemView.inflate(parent);
        itemView.setItem(getItem(position));
        return itemView;
    }

}

}
