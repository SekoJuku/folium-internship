package com.company.service.impl;

import com.company.annotation.InjectProperty;
import com.company.annotation.Singleton;
import com.company.service.Speaker;

@Singleton
@Deprecated
public class SpeakerImpl implements Speaker {
    @InjectProperty("wow")
    private String message;

    public SpeakerImpl() {
        System.out.println("Created!");
    }

    @Override
    public void speak() {
        System.out.println(message);
    }
}
