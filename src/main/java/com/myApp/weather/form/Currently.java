package com.myApp.weather.form;

import lombok.*;

@Data
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Currently {

    private String time;
    private String summary;
    private String icon;
    private double temperature;
    private double apparentTemperature;
    private double dewPoint;
    private double humidity;
    private double pressure;
    private double windSpeed;
    private double uvIndex;
    private double visibility;
    private double ozone;


    public Currently withTime(String time){
        this.setTime(time);
        return this;
    }

    public Currently withSummary(String summary){
        this.setSummary(summary);
        return this;
    }

    public Currently withIcon(String icon){
        this.setIcon(icon);
        return this;
    }

    public Currently withTemperature(double temperature){
        this.setTemperature(temperature);
        return this;
    }

    public Currently withApparentTemperature(double apparentTemperature){
        this.setApparentTemperature(apparentTemperature);
        return this;
    }

    public Currently withDewPoint(double dewPoint){
        this.setDewPoint(dewPoint);
        return this;
    }

    public Currently withHumidity(double humidity){
        this.setHumidity(humidity);
        return this;
    }

    public Currently withPressure(double pressure){
        this.setPressure(pressure);
        return this;
    }

    public Currently withWindSpeed(double windSpeed){
        this.setWindSpeed(windSpeed);
        return this;
    }

    public Currently withUVIndex(double uvIndex){
        this.setUvIndex(uvIndex);
        return this;
    }

    public Currently withVisibility(double visibility){
        this.setVisibility(visibility);
        return this;
    }

    public Currently withOzone(double ozone){
        this.setOzone(ozone);
        return this;
    }
}
