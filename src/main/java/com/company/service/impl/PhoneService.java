package com.company.service.impl;

import com.company.annotation.InjectByType;
import com.company.factory.ObjectFactory;
import com.company.model.Phone;
import com.company.service.Blower;
import com.company.service.ScrewDriver;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

public class PhoneService {

    @InjectByType
    private ScrewDriver screwdriver;

    @InjectByType
    private Blower blower;


    public void work(Phone phone) {
        screwdriver.open();
        blower.blow();
        repair();
        screwdriver.close();
    }

    private void repair() {
        System.out.println("Repairing");
    }
}
