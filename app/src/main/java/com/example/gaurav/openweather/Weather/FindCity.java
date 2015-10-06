package com.example.gaurav.openweather.Weather;

import android.app.Activity;

import android.content.SharedPreferences;

public class FindCity {
    SharedPreferences preferences;


    public FindCity(Activity activity) {
        preferences = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    public String getCity() {
        return preferences.getString("city", "Pune,IN");

    }

    void setCity(String city) {
        preferences.edit().putString("city", city).commit();
    }


}



