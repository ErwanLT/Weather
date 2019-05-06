package com.myApp.weather.utils;

import com.myApp.weather.CommonForTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageHelperTest extends CommonForTest {

    private MessageHelper helper;

    @Test
    public void helperTest(){
        Model model = new BindingAwareModelMap();

        helper = new MessageHelper();

        helper.addWarningAttribute(model, "Warning");

        assertThat(((BindingAwareModelMap) model).isEmpty()).isFalse();
        assertThat(((BindingAwareModelMap) model).get("message")).isNotNull();
    }
}
