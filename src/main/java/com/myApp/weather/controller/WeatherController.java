package com.myApp.weather.controller;

import com.myApp.weather.form.CoordinateForm;
import com.myApp.weather.service.WeatherService;
import com.myApp.weather.weatherModel.Forecast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
/**
 * Main controller for the {@link com.myApp.weather.WeatherApplication} web page
 *
 * @author eletutour
 * @since 1.0.0
 */
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/")
    public String index(Model model) {

        CoordinateForm coordinateForm = new CoordinateForm();
        model.addAttribute(coordinateForm);

        return "/home";
    }

    @GetMapping("/home")
    public String home(Model model){
        return index(model);
    }

    @PostMapping("/getWeather")
    public String getWeather(@ModelAttribute("coordinateForm")CoordinateForm coordinateForm, Model model){

        Forecast forecast = weatherService.getForecast(coordinateForm.getLatitude(), coordinateForm.getLongitude());

        model.addAttribute("forecast", forecast);

        return index(model);
    }
}
