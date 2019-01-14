package com.myApp.weather.weatherModel.toparse;

import lombok.*;


/**
 * @author eletutour
 * @since 1.0.0
 */
@Data
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class DailyData {

    private String time;
    private String summary;
    private String icon;
    private String sunriseTime;
    private String sunsetTime;
    private Double moonPhase;
    private Double precipIntensity;
    private Double precipIntensityMax;
    private Double precipProbability;
    private double precipIntensityMaxTime;
    private Double precipAccumulation;
    private String precipType;
    private Double temperatureHigh;
    private double temperatureHighTime;
    private Double temperatureLow;
    private double temperatureLowTime;
    private Double apparentTemperatureHigh;
    private double apparentTemperatureHighTime;
    private Double apparentTemperatureLow;
    private double apparentTemperatureLowTime;
    private Double temperatureMin;
    private double temperatureMinTime;
    private Double temperatureMax;
    private double temperatureMaxTime;
    private Double apparentTemperatureMin;
    private double apparentTemperatureMinTime;
    private Double apparentTemperatureMax;
    private double apparentTemperatureMaxTime;
    private Double dewPoint;
    private Double humidity;
    private Double pressure;
    private Double windSpeed;
    private Double windGust;
    private double windGustTime;
    private Integer windBearing;
    private Double cloudCover;
    private Integer uvIndex;
    private Integer uvIndexTime;
    private Double visibility;
    private Double ozone;

}
