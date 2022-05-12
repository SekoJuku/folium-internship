package com.company;

import com.company.factory.ObjectFactory;
import com.company.model.Phone;
import com.company.service.impl.PhoneService;

public class Main {
    public static void main(String[] args) {
        PhoneService phoneService = ObjectFactory.getInstance().createObject(PhoneService.class);
        phoneService.work(new Phone());
    }
}
