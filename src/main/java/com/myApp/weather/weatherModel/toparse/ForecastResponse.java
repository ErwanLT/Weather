/*MIT License

Copyright (c) 2018 Erwan Le Tutour

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
package com.myApp.weather.weatherModel.toparse;

import lombok.*;

import java.util.ArrayList;
import java.util.List;


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

    private String location;

    /**
     * A data point containing the current weather.css conditions at the requested location.
     */
    private Currently currently;

    private Hourly hourly;

    /**
     * A data block containing the weather.css conditions day-by-day for the next week.
     */
    private Daily daily;

    private List<Alert> alerts = new ArrayList<>();
}
