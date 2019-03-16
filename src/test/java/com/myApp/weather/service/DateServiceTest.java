package com.myApp.weather.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DateServiceTest {

    @Autowired
    DateService service;

    private String instant = "1548871452";

    @Test
    public void getDateFromInstantTest(){
        assertThat(service.dateFromInstant(instant, "dd/mm/yyyy", "Europe/Paris")).isEqualTo("30/04/2019");
    }
}
