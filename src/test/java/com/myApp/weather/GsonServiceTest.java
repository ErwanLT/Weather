package com.myApp.weather;

import com.myApp.weather.service.GsonService;
import com.myApp.weather.weatherModel.Daily;
import com.myApp.weather.weatherModel.DailyData;
import com.myApp.weather.weatherModel.Forecast;
import com.myApp.weather.weatherModel.Currently;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GsonServiceTest {

    @Autowired
    private GsonService gsonService;

    private String darkskyResponse;

    @Before
    public void setUp(){
        StringBuilder sb = new StringBuilder()
                .append("{\"latitude\":15,\"longitude\":16,\"timezone\":\"Africa/Ndjamena\"," +
                        "\"currently\":{\"time\":1544244375,\"summary\":\"Clear\",\"icon\":\"clear-night\",\"precipIntensity\":0,\"precipProbability\":0,\"temperature\":55.74,\"apparentTemperature\":55.74,\"dewPoint\":36.68,\"humidity\":0.49,\"pressure\":1015.23,\"windSpeed\":10.1,\"windGust\":16.53,\"windBearing\":26,\"cloudCover\":0,\"uvIndex\":0,\"visibility\":10,\"ozone\":226.59}," +
                        "\"daily\":{\"summary\":\"No precipitation throughout the week, with high temperatures bottoming out at 83°F on Monday.\",\"icon\":\"clear-day\"," +
                        "\"data\":[" +
                        "{\"time\":1544223600,\"summary\":\"Clear throughout the day.\",\"icon\":\"clear-day\",\"sunriseTime\":1544245883,\"sunsetTime\":1544286440,\"moonPhase\":0.04,\"precipIntensity\":0,\"precipIntensityMax\":0,\"precipProbability\":0,\"temperatureHigh\":84.92,\"temperatureHighTime\":1544277600,\"temperatureLow\":55.75,\"temperatureLowTime\":1544331600,\"apparentTemperatureHigh\":84.92,\"apparentTemperatureHighTime\":1544277600,\"apparentTemperatureLow\":55.75,\"apparentTemperatureLowTime\":1544331600,\"dewPoint\":34,\"humidity\":0.29,\"pressure\":1014.51,\"windSpeed\":11.51,\"windGust\":20.42,\"windGustTime\":1544256000,\"windBearing\":27,\"cloudCover\":0,\"uvIndex\":9,\"uvIndexTime\":1544263200,\"visibility\":10,\"ozone\":228.38,\"temperatureMin\":55.43,\"temperatureMinTime\":1544245200,\"temperatureMax\":84.92,\"temperatureMaxTime\":1544277600,\"apparentTemperatureMin\":55.43,\"apparentTemperatureMinTime\":1544245200,\"apparentTemperatureMax\":84.92,\"apparentTemperatureMaxTime\":1544277600}," +
                        "{\"time\":1544310000,\"summary\":\"Clear throughout the day.\",\"icon\":\"clear-day\",\"sunriseTime\":1544332316,\"sunsetTime\":1544372859,\"moonPhase\":0.07,\"precipIntensity\":0,\"precipIntensityMax\":0.0002,\"precipIntensityMaxTime\":1544346000,\"precipProbability\":0,\"temperatureHigh\":84.62,\"temperatureHighTime\":1544364000,\"temperatureLow\":57.5,\"temperatureLowTime\":1544418000,\"apparentTemperatureHigh\":84.62,\"apparentTemperatureHighTime\":1544364000,\"apparentTemperatureLow\":57.5,\"apparentTemperatureLowTime\":1544418000,\"dewPoint\":33.25,\"humidity\":0.27,\"pressure\":1016.4,\"windSpeed\":11.94,\"windGust\":22.8,\"windGustTime\":1544342400,\"windBearing\":31,\"cloudCover\":0,\"uvIndex\":9,\"uvIndexTime\":1544349600,\"visibility\":10,\"ozone\":230,\"temperatureMin\":55.75,\"temperatureMinTime\":1544331600,\"temperatureMax\":84.62,\"temperatureMaxTime\":1544364000,\"apparentTemperatureMin\":55.75,\"apparentTemperatureMinTime\":1544331600,\"apparentTemperatureMax\":84.62,\"apparentTemperatureMaxTime\":1544364000}," +
                        "{\"time\":1544396400,\"summary\":\"Partly cloudy until afternoon.\",\"icon\":\"partly-cloudy-day\",\"sunriseTime\":1544418749,\"sunsetTime\":1544459278,\"moonPhase\":0.1,\"precipIntensity\":0,\"precipIntensityMax\":0.0001,\"precipIntensityMaxTime\":1544475600,\"precipProbability\":0,\"temperatureHigh\":83.39,\"temperatureHighTime\":1544446800,\"temperatureLow\":57.04,\"temperatureLowTime\":1544504400,\"apparentTemperatureHigh\":83.39,\"apparentTemperatureHighTime\":1544446800,\"apparentTemperatureLow\":57.04,\"apparentTemperatureLowTime\":1544504400,\"dewPoint\":32.99,\"humidity\":0.27,\"pressure\":1017.14,\"windSpeed\":15.32,\"windGust\":37.2,\"windGustTime\":1544421600,\"windBearing\":45,\"cloudCover\":0.14,\"uvIndex\":7,\"uvIndexTime\":1544436000,\"visibility\":10,\"ozone\":230.73,\"temperatureMin\":57.5,\"temperatureMinTime\":1544418000,\"temperatureMax\":83.39,\"temperatureMaxTime\":1544446800,\"apparentTemperatureMin\":57.5,\"apparentTemperatureMinTime\":1544418000,\"apparentTemperatureMax\":83.39,\"apparentTemperatureMaxTime\":1544446800}," +
                        "{\"time\":1544482800,\"summary\":\"Partly cloudy in the morning.\",\"icon\":\"partly-cloudy-night\",\"sunriseTime\":1544505183,\"sunsetTime\":1544545699,\"moonPhase\":0.13,\"precipIntensity\":0,\"precipIntensityMax\":0.0002,\"precipIntensityMaxTime\":1544554800,\"precipProbability\":0,\"temperatureHigh\":83.74,\"temperatureHighTime\":1544536800,\"temperatureLow\":59.21,\"temperatureLowTime\":1544590800,\"apparentTemperatureHigh\":83.74,\"apparentTemperatureHighTime\":1544536800,\"apparentTemperatureLow\":59.21,\"apparentTemperatureLowTime\":1544590800,\"dewPoint\":27.47,\"humidity\":0.21,\"pressure\":1016.39,\"windSpeed\":14.39,\"windGust\":31.82,\"windGustTime\":1544508000,\"windBearing\":43,\"cloudCover\":0.17,\"uvIndex\":8,\"uvIndexTime\":1544522400,\"visibility\":10,\"ozone\":229,\"temperatureMin\":57.04,\"temperatureMinTime\":1544504400,\"temperatureMax\":83.74,\"temperatureMaxTime\":1544536800,\"apparentTemperatureMin\":57.04,\"apparentTemperatureMinTime\":1544504400,\"apparentTemperatureMax\":83.74,\"apparentTemperatureMaxTime\":1544536800}," +
                        "{\"time\":1544569200,\"summary\":\"Clear throughout the day.\",\"icon\":\"clear-day\",\"sunriseTime\":1544591615,\"sunsetTime\":1544632120,\"moonPhase\":0.16,\"precipIntensity\":0.0001,\"precipIntensityMax\":0.0001,\"precipIntensityMaxTime\":1544583600,\"precipProbability\":0.04,\"precipType\":\"rain\",\"temperatureHigh\":85.12,\"temperatureHighTime\":1544623200,\"temperatureLow\":60.04,\"temperatureLowTime\":1544677200,\"apparentTemperatureHigh\":85.12,\"apparentTemperatureHighTime\":1544623200,\"apparentTemperatureLow\":60.04,\"apparentTemperatureLowTime\":1544677200,\"dewPoint\":25.12,\"humidity\":0.18,\"pressure\":1016.73,\"windSpeed\":13.55,\"windGust\":32.25,\"windGustTime\":1544594400,\"windBearing\":43,\"cloudCover\":0.01,\"uvIndex\":9,\"uvIndexTime\":1544608800,\"visibility\":10,\"ozone\":225.16,\"temperatureMin\":59.21,\"temperatureMinTime\":1544590800,\"temperatureMax\":85.12,\"temperatureMaxTime\":1544623200,\"apparentTemperatureMin\":59.21,\"apparentTemperatureMinTime\":1544590800,\"apparentTemperatureMax\":85.12,\"apparentTemperatureMaxTime\":1544623200}," +
                        "{\"time\":1544655600,\"summary\":\"Partly cloudy until afternoon.\",\"icon\":\"partly-cloudy-day\",\"sunriseTime\":1544678048,\"sunsetTime\":1544718542,\"moonPhase\":0.19,\"precipIntensity\":0,\"precipIntensityMax\":0,\"precipProbability\":0,\"temperatureHigh\":84.59,\"temperatureHighTime\":1544706000,\"temperatureLow\":58.74,\"temperatureLowTime\":1544763600,\"apparentTemperatureHigh\":84.59,\"apparentTemperatureHighTime\":1544706000,\"apparentTemperatureLow\":58.74,\"apparentTemperatureLowTime\":1544763600,\"dewPoint\":26.22,\"humidity\":0.19,\"pressure\":1016.58,\"windSpeed\":13.27,\"windGust\":25.97,\"windGustTime\":1544680800,\"windBearing\":44,\"cloudCover\":0.22,\"uvIndex\":6,\"uvIndexTime\":1544695200,\"visibility\":10,\"ozone\":224.61,\"temperatureMin\":60.04,\"temperatureMinTime\":1544677200,\"temperatureMax\":84.59,\"temperatureMaxTime\":1544706000,\"apparentTemperatureMin\":60.04,\"apparentTemperatureMinTime\":1544677200,\"apparentTemperatureMax\":84.59,\"apparentTemperatureMaxTime\":1544706000}," +
                        "{\"time\":1544742000,\"summary\":\"Clear throughout the day.\",\"icon\":\"clear-day\",\"sunriseTime\":1544764480,\"sunsetTime\":1544804965,\"moonPhase\":0.22,\"precipIntensity\":0,\"precipIntensityMax\":0,\"precipProbability\":0,\"temperatureHigh\":87.28,\"temperatureHighTime\":1544796000,\"temperatureLow\":58.19,\"temperatureLowTime\":1544850000,\"apparentTemperatureHigh\":87.28,\"apparentTemperatureHighTime\":1544796000,\"apparentTemperatureLow\":58.19,\"apparentTemperatureLowTime\":1544850000,\"dewPoint\":28.91,\"humidity\":0.21,\"pressure\":1016.15,\"windSpeed\":11.74,\"windGust\":23.29,\"windGustTime\":1544756400,\"windBearing\":39,\"cloudCover\":0,\"uvIndex\":9,\"uvIndexTime\":1544781600,\"visibility\":10,\"ozone\":226.88,\"temperatureMin\":58.74,\"temperatureMinTime\":1544763600,\"temperatureMax\":87.28,\"temperatureMaxTime\":1544796000,\"apparentTemperatureMin\":58.74,\"apparentTemperatureMinTime\":1544763600,\"apparentTemperatureMax\":87.28,\"apparentTemperatureMaxTime\":1544796000}," +
                        "{\"time\":1544828400,\"summary\":\"Clear throughout the day.\",\"icon\":\"clear-day\",\"sunriseTime\":1544850912,\"sunsetTime\":1544891389,\"moonPhase\":0.25,\"precipIntensity\":0,\"precipIntensityMax\":0,\"precipProbability\":0,\"temperatureHigh\":87.33,\"temperatureHighTime\":1544878800,\"temperatureLow\":59.51,\"temperatureLowTime\":1544936400,\"apparentTemperatureHigh\":87.33,\"apparentTemperatureHighTime\":1544878800,\"apparentTemperatureLow\":59.51,\"apparentTemperatureLowTime\":1544936400,\"dewPoint\":26.5,\"humidity\":0.19,\"pressure\":1016.47,\"windSpeed\":11.77,\"windGust\":26,\"windGustTime\":1544853600,\"windBearing\":35,\"cloudCover\":0,\"uvIndex\":9,\"uvIndexTime\":1544871600,\"visibility\":10,\"ozone\":228.14,\"temperatureMin\":58.19,\"temperatureMinTime\":1544850000,\"temperatureMax\":87.33,\"temperatureMaxTime\":1544878800,\"apparentTemperatureMin\":58.19,\"apparentTemperatureMinTime\":1544850000,\"apparentTemperatureMax\":87.33,\"apparentTemperatureMaxTime\":1544878800}" +
                        "]" +
                        "}," +
                        "\"flags\":{\"sources\":[\"cmc\",\"gfs\",\"icon\",\"isd\",\"madis\"],\"units\":\"us\"},\"offset\":1}");

        darkskyResponse = sb.toString();
    }


    @Test
    public void deserializeDarkSkyResponse(){

        Forecast f = gsonService.stringToForecast(darkskyResponse);
        assertThat(f).isNotNull();
        checkForecast(f);

    }

    private void checkForecast(Forecast f) {
        assertThat(f.getLatitude()).isEqualTo(15);
        assertThat(f.getLongitude()).isEqualTo(16);
        assertThat(f.getCurrently()).isNotNull();
        assertThat(f.getDaily()).isNotNull();

        //check Currently
        checkCurrently(f.getCurrently());

        //checkDaily
        checkDaily(f.getDaily());
    }

    private void checkCurrently(Currently currently) {
        assertThat(currently.getSummary()).isEqualTo("Clear");
        assertThat(currently.getIcon()).isEqualTo("clear-night");
        assertThat(currently.getPrecipIntensity()).isEqualTo(0);
        assertThat(currently.getPrecipProbability()).isEqualTo(0);
        assertThat(currently.getTemperature()).isEqualTo(55.74);
        assertThat(currently.getApparentTemperature()).isEqualTo(55.74);
        assertThat(currently.getDewPoint()).isEqualTo(36.68);
        assertThat(currently.getHumidity()).isEqualTo(0.49);
        assertThat(currently.getPressure()).isEqualTo(1015.23);
        assertThat(currently.getWindSpeed()).isEqualTo(10.1);
        assertThat(currently.getWindGust()).isEqualTo(16.53);
        assertThat(currently.getWindBearing()).isEqualTo(26);
        assertThat(currently.getCloudCover()).isEqualTo(0);
        assertThat(currently.getUvIndex()).isEqualTo(0);
        assertThat(currently.getVisibility()).isEqualTo(10);
        assertThat(currently.getOzone()).isEqualTo(226.59);
    }

    private void checkDaily(Daily daily) {
        assertThat(daily.getIcon()).isEqualTo("clear-day");
        assertThat(daily.getSummary()).isEqualTo("No precipitation throughout the week, with high temperatures bottoming out at 83°F on Monday.");
        assertThat(daily.getData()).isNotNull();
        assertThat(daily.getData().size()).isEqualTo(8);

        checkDailyData(daily.getData().get(0));
    }

    private void checkDailyData(DailyData dailyData) {
        assertThat(dailyData.getTime()).isEqualTo("1544223600");
        assertThat(dailyData.getSummary()).isEqualTo("Clear throughout the day.");
        assertThat(dailyData.getIcon()).isEqualTo("clear-day");
        assertThat(dailyData.getSunriseTime()).isEqualTo("1544245883");
        assertThat(dailyData.getSunsetTime()).isEqualTo("1544286440");
        assertThat(dailyData.getMoonPhase()).isEqualTo(0.04);
        assertThat(dailyData.getPrecipIntensity()).isEqualTo(0);
        assertThat(dailyData.getPrecipIntensityMax()).isEqualTo(0);
        assertThat(dailyData.getPrecipProbability()).isEqualTo(0);
        assertThat(dailyData.getPrecipIntensityMaxTime()).isEqualTo(0);
        assertThat(dailyData.getPrecipAccumulation()).isNull();
        assertThat(dailyData.getPrecipType()).isNull();
        assertThat(dailyData.getTemperatureHigh()).isEqualTo(84.92);
        assertThat(dailyData.getTemperatureLow()).isEqualTo(55.75);
        assertThat(dailyData.getApparentTemperatureHigh()).isEqualTo(84.92);
        assertThat(dailyData.getApparentTemperatureLow()).isEqualTo(55.75);
        assertThat(dailyData.getTemperatureMin()).isEqualTo(55.43);
        assertThat(dailyData.getTemperatureMax()).isEqualTo(84.92);
        assertThat(dailyData.getApparentTemperatureMin()).isEqualTo(55.43);
        assertThat(dailyData.getApparentTemperatureMax()).isEqualTo(84.92);
        assertThat(dailyData.getDewPoint()).isEqualTo(34);
        assertThat(dailyData.getHumidity()).isEqualTo(0.29);
        assertThat(dailyData.getPressure()).isEqualTo(1014.51);
        assertThat(dailyData.getWindSpeed()).isEqualTo(11.51);
        assertThat(dailyData.getWindGust()).isEqualTo(20.42);
        assertThat(dailyData.getWindBearing()).isEqualTo(27);
        assertThat(dailyData.getCloudCover()).isEqualTo(0);
        assertThat(dailyData.getUvIndex()).isEqualTo(9);
        assertThat(dailyData.getVisibility()).isEqualTo(10);
        assertThat(dailyData.getOzone()).isEqualTo(228.38);
    }
}
