package com.myApp.weather.service;

import com.myApp.weather.CommonForTest;
import com.myApp.weather.LocationIQResponse;
import com.myApp.weather.weatherModel.toparse.ForecastResponse;
import com.myApp.weather.weatherModel.toparse.LocationData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GsonServiceTest extends CommonForTest {


    private String darkskyResponse;

    private String locationIQResponse;

    @Before
    public void setUp(){
        darkskyResponse = com.myApp.weather.ForecastResponse.darkSkyResponse;
        locationIQResponse = LocationIQResponse.locationIQResponse;
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
        checkToParseCurrently(f.getCurrently());
        //checkDaily
        checkToParseDaily(f.getDaily());
        //
        checkToParseHourly(f.getHourly());
        //
        checkToParseAlerts(f.getAlerts());
    }

    @Test
    public void deserializeLocationIQResponse(){
        LocationData[] l = gsonService.stringToLocations(locationIQResponse);
        assertThat(l).isNotNull();
    }

}
