package com.myApp.weather.form;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * form of the main page
 *
 * @author ewanletutour
 * @since 1.0.0
 */
@Data
@Getter @Setter
public class CoordinateForm {

    /**
     * the longitude parameter
     */
    private String longitude;

    /**
     * the latitude parameter
     */
    private String latitude;

    public CoordinateForm(){}

    public CoordinateForm(String longitude, String latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
