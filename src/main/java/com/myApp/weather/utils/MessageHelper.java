package com.myApp.weather.utils;

import org.springframework.ui.Model;

public class MessageHelper {

    public static void addWarningAttribute(Model model, String message, Object... args) {
        addAttribute(model, message, Message.Type.WARNING, args);
    }

    public static void addDangerAttribute(Model model, String message, Object... args) {
        addAttribute(model, message, Message.Type.DANGER, args);
    }

    private static void addAttribute(Model model, String message, Message.Type type, Object... args) {
        model.addAttribute(Message.MESSAGE_ATTRIBUTE, new Message(message, type.toString(), args));
    }
}
