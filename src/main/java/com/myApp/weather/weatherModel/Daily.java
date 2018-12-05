package com.myApp.weather.weatherModel;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
/**
 * @author eletutour
 * @since 1.0.0
 */
public class Daily extends Weather{

    private double temperatureMin;
    private double temperatureMinTime;
    private double temperatureMax;
    private double temperatureMaxTime;

    public Daily() {
        super();
    }
}
