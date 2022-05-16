package com.company.configurator.impl;

import com.company.annotation.InjectByType;
import com.company.configurator.ObjectConfigurator;
import com.company.context.ApplicationContext;
import com.company.factory.ObjectFactory;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t, ApplicationContext context) {
        for (Field field : t.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                field.setAccessible(true);
                Object object = context.getObject(field.getType());
                field.set(t,object);
            }
        }
    }
}
