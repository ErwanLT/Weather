package com.myApp.weather.utils;

import com.myApp.weather.CommonForTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageTest extends CommonForTest {

    @Test
    public void MessageTest(){
        Message m = new Message("Warning", "warning");

        assertThat(m).isNotNull();
        assertThat(m.getMessage()).isNotNull().isEqualTo("Warning");
        assertThat(m.getType()).isNotNull().isEqualTo("warning");
        assertThat(m.getArgs()).isNull();
    }
}
