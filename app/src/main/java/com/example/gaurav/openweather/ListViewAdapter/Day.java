package com.example.gaurav.openweather.ListViewAdapter;

/**
 * Created by Gaurav on 30/09/2015.
 */
public class Day {

    private String mCity;
    private String mTemperature;
    private String mDescription;



    private String mImageUrl;

    public Day(String city, String temperature, String description, String imageUrl) {
        super();
        mCity = city;
        mTemperature = temperature;
        mDescription = description;
        mImageUrl = imageUrl;
    }

    public String getDay() {
        return mCity;
    }

    public void setDay(String day) {
        this.mCity = day;
    }

    public String getTemperature() {
        return mTemperature;
    }

    public void setTemperature(String temperature) {
        this.mTemperature = temperature;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }


    public String getmImageUrl() {
        return mImageUrl;
    }
    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }
}
