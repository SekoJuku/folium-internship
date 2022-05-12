package com.company.service.impl;

import com.company.annotation.InjectProperty;
import com.company.annotation.Singleton;
import com.company.service.Speaker;

@Singleton
public class SpeakerImpl implements Speaker {
    @InjectProperty("wow")
    private String message;

    @Override
    public void speak() {
        System.out.println(message);
    }
}
