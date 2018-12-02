package com.myApp.weather.weatherModel;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class Daily extends Weather{

    private double temperatureMin;
    private double temperatureMinTime;
    private double temperatureMax;
    private double temperatureMaxTime;

    public Daily() {
        super();
    }
}
