package com.myApp.weather.utils;

public class ApiUtils {

    //TODO when pulling this file, change the key with yours, this is old mine since i have change it after commiting this file
    private static final String DARK_SKY_KEY = "06de353f501dd8a6fcc80ec0057bdc03";

    private static final String DARK_SKY_URL = "https://api.darksky.net/forecast/";

    private static final String DARK_SKY_SI_UNIT = "?unit=SI";

    private static final String DARK_SKY_EXCLUDE = "&exclude=minutely,hourly";

    public static String getUrl(String latitude, String longitude){

        return DARK_SKY_URL + DARK_SKY_KEY + "/" + latitude + "," + longitude + DARK_SKY_SI_UNIT + DARK_SKY_EXCLUDE;
    }
}
