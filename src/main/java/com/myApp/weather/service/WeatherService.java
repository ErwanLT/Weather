package com.myApp.weather.service;

import com.google.gson.Gson;
import com.myApp.weather.utils.ApiUtils;
import com.myApp.weather.weatherModel.toparse.Forecast;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WeatherService {

    @Autowired
    GsonService gsonService;

    public Forecast getForecast(String location){
        Forecast forecast;

        Gson g = new Gson();

        String locationIQResponse = callLocationIQ(location);

        return getForecast(getLatitude(locationIQResponse), getLongitude(locationIQResponse));
    }

    private String getLongitude(String locationIQResponse) {
        JSONArray array = new JSONArray(locationIQResponse);
        JSONObject jsonObject = array.getJSONObject(0);
        return jsonObject.getString("lon");
    }

    private String getLatitude(String locationIQResponse) {
        JSONArray array = new JSONArray(locationIQResponse);
        JSONObject jsonObject = array.getJSONObject(0);
        return jsonObject.getString("lat");
    }

    public Forecast getForecast(String latitude, String longitude) {

        Forecast forecast;

        Gson g = new Gson();


        String darkSkyResponse = callDarkSky(latitude, longitude);

        forecast = gsonService.stringToForecast(darkSkyResponse);

        log.info(darkSkyResponse);

        return forecast;
    }

    private String callDarkSky(String latitude, String longitude) {
        OkHttpClient client = new OkHttpClient();
        try{
            Request request = new Request.Builder()
                    .url(ApiUtils.getDarkSkyUrl(latitude,longitude))
                    .build();

            Response response = client.newCall(request).execute();

            return response.body().string();
        } catch (Exception e){
            log.debug("error : ", e);
        }
        return "";
    }

    private String callLocationIQ(String location){
        OkHttpClient client = new OkHttpClient();
        try{
            Request request = new Request.Builder()
                    .url(ApiUtils.getLocationiqUrl(location))
                    .build();

            Response response = client.newCall(request).execute();

            return response.body().string();
        } catch (Exception e){
            log.debug("error : ", e);
        }
        return "";
    }
}
