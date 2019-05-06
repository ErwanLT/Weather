package com.myApp.weather.service;

import com.myApp.weather.CommonForTest;
import com.myApp.weather.form.Forecast;
import com.myApp.weather.weatherModel.toparse.ForecastResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResponseToFormServiceTest extends CommonForTest {



    private ForecastResponse forecastResponse;

    @Before
    public void setUp(){
        forecastResponse = gsonService.stringToForecast(com.myApp.weather.ForecastResponse.darkSkyResponse);
    }

    @Test
    public void forecastResponseToForm(){
        Forecast f = service.darkskyResponseToForm(forecastResponse);
        assertThat(f).isNotNull();
        assertThat(f.getHourSummary()).isNotNull();
        assertThat(f.getWeekSummary()).isNotNull();

        assertThat(f.getCurrently()).isNotNull();
        assertThat(f.getWeek()).isNotNull();
        assertThat(f.getHours()).isNotNull();
        assertThat(f.getAlerts()).isNotNull();

        checkCurrently(f.getCurrently());
        checkWeek(f.getWeek());
        checkHours(f.getHours());
        checkAlerts(f.getAlerts());
    }

}
