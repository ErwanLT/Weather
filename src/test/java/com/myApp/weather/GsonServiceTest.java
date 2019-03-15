package com.myApp.weather;

import com.myApp.weather.service.GsonService;
import com.myApp.weather.weatherModel.toparse.ForecastResponse;
import com.myApp.weather.weatherModel.toparse.*;
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
public class GsonServiceTest {

    @Autowired
    private GsonService gsonService;

    private String darkskyResponse;

    @Before
    public void setUp(){
        darkskyResponse = com.myApp.weather.ForecastResponse.darkSkyResponse;
    }


    @Test
    public void deserializeDarkSkyResponse(){

        ForecastResponse f = gsonService.stringToForecast(darkskyResponse);
        assertThat(f).isNotNull();
        checkForecast(f);

    }

    private void checkForecast(ForecastResponse f) {
        assertThat(f.getLatitude()).isEqualTo(48.8566);
        assertThat(f.getLongitude()).isEqualTo(2.3515);
        assertThat(f.getTimezone()).isEqualTo("Europe/Paris");
        assertThat(f.getCurrently()).isNotNull();
        assertThat(f.getDaily()).isNotNull();
        assertThat(f.getHourly()).isNotNull();
        assertThat(f.getAlerts()).isNotNull();
        //check Currently
        checkCurrently(f.getCurrently());
        //checkDaily
        checkDaily(f.getDaily());
        //
        checkHourly(f.getHourly());
        //
        checkAlerts(f.getAlerts());
    }

    private void checkCurrently(Currently currently) {
        assertThat(currently.getSummary()).isEqualTo("Breezy and Overcast");
        assertThat(currently.getIcon()).isEqualTo("wind");
        assertThat(currently.getPrecipIntensity()).isNotNull();
        assertThat(currently.getPrecipProbability()).isNotNull();
        assertThat(currently.getTemperature()).isNotNull();
        assertThat(currently.getApparentTemperature()).isNotNull();
        assertThat(currently.getDewPoint()).isNotNull();
        assertThat(currently.getHumidity()).isNotNull();
        assertThat(currently.getPressure()).isNotNull();
        assertThat(currently.getWindSpeed()).isNotNull();
        assertThat(currently.getWindGust()).isNotNull();
        assertThat(currently.getWindBearing()).isNotNull();
        assertThat(currently.getCloudCover()).isNotNull();
        assertThat(currently.getUvIndex()).isNotNull();
        assertThat(currently.getVisibility()).isNotNull();
        assertThat(currently.getOzone()).isNotNull();
    }

    private void checkDaily(Daily daily) {
        assertThat(daily.getIcon()).isEqualTo("rain");
        assertThat(daily.getSummary()).isEqualTo("Light rain today and Sunday, with high temperatures bottoming out at 53°F on Sunday.");
        assertThat(daily.getData()).isNotNull();
        assertThat(daily.getData().size()).isEqualTo(8);

        checkDailyData(daily.getData().get(0));
    }

    private void checkDailyData(DailyData dailyData) {
        assertThat(dailyData.getTime()).isNotNull();
        assertThat(dailyData.getSummary()).isEqualTo("Overcast throughout the day and breezy until afternoon.");
        assertThat(dailyData.getIcon()).isEqualTo("wind");
        assertThat(dailyData.getSunriseTime()).isNotNull();
        assertThat(dailyData.getSunsetTime()).isNotNull();
        assertThat(dailyData.getMoonPhase()).isNotNull();
        assertThat(dailyData.getPrecipIntensity()).isNotNull();
        assertThat(dailyData.getPrecipIntensityMax()).isNotNull();
        assertThat(dailyData.getPrecipProbability()).isNotNull();
        assertThat(dailyData.getPrecipIntensityMaxTime()).isNotNull();
        assertThat(dailyData.getPrecipAccumulation()).isNull();
        assertThat(dailyData.getPrecipType()).isNotNull();
        assertThat(dailyData.getTemperatureHigh()).isNotNull();
        assertThat(dailyData.getTemperatureLow()).isNotNull();
        assertThat(dailyData.getApparentTemperatureHigh()).isNotNull();
        assertThat(dailyData.getApparentTemperatureLow()).isNotNull();
        assertThat(dailyData.getTemperatureMin()).isNotNull();
        assertThat(dailyData.getTemperatureMax()).isNotNull();
        assertThat(dailyData.getApparentTemperatureMin()).isNotNull();
        assertThat(dailyData.getApparentTemperatureMax()).isNotNull();
        assertThat(dailyData.getDewPoint()).isNotNull();
        assertThat(dailyData.getHumidity()).isNotNull();
        assertThat(dailyData.getPressure()).isNotNull();
        assertThat(dailyData.getWindSpeed()).isNotNull();
        assertThat(dailyData.getWindGust()).isNotNull();
        assertThat(dailyData.getWindBearing()).isNotNull();
        assertThat(dailyData.getCloudCover()).isNotNull();
        assertThat(dailyData.getUvIndex()).isNotNull();
        assertThat(dailyData.getVisibility()).isNotNull();
        assertThat(dailyData.getOzone()).isNotNull();
    }

    private void checkHourly(Hourly hourly) {
        assertThat(hourly.getIcon()).isNotNull();
        assertThat(hourly.getSummary()).isNotNull();
        assertThat(hourly.getData()).isNotNull();
        assertThat(hourly.getData().size()).isEqualTo(49);

        checkHourlyData(hourly.getData().get(0));
    }

    private void checkHourlyData(HourlyData hourlyData) {
        assertThat(hourlyData.getTime()).isNotNull();
        assertThat(hourlyData.getSummary()).isEqualTo("Breezy and Overcast");
        assertThat(hourlyData.getIcon()).isEqualTo("wind");
        assertThat(hourlyData.getPrecipIntensity()).isNotNull();
        assertThat(hourlyData.getPrecipProbability()).isNotNull();
        assertThat(hourlyData.getDewPoint()).isNotNull();
        assertThat(hourlyData.getHumidity()).isNotNull();
        assertThat(hourlyData.getPressure()).isNotNull();
        assertThat(hourlyData.getWindSpeed()).isNotNull();
        assertThat(hourlyData.getWindGust()).isNotNull();
        assertThat(hourlyData.getWindBearing()).isNotNull();
        assertThat(hourlyData.getCloudCover()).isNotNull();
        assertThat(hourlyData.getUvIndex()).isNotNull();
        assertThat(hourlyData.getVisibility()).isNotNull();
        assertThat(hourlyData.getOzone()).isNotNull();
        assertThat(hourlyData.getNearestStormBearing()).isNotNull();
        assertThat(hourlyData.getNearestStormDistance()).isNotNull();
    }

    private void checkAlerts(List<Alert> alerts) {
        assertThat(alerts.isEmpty()).isFalse();
        checkAlert(alerts.get(0));
    }

    private void checkAlert(Alert alert) {
        assertThat(alert.getTime()).isNotNull();
        assertThat(alert.getExpires()).isNotNull();
        assertThat(alert.getTitle()).isNotNull();
        assertThat(alert.getUri()).isNotNull();
        assertThat(alert.getDescription()).isNotNull();
        assertThat(alert.getSeverity()).isNotNull();
        assertThat(alert.getRegions()).isNotNull();
    }
}
