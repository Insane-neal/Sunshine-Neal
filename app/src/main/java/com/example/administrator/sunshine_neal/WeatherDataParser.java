package com.example.administrator.sunshine_neal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by wu111 on 2/22/2016.
 */
public class WeatherDataParser {
    /**
     * Given a string of the form returned by the api call:
     * http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7
     * retrieve the maximum temperature for the day indicated by dayIndex
     * (Note: 0-indexed, so 0 would refer to the first day).
     */
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        JSONObject weather = new JSONObject(weatherJsonStr);
        JSONArray weatherList = weather.getJSONArray("list");
        JSONObject weatherDay = weatherList.getJSONObject(dayIndex);
        JSONObject temp = weatherDay.getJSONObject("temp");
    // TODO: add parsing code here
        return temp.getDouble("max");
        }
}
