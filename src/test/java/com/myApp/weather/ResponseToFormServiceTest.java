package com.myApp.weather;

import com.myApp.weather.form.*;
import com.myApp.weather.service.GsonService;
import com.myApp.weather.service.ResponseToFormService;
import com.myApp.weather.weatherModel.toparse.ForecastResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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
        assertThat(f.getHourSummary()).isNotNull();
        assertThat(f.getWeekSummary()).isNotNull();

        assertThat(f.getCurrently()).isNotNull();
        assertThat(f.getWeek()).isNotNull();
        assertThat(f.getHours()).isNotNull();
        assertThat(f.getAlerts()).isNotNull();

        chechCurrently(f.getCurrently());
        checkWeek(f.getWeek());
        checkHours(f.getHours());
        checkAlerts(f.getAlerts());
    }

    private void chechCurrently(Currently currently) {
        assertThat(currently.getSummary()).isEqualTo("Breezy and Overcast");
        assertThat(currently.getIcon()).isEqualTo("wind");
        assertThat(currently.getTemperature()).isNotNull();
        assertThat(currently.getApparentTemperature()).isNotNull();
        assertThat(currently.getDewPoint()).isNotNull();
        assertThat(currently.getHumidity()).isNotNull();
        assertThat(currently.getPressure()).isNotNull();
        assertThat(currently.getWindSpeed()).isNotNull();
        assertThat(currently.getUvIndex()).isNotNull();
        assertThat(currently.getVisibility()).isNotNull();
        assertThat(currently.getOzone()).isNotNull();

    }

    private void checkWeek(List<Daily> week) {
        
        assertThat(week.size()).isEqualTo(8);

        checkdaily(week.get(0));
    }

    private void checkdaily(Daily daily) {
        assertThat(daily.getId()).isNotNull();
        assertThat(daily.getTime()).isNotNull();
        assertThat(daily.getSummary()).isNotNull();
        assertThat(daily.getIcon()).isNotNull();
        assertThat(daily.getSunriseTime()).isNotNull();
        assertThat(daily.getSunsetTime()).isNotNull();
        assertThat(daily.getTemperatureMax()).isNotNull();
        assertThat(daily.getTemperatureMin()).isNotNull();
        assertThat(daily.getMoonPhase()).isNotNull();
    }


    private void checkHours(List<Hourly> hours) {
        assertThat(hours.size()).isEqualTo(49);

        checkHour(hours.get(0));
    }

    private void checkHour(Hourly hourly) {
        assertThat(hourly.getTime()).isNotNull();
        assertThat(hourly.getIcon()).isNotNull();
        assertThat(hourly.getSummary()).isNotNull();
        assertThat(hourly.getTemperature()).isNotNull();
        assertThat(hourly.getApparentTemperature()).isNotNull();
        assertThat(hourly.getPrecipProbability()).isNotNull();
    }

    private void checkAlerts(List<Alert> alerts) {
        assertThat(alerts.size()).isEqualTo(1);

        checkAlert(alerts.get(0));
    }

    private void checkAlert(Alert alert) {
        assertThat(alert.getTitle()).isNotNull();
        assertThat(alert.getUri()).isNotNull();
        assertThat(alert.getTime()).isNotNull();
        assertThat(alert.getExpire()).isNotNull();
    }
}
