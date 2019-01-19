package com.myApp.weather.service;

import com.myApp.weather.form.Currently;
import com.myApp.weather.form.Daily;
import com.myApp.weather.form.Forecast;
import com.myApp.weather.weatherModel.toparse.ForecastResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ResponseToFormService {

    public Forecast darkskyResponseToForm(ForecastResponse responseForecast){

        Forecast f = new Forecast();

        f.setCurrently(getResponseDaily(responseForecast.getCurrently()));

        f.setWeek(getWeekFromAPIResponse(responseForecast.getDaily()));

        return f;

    }


    private Currently getResponseDaily(com.myApp.weather.weatherModel.toparse.Currently responseForecastCurrently) {

        return new Currently()
                .withTime(responseForecastCurrently.getTime())
                .withSummary(responseForecastCurrently.getSummary())
                .withIcon(responseForecastCurrently.getIcon())
                .withTemperature(responseForecastCurrently.getTemperature())
                .withApparentTemperature(responseForecastCurrently.getApparentTemperature())
                .withDewPoint(responseForecastCurrently.getDewPoint())
                .withHumidity(responseForecastCurrently.getHumidity())
                .withPressure(responseForecastCurrently.getPressure())
                .withWindSpeed(responseForecastCurrently.getWindSpeed())
                .withUVIndex(responseForecastCurrently.getUvIndex())
                .withVisibility(responseForecastCurrently.getVisibility())
                .withOzone(responseForecastCurrently.getOzone());
    }

    private List<Daily> getWeekFromAPIResponse(com.myApp.weather.weatherModel.toparse.Daily daily) {

        List<Daily> week = new ArrayList<>();

        for (com.myApp.weather.weatherModel.toparse.DailyData data: daily.getData()) {
            week.add(new Daily()
            .withTime(data.getTime())
            .withIcon(data.getIcon())
            .withSummary(data.getSummary())
            .withSunriseTime(data.getSunriseTime())
            .withSunsetTime(data.getSunsetTime())
            .withTemperatureMax(data.getTemperatureMax())
            .withTemperatureMin(data.getTemperatureMin()));
        }

        return week;
    }
}
