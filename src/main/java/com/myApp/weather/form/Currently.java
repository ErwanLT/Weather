/*MIT License

Copyright (c) 2018 - 2019 Erwan Le Tutour

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

@Getter
@Setter
@NoArgsConstructor
public class Currently {

    private String time;
    private String summary;
    private String icon;
    private int temperature;
    private int apparentTemperature;
    private int dewPoint;
    private double humidity;
    private double pressure;
    private double windSpeed;
    private int uvIndex;
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

    public Currently withTemperature(int temperature){
        this.setTemperature(temperature);
        return this;
    }

    public Currently withApparentTemperature(int apparentTemperature){
        this.setApparentTemperature(apparentTemperature);
        return this;
    }

    public Currently withDewPoint(int dewPoint){
        this.setDewPoint(dewPoint);
        return this;
    }

    public Currently withHumidity(double humidity){
        this.setHumidity(humidity*100);
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

    public Currently withUVIndex(int uvIndex){
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
