package com.myApp.weather.form;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

}
