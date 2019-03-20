package com.myApp.weather.service;

import com.myApp.weather.weatherModel.toparse.ForecastResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherServiceTest {

    @Autowired
    WeatherService service;

    @Test
    public void test_offline() {
        ForecastResponse response = service.getForecast("");
        assertThat(response).isNotNull();
        assertThat(response.getCurrently()).isNotNull();
        assertThat(response.getDaily()).isNotNull();
        assertThat(response.getHourly()).isNotNull();
        assertThat(response.getAlerts()).isNotNull();
    }
}
