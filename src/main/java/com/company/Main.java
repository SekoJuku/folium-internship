package com.company;

import com.company.context.ApplicationContext;
import com.company.factory.ObjectFactory;
import com.company.model.Phone;
import com.company.runner.Application;
import com.company.service.Blower;
import com.company.service.impl.PhoneService;
import com.company.service.impl.WindBlower;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = Application.run("com.company", new HashMap<>(Map.of(Blower.class, WindBlower.class)));
        PhoneService object = context.getObject(PhoneService.class);
        object.work(new Phone());
    }
}
