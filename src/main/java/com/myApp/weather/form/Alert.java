package com.myApp.weather.form;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Alert {

    private String title;
    private String severity;
    private String time;
    private String expire;
    private String description;
    private String uri;

    public Alert withTitle(String title){
        this.setTitle(title);
        return this;
    }

    public Alert withUri(String uri){
        this.setUri(uri);
        return this;
    }

    public Alert withTime(String time){
        this.setTime(time);
        return this;
    }

    public Alert withExpire(String expire){
        this.setExpire(expire);
        return this;
    }

}
