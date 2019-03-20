package com.myApp.weather.controller;

import com.myApp.weather.ForecastResponse;
import com.myApp.weather.LocationIQResponse;
import com.myApp.weather.form.CoordinateForm;
import com.myApp.weather.form.Forecast;
import com.myApp.weather.service.*;
import com.myApp.weather.utils.Message;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ComponentScan("com.myApp.weather")
public class WeatherControllerTest {

    @Autowired
    WeatherController weatherController;

    CoordinateForm form;

    WeatherService weatherService;

    ResponseToFormService responseToFormService;

    GsonService gsonService;

    DarkSkyService darkSkyService;

    LocationIQService locationIQService;

    DateService dateService;

    @Before
    public void setUp(){
        gsonService = new GsonService();
        darkSkyService = mock(DarkSkyService.class);
        locationIQService = mock(LocationIQService.class);
        dateService = new DateService();
        weatherService = new WeatherService(gsonService, darkSkyService, locationIQService);
        responseToFormService = new ResponseToFormService(dateService);
        weatherController = new WeatherController(weatherService, responseToFormService);
    }

    @Test
    public void testLocationEmpty() {
        Model model = new BindingAwareModelMap();
        form = initFormEmptyLocation();
        this.weatherController.getWeather(form, model);
        assertTrue(model.containsAttribute("message"));
        Message message = (Message) ((BindingAwareModelMap) model).get("message");
        assertThat(message.getMessage()).isEqualTo("The location field is null or Empty");
        assertThat(message.getType()).isEqualTo("DANGER");
    }

    private CoordinateForm initFormEmptyLocation() {
        CoordinateForm form = new CoordinateForm();
        form.setLocation("");
        assertThat(form).isNotNull();
        assertThat(form.getLocation()).isEmpty();

        return form;
    }

    @Test
    public void testResponse() {
        when(locationIQService.callApi(anyString())).thenReturn(LocationIQResponse.locationIQResponse);
        when(darkSkyService.callApi(anyString(), anyString())).thenReturn(ForecastResponse.darkSkyResponse);

        Model model = new BindingAwareModelMap();
        form = initForm();
        this.weatherController.getWeather(form, model);

        assertFalse(model.containsAttribute("message"));

        Forecast f = (Forecast) ((BindingAwareModelMap) model).get("forecast");
        assertThat(f).isNotNull();
    }

    private CoordinateForm initForm(){
        CoordinateForm form = new CoordinateForm();
        form.setLocation("Paris");
        assertThat(form).isNotNull();
        assertThat(form.getLocation()).isEqualTo("Paris");

        return form;
    }

    @Test
    public void testFakeResponse(){
        when(locationIQService.callApi(anyString())).thenReturn("");

        Model model = new BindingAwareModelMap();
        form = initForm();

        this.weatherController.getWeather(form, model);
        assertTrue(model.containsAttribute("message"));
        Message message = (Message) ((BindingAwareModelMap) model).get("message");
        assertThat(message.getMessage()).isEqualTo("This is a fake response because something bad happened.");
        assertThat(message.getType()).isEqualTo("WARNING");

        Forecast f = (Forecast) ((BindingAwareModelMap) model).get("forecast");
        assertThat(f).isNotNull();
    }
}
