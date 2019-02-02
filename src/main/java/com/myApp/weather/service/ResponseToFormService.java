/*MIT License

Copyright (c) 2018 Erwan Le Tutour

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.*/
package com.myApp.weather.service;

import com.myApp.weather.form.Currently;
import com.myApp.weather.form.Daily;
import com.myApp.weather.form.Forecast;
import com.myApp.weather.form.Hourly;
import com.myApp.weather.weatherModel.toparse.ForecastResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ResponseToFormService {

    @Autowired
    private DateService dateService;

    public Forecast darkskyResponseToForm(ForecastResponse responseForecast){

        Forecast f = new Forecast();

        f.setLocation(responseForecast.getLocation());
        f.setCurrently(getResponseDaily(responseForecast.getCurrently()));

        f.setWeekSummary(responseForecast.getDaily().getSummary());
        f.setHourSummary(responseForecast.getHourly().getSummary());
        f.setWeek(getWeekFromAPIResponse(responseForecast.getDaily()));
        f.setHours(getHoursFromApiResponse(responseForecast.getHourly()));

        return f;

    }

    private List<Hourly> getHoursFromApiResponse(com.myApp.weather.weatherModel.toparse.Hourly hourly) {
        List<Hourly> hours = new ArrayList<>();

        for (com.myApp.weather.weatherModel.toparse.HourlyData data:
             hourly.getData()) {
            hours.add(new Hourly()
                .withTime(dateService.dateFromInstant(data.getTime(), "dd/MM/yyyy HH"))
                .withSummary(data.getSummary())
                .withIcon(data.getIcon())
                .withTemperature(Double.toString(data.getTemperature()))
                .withApparentTemperature(Double.toString(data.getApparentTemperature())));
        }
        return hours;
    }


    private Currently getResponseDaily(com.myApp.weather.weatherModel.toparse.Currently responseForecastCurrently) {

        return new Currently()
                .withTime(responseForecastCurrently.getTime())
                .withSummary(responseForecastCurrently.getSummary())
                .withIcon(responseForecastCurrently.getIcon())
                .withTemperature(Double.toString(responseForecastCurrently.getTemperature()))
                .withApparentTemperature(Double.toString(responseForecastCurrently.getApparentTemperature()))
                .withDewPoint(Double.toString(responseForecastCurrently.getDewPoint()))
                .withHumidity(responseForecastCurrently.getHumidity())
                .withPressure(responseForecastCurrently.getPressure())
                .withWindSpeed(responseForecastCurrently.getWindSpeed())
                .withUVIndex((int)responseForecastCurrently.getUvIndex())
                .withVisibility(responseForecastCurrently.getVisibility())
                .withOzone(responseForecastCurrently.getOzone());
    }

    private List<Daily> getWeekFromAPIResponse(com.myApp.weather.weatherModel.toparse.Daily daily) {

        List<Daily> week = new ArrayList<>();

        int id = 0;

        for (com.myApp.weather.weatherModel.toparse.DailyData data: daily.getData()) {
            week.add(new Daily()
            .withId(id)
            .withTime(dateService.dateFromInstant(data.getTime(), "dd/MM/yyyy"))
            .withIcon(data.getIcon())
            .withSummary(data.getSummary())
            .withSunriseTime(dateService.dateFromInstant(data.getSunriseTime(), "HH:mm"))
            .withSunsetTime(dateService.dateFromInstant(data.getSunsetTime(), "HH:mm"))
            .withTemperatureMax(data.getTemperatureMax().toString())
            .withTemperatureMin(data.getTemperatureMin().toString()));

            id = id + 1;
        }

        return week;
    }
}
