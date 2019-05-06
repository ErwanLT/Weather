package com.myApp.weather.utils;

import java.io.Serializable;

public class Message implements Serializable {
    /**
     * Name of the flash attribute.
     */
    public static final String MESSAGE_ATTRIBUTE = "message";

    /**
     * The type of the message to be displayed. The type is used to show message in a different style.
     */
    public static enum Type {
        DANGER, WARNING, INFO, SUCCESS;
    }

    private final String message;
    private final String type;
    private final Object[] args;

    public Message(String message, String type) {
        this.message = message;
        this.type = type;
        this.args = null;
    }

    public Message(String message, String type, Object... args) {
        this.message = message;
        this.type = type;
        this.args = args;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }

    public Object[] getArgs() {
        return args;
    }
}
