package com.myApp.weather.service;

import com.google.gson.Gson;
import com.myApp.weather.utils.ApiUtils;
import com.myApp.weather.weatherModel.Forecast;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WeatherService {

    @Autowired
    GsonService gsonService;


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
                    .url(ApiUtils.getUrl(latitude,longitude))
                    .build();

            Response response = client.newCall(request).execute();

            return response.body().string();
        } catch (Exception e){
            log.debug("error : ", e);
        }
        return "";
    }
}
