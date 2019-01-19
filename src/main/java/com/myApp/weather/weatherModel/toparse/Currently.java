package com.myApp.weather.weatherModel.toparse;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter @Setter
@NoArgsConstructor
/**
 * @author eletutour
 * @since 1.0.0
 */
public class Currently {

    private String time;
    private String summary;
    private String icon;
    private double nearestStormDistance;
    private double nearestStormBearing;
    private double precipIntensity;
    private double precipProbability;
    private double temperature;
    private double apparentTemperature;
    private double dewPoint;
    private double humidity;
    private double pressure;
    private double windSpeed;
    private double windGust;
    private double windBearing;
    private double cloudCover;
    private double uvIndex;
    private double visibility;
    private double ozone;
}
