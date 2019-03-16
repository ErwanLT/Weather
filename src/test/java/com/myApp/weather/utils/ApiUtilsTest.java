package com.myApp.weather.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiUtilsTest {

    @Test
    public void testDArkKSyUrl(){
        String url = ApiUtils.getDarkSkyUrl("test", "test");
        assertThat(url).isNotNull().startsWith("https://api.darksky.net/forecast/").endsWith("&exclude=minutely");
    }

    @Test
    public void testLocationIQUrl(){
        String url = ApiUtils.getLocationiqUrl("Paris");
        assertThat(url).isNotNull().startsWith("https://eu1.locationiq.com/v1/search.php");
    }
}
