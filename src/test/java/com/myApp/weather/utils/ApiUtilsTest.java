package com.myApp.weather.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.myApp.weather.utils.ApiUtils.*;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiUtilsTest {

    @Test
    public void testDArkKSyUrl(){
        String url = getDarkSkyUrl("test", "test");
        assertThat(url).isNotNull()
            .contains(DARK_SKY_URL)
            .contains(DARK_SKY_LANG)
            .contains(DARK_SKY_SI_UNIT)
            .contains(DARK_SKY_EXCLUDE);
    }

    @Test
    public void testLocationIQUrl(){
        String url = getLocationiqUrl("Paris");
        assertThat(url).isNotNull()
            .contains(LOCATIONIQ_URL1)
            .contains(LOCATIONIQ_URL2);
    }

    @Test
    public void testDarkSkyConstant(){
        assertThat(DARK_SKY_URL).isNotNull().isNotEmpty();
        assertThat(DARK_SKY_LANG).isNotNull().isNotEmpty();
        assertThat(DARK_SKY_SI_UNIT).isNotNull().isNotEmpty();
        assertThat(DARK_SKY_EXCLUDE).isNotNull().isNotEmpty();
    }

    @Test
    public void testLocationIQConstant(){
        assertThat(LOCATIONIQ_URL1).isNotNull().isNotEmpty();
        assertThat(LOCATIONIQ_URL2).isNotNull().isNotEmpty();
    }
}
