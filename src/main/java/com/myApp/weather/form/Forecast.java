package com.myApp.weather.form;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Forecast {

    private Currently currently;

    private List<Daily> week;
}
