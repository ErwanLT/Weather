package com.myApp.weather.weatherModel;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Data
@Getter @Setter
@NoArgsConstructor
public class Daily {

    private String summary;
    private String icon;
    private List<DailyData> data;

}
