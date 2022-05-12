package com.company.service.impl;

import com.company.service.Blower;

public class CompressedAirBlower implements Blower {

    @Override
    public void blow() {
        System.out.println("SHOOOOOOOOO!");
    }
}
