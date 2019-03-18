package com.myApp.weather.controller;

import com.myApp.weather.form.CoordinateForm;
import com.myApp.weather.service.WeatherService;
import com.myApp.weather.utils.Message;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class WeatherControllerTest {

    @Autowired
    WeatherController weatherController;

    CoordinateForm form;

    WeatherService weatherService;

    @Before
    public void setUp(){
        weatherController = new WeatherController();
    }

    @Test
    public void testLocationEmpty() {
        Model model = new BindingAwareModelMap();
        form = new CoordinateForm();
        this.weatherController.getWeather(form, model);
        assertTrue(model.containsAttribute("message"));
        Message message = (Message) ((BindingAwareModelMap) model).get("message");
        assertThat(message.getMessage()).isEqualTo("The location field is null or Empty");
        assertThat(message.getType()).isEqualTo("DANGER");
    }
}
