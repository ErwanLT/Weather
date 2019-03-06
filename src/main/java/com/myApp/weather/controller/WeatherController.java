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
package com.myApp.weather.controller;

import com.myApp.weather.form.CoordinateForm;
import com.myApp.weather.form.Forecast;
import com.myApp.weather.service.ResponseToFormService;
import com.myApp.weather.service.WeatherService;
import com.myApp.weather.utils.MessageHelper;
import com.myApp.weather.weatherModel.toparse.ForecastResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

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

    @Autowired
    private ResponseToFormService responseToForm;

    @GetMapping("/")
    public String index(Model model) {

        CoordinateForm coordinateForm = new CoordinateForm();
        model.addAttribute(coordinateForm);

        return "help";
    }

    @GetMapping("/home")
    public String home(Model model){
        CoordinateForm coordinateForm = new CoordinateForm();
        model.addAttribute(coordinateForm);

        return "home";
    }

    @GetMapping("/history")
    public String history(Model model){
        CoordinateForm coordinateForm = new CoordinateForm();
        model.addAttribute(coordinateForm);

        return "history";
    }

    @GetMapping("/help")
    public String help(Model model){
        return index(model);
    }

    @PostMapping("/getWeather")
    public String getWeather(@ModelAttribute("coordinateForm")CoordinateForm coordinateForm, Model model, Errors errors){

        CoordinateForm form = new CoordinateForm();
        model.addAttribute(form);

        if(StringUtils.isEmpty(coordinateForm.getLocation())){
            //should never happened because it's a required field
            MessageHelper.addDangerAttribute(model, "The location field is null or Empty");
        } else {
            ForecastResponse forecast = weatherService.getForecast(coordinateForm.getLocation());
            if ("Fake forecast".equals(forecast.getLocation())){
                MessageHelper.addWarningAttribute(model, "This is a fake response because something bad happened.");
            }

            Forecast f = responseToForm.darkskyResponseToForm(forecast);

            model.addAttribute("forecast", f);
        }

        return "home";
    }
}
