package com.myApp.weather.service;

import com.myApp.weather.utils.ApiUtils;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DarkSkyService {

    public String callApi(String latitude, String longitude) {
        String darkSkyUrl = ApiUtils.getDarkSkyUrl(latitude,longitude);

        OkHttpClient client = new OkHttpClient();
        try{
            Request request = new Request.Builder()
                    .url(darkSkyUrl)
                    .build();

            Response response = client.newCall(request).execute();

            return response.body().string();
        } catch (Exception e){
            log.debug("error : ", e);
        }
        return "";
    }
}
