package com.myApp.weather.controller;

import com.myApp.weather.form.CoordinateForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
/**
 * Main controller for the {@link com.myApp.weather.WeatherApplication} web page
 */
public class WeatherController {

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

        if(coordinateForm.getLongitude() == null ||
            coordinateForm.getLongitude().isEmpty()){
            throw new IllegalArgumentException("the longitude cannot be null or empty");
        }
        if(coordinateForm.getLatitude() == null ||
                coordinateForm.getLatitude().isEmpty()){
            throw new IllegalArgumentException("the latitude cannot be null or empty");
        }

        return index(model);
    }
}
