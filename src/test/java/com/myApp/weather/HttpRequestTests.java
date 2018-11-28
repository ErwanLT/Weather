package com.myApp.weather;

import com.myApp.weather.form.CoordinateForm;
import io.florianlopes.spring.test.web.servlet.request.MockMvcRequestBuilderUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.util.NestedServletException;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
/**
 * Test class for {@link com.myApp.weather.controller.WeatherController}
 */
public class HttpRequestTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultHomePage() throws Exception {
        this.mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("<title>Weather</title>")));
    }

    @Test
    public void shouldReturnHomePage() throws Exception {
        this.mockMvc.perform(get("/home"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("<title>Weather</title>")));
    }

    @Test
    public void shouldReturn404() throws Exception {
        this.mockMvc.perform(get("/toto"))
                .andDo(print())
                .andExpect(status().isNotFound());
    }

    @Test
    public void testGetWeatherController() throws Exception {
        CoordinateForm form = new CoordinateForm("14", "15");

        this.mockMvc.perform(MockMvcRequestBuilderUtils.postForm("/getWeather", form))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test(expected = NestedServletException.class)
    public void testGetWeatherBadRequest1() throws Exception {
        CoordinateForm form = new CoordinateForm("", "15");

        this.mockMvc.perform(MockMvcRequestBuilderUtils.postForm("/getWeather", form));
    }

    @Test(expected = NestedServletException.class)
    public void testGetWeatherBadRequest2() throws Exception {
        CoordinateForm form = new CoordinateForm("14", "");

        this.mockMvc.perform(MockMvcRequestBuilderUtils.postForm("/getWeather", form));
    }

}
