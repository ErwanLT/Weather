package com.myApp.weather.service;

import com.google.gson.Gson;
import com.myApp.weather.weatherModel.toparse.ForecastResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GsonService {

    public ForecastResponse stringToForecast(String darkSkyResponse){
        Gson g = new Gson();

        return g.fromJson(darkSkyResponse, ForecastResponse.class);

    }
}
