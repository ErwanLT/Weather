/*-
 * ========================LICENSE_START=================================
 * EWeather
 * ======================================================================
 * Copyright (C) 2018 - 2019 Erwan Le Tutour
 * ======================================================================
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * =========================LICENSE_END==================================
 */
package com.myApp.weather.service;

import com.myApp.weather.utils.FakeForecastUtils;
import com.myApp.weather.weatherModel.toparse.ForecastResponse;
import com.myApp.weather.weatherModel.toparse.LocationData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WeatherService {

    private final GsonService gsonService;

    private final DarkSkyService darkSkyService;

    private final LocationIQService locationIQService;

    @Autowired
    public WeatherService(GsonService gsonService, DarkSkyService darkSkyService, LocationIQService locationIQService){
        this.gsonService = gsonService;
        this.darkSkyService = darkSkyService;
        this.locationIQService = locationIQService;
    }

    public ForecastResponse getForecast(String location){

        if(location.isEmpty()){
            //ne devrait jamais arriver car champs obligatoire
            return getFakeForecast();
        } else {
            String locationIQResponse = locationIQService.callApi(location);
            log.info(locationIQResponse);

            if(locationIQResponse.isEmpty()){
                log.debug("offline mode activate");
                return getFakeForecast();
            } else {
                LocationData[] ld = gsonService.stringToLocations(locationIQResponse);
                LocationData l = ld[0];
                return getForecast(l.getLat(), l.getLon(), l.getDisplayName());
            }
        }
    }

    private ForecastResponse getFakeForecast() {
        ForecastResponse forecastResponse = gsonService.stringToForecast(FakeForecastUtils.fakeDarkSkyResponse);
        forecastResponse.setLocation("Fake forecast");

        return forecastResponse;
    }


    public ForecastResponse getForecast(String latitude, String longitude, String location) {

        ForecastResponse forecast;

        String darkSkyResponse = darkSkyService.callApi(latitude, longitude);
        log.info(darkSkyResponse);

        forecast = gsonService.stringToForecast(darkSkyResponse);
        forecast.setLocation(location);

        return forecast;
    }

}
