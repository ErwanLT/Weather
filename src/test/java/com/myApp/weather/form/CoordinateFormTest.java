package com.myApp.weather.form;

import com.myApp.weather.CommonForTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoordinateFormTest extends CommonForTest {

    private CoordinateForm form;

    @Test
    public void coordinateFormTest(){
        form = new CoordinateForm("Paris");
        assertThat(form.getLocation()).isEqualTo("Paris");
    }
}
