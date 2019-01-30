/*MIT License

Copyright (c) 2018 Erwan Le Tutour

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.*/
package com.myApp.weather.form;

import lombok.*;

@Data
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Daily {

    private int id;
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
    private String temperatureMin;
    private double temperatureMinTime;
    private String temperatureMax;
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

    public Daily withId(int id){
        this.setId(id);
        return this;
    }

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

    public Daily withTemperatureMax(String temperatureMax){
        this.setTemperatureMax(temperatureMax);
        return this;
    }

    public Daily withTemperatureMin(String temperatureMin){
        this.setTemperatureMin(temperatureMin);
        return this;
    }
}
