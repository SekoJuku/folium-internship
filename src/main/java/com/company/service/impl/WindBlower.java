package com.company.service.impl;

import com.company.annotation.InjectByType;
import com.company.service.Blower;
import com.company.service.Speaker;

import javax.annotation.PostConstruct;

public class WindBlower implements Blower {
    @InjectByType
    private Speaker speaker;

    @PostConstruct
    public void init() {
        System.out.println(speaker.getClass());
    }

    @Override
    public void blow() {
        System.out.println("WOOOOOOOOOO!");
    }
}
