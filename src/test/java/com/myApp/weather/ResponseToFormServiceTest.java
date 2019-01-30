package com.myApp.weather;

import com.myApp.weather.form.Forecast;
import com.myApp.weather.service.GsonService;
import com.myApp.weather.service.ResponseToFormService;
import com.myApp.weather.weatherModel.toparse.ForecastResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResponseToFormServiceTest {

    @Autowired
    ResponseToFormService service;

    @Autowired
    GsonService gsonService;

    private ForecastResponse forecastResponse;

    @Before
    public void setUp(){
        forecastResponse = gsonService.stringToForecast(com.myApp.weather.ForecastResponse.darkSkyResponse);
    }

    @Test
    public void forecastResponseToForm(){
        Forecast f = service.darkskyResponseToForm(forecastResponse);
        assertThat(f).isNotNull();
        assertThat(f.getCurrently()).isNotNull();
        assertThat(f.getWeek()).isNotNull();
        assertThat(f.getHours()).isNotNull();
    }

}
