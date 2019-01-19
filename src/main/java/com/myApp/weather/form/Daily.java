package com.myApp.weather.form;

import lombok.*;

@Data
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Daily {

    private String time;
    private String summary;
    private String icon;
    private String sunriseTime;
    private String sunsetTime;
    private double moonPhase;
    private double precipIntensity;
    private double precipIntensityMax;
    private double precipProbability;
    private double precipIntensityMaxTime;
    private double precipAccumulation;
    private String precipType;
    private double temperatureHigh;
    private double temperatureHighTime;
    private double temperatureLow;
    private double temperatureLowTime;
    private double apparentTemperatureHigh;
    private double apparentTemperatureHighTime;
    private double apparentTemperatureLow;
    private double apparentTemperatureLowTime;
    private double temperatureMin;
    private double temperatureMinTime;
    private double temperatureMax;
    private double temperatureMaxTime;
    private double apparentTemperatureMin;
    private double apparentTemperatureMinTime;
    private double apparentTemperatureMax;
    private double apparentTemperatureMaxTime;
    private double dewPoint;
    private double humidity;
    private double pressure;
    private double windSpeed;
    private double windGust;
    private double windGustTime;
    private Integer windBearing;
    private double cloudCover;
    private Integer uvIndex;
    private Integer uvIndexTime;
    private double visibility;
    private double ozone;

    public Daily withTime(String time){
        this.setTime(time);
        return this;
    }

    public Daily withSummary(String summary){
        this.setSummary(summary);
        return this;
    }

    public Daily withIcon(String icon){
        this.setIcon(icon);
        return this;
    }

    public Daily withSunriseTime(String sunriseTime){
        this.setSunriseTime(sunriseTime);
        return this;
    }

    public Daily withSunsetTime(String sunsetTime){
        this.setSunsetTime(sunsetTime);
        return this;
    }

    public Daily withTemperatureMax(double temperatureMax){
        this.setTemperatureMax(temperatureMax);
        return this;
    }

    public Daily withTemperatureMin(double temperatureMin){
        this.setTemperatureMin(temperatureMin);
        return this;
    }
}
