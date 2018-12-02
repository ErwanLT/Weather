package com.myApp.weather.form;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * form of the main page
 */
@Data
@Getter @Setter
public class CoordinateForm {

    private String longitude;

    private String latitude;

    public CoordinateForm(){}

    public CoordinateForm(String longitude, String latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
