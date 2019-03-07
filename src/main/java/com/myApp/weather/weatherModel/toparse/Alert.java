package com.myApp.weather.weatherModel.toparse;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class Alert {

    private String title;

    private List<String> regions;

    private String severity;

    private String time;

    private String expires;

    private String description;

    private String uri;
}
