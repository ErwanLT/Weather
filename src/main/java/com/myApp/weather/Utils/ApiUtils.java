package com.myApp.weather.utils;

public class ApiUtils {

    //TODO when pulling this file, change the key with yours, this is old mine since i have change it after commiting this file
    private static final String DARK_SKY_KEY = "";

    private static final String DARK_SKY_URL = "https://api.darksky.net/forecast/";

    private static final String DARK_SKY_SI_UNIT = "&unit=auto";

    private static final String DARK_SKY_LANG = "?lang=fr";

    private static final String DARK_SKY_EXCLUDE = "&exclude=minutely,hourly";

    private static final String LOCATIONIQ_KEY = "";

    private static final String LOCATIONIQ_URL1 = "https://eu1.locationiq.com/v1/search.php?key=";

    private static final String LOCATIONIQ_URL2 = "&format=json";

    public static String getDarkSkyUrl(String latitude, String longitude){

        return DARK_SKY_URL + DARK_SKY_KEY + "/" + latitude + "," + longitude + DARK_SKY_LANG + DARK_SKY_EXCLUDE;
    }

    public static String getLocationiqUrl(String location){
        return LOCATIONIQ_URL1 + LOCATIONIQ_KEY + "&q=" + location + LOCATIONIQ_URL2;
    }
}
