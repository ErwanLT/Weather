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

    private String location;

    public CoordinateForm(){}

    public CoordinateForm(String location) {
        this.location = location;
    }
}
