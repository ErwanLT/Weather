package com.myApp.weather.weatherModel.toparse;

import lombok.*;


/**
 * the object that is returned by the call to darksky
 *
 * @author eletutour
 * @since 1.0.0
 */
@Data
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ForecastResponse {

    private double latitude;

    private double longitude;

    /**
     * A data point containing the current weather.css conditions at the requested location.
     */
    private Currently currently;

    /**
     * A data block containing the weather.css conditions day-by-day for the next week.
     */
    private Daily daily;
}
