package com.example.gaurav.openweather.ListViewAdapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Gaurav on 30/09/2015.
 */
public class ItemView extends RelativeLayout {

    private TextView mDayTextView;
    private TextView mTemperatureTextview;
    private TextView mDescriptionTextView;
    private ImageView mImageView;


    public static ItemView inflate(ViewGroup parent){
        ItemView itemView = (ItemView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent,false);
        return itemView;

    }
    public ItemView(Context c) {
        this(c, null);
    }

    public ItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LayoutInflater.from(context).inflate(R.layout.item_view_children, this, true);
        setupChildren();
    }

    private void setupChildren() {
        mDayTextView = (TextView) findViewById(R.id.item_titleTextView);
        mDescriptionTextView = (TextView) findViewById(R.id.item_descriptionTextView);
        mImageView = (ImageView) findViewById(R.id.item_imageView);
        mTemperatureTextview = (ImageView)findViewById(R.id.temperaturetextview);
    }

    public void setItem(Day day) {
        mDayTextView.setText(day.getDay());
        mDescriptionTextView.setText(day.getDescription());

        // TODO: set up image URL
    }

    public ImageView getImageView () {
        return mImageView;
    }

    public TextView getDayTextView() {
        return mDayTextView;
    }

    public TextView getDescriptionTextView() {
        return mDescriptionTextView;
    }

    public TextView getmTemperatureTextview() {
        return mTemperatureTextview;
}



}
