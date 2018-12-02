package com.myApp.weather.weatherModel;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter @Setter
public class Forecast {

    private Weather currently;
    private List<Daily> week;
}
