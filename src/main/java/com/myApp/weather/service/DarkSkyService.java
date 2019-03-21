package com.myApp.weather.service;

import com.myApp.weather.utils.ApiUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DarkSkyService extends ApiUtils {

    public String callApi(String latitude, String longitude) {
        String darkSkyUrl = ApiUtils.getDarkSkyUrl(latitude,longitude);

        return callApi(darkSkyUrl);
    }
}
