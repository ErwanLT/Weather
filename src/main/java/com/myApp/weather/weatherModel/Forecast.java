package com.myApp.weather.weatherModel;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter @Setter
/**
 * the object that is returned by the call to darksky
 *
 * @author eletutour
 * @since 1.0.0
 */
public class Forecast {

    /**
     * A data point containing the current weather conditions at the requested location.
     */
    private Weather currently;

    /**
     * A data block containing the weather conditions day-by-day for the next week.
     */
    private List<Daily> week;
}
