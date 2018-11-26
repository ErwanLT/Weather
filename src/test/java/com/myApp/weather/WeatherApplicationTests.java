package com.myApp.weather;

import com.myApp.weather.controller.WeatherController;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherApplicationTests {

	@Autowired
	WeatherController controller;

	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
