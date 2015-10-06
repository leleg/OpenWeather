package com.example.gaurav.openweather.Weather;

import android.content.Context;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Gaurav on 31/08/2015.
 */
public class HTTPFetch {

    private static final String OPEN_WEATHER_LIST_API = "http://api.openweathermap.org/data/2.5/forecast/daily?q=%s&cnt=14&APPID=61ff8b66bf16e8074e26d410fdf60e78&mode= json";

    public static JSONObject getJSON(Context context, String city) {
        try {
            URL url = new URL(String.format(OPEN_WEATHER_LIST_API, city));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.addRequestProperty("x-api-key", context.getString(R.string.open_weather_list_api));
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuffer json = new StringBuffer(1024);

            String tmp = "";

            while ((tmp = br.readLine()) != null) {
                json.append(tmp).append("\n");
                br.close();
            }

            JSONObject data = new JSONObject((json.toString()));

            if (data.getInt("cod") != 200) {
                return null;
            }

            return data;
        } catch (Exception e) {
            return null;
        }
    }
}
