package com.myApp.weather.service;

import com.myApp.weather.CommonForTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DateServiceTest extends CommonForTest {


    private String instant = "1548871452";

    @Test
    public void getDateFromInstantTest(){
        assertThat(dateService.dateFromInstant(instant, "dd/mm/yyyy", "Europe/Paris")).isEqualTo("30/04/2019");
    }
}
