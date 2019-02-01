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
    private GsonService gsonService;

    public ForecastResponse getForecast(String location){

        String locationIQResponse = callApi(ApiUtils.getLocationiqUrl(location));
        log.info(locationIQResponse);

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

        String darkSkyResponse = callApi(ApiUtils.getDarkSkyUrl(latitude,longitude));
        log.info(darkSkyResponse);

        forecast = gsonService.stringToForecast(darkSkyResponse);

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
