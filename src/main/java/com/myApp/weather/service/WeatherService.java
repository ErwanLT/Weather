package com.myApp.weather.service;

import com.google.gson.Gson;
import com.myApp.weather.utils.ApiUtils;
import com.myApp.weather.weatherModel.toparse.ForecastResponse;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WeatherService {

    @Autowired
    GsonService gsonService;

    public ForecastResponse getForecast(String location){
        ForecastResponse forecast;

        Gson g = new Gson();

        String locationIQResponse = callApi(ApiUtils.getLocationiqUrl(location));

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

    public ForecastResponse getForecast(String latitude, String longitude) {

        ForecastResponse forecast;

        Gson g = new Gson();


        String darkSkyResponse = callApi(ApiUtils.getDarkSkyUrl(latitude,longitude));

        forecast = gsonService.stringToForecast(darkSkyResponse);

        log.info(darkSkyResponse);

        return forecast;
    }

    private String callApi(String Uri){
        OkHttpClient client = new OkHttpClient();
        try{
            Request request = new Request.Builder()
                    .url(Uri)
                    .build();

            Response response = client.newCall(request).execute();

            return response.body().string();
        } catch (Exception e){
            log.debug("error : ", e);
        }
        return "";
    }
}
