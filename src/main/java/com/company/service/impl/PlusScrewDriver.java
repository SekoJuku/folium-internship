package com.company.service.impl;

import com.company.annotation.InjectByType;
import com.company.factory.ObjectFactory;
import com.company.service.ScrewDriver;
import com.company.service.Speaker;

public class PlusScrewDriver implements ScrewDriver {
    @InjectByType
    private Speaker speaker;

    @Override
    public void open() {
        speaker.speak();
        rotate(true);
    }

    @Override
    public void close() {
        speaker.speak();
        rotate(false);
    }

    @Override
    public void rotate(boolean toLeft) {
        if( toLeft) {
            System.out.println("Rotating to left!");
        } else {
            System.out.println("Rotating to right!");
        }
    }
}
