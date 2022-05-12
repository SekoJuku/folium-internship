package com.company.factory;

import com.company.annotation.InjectProperty;
import com.company.config.Config;
import com.company.config.JavaConfig;
import com.company.configurator.ObjectConfigurator;
import com.company.service.Blower;
import com.company.service.impl.WindBlower;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class ObjectFactory {

    private static final ObjectFactory objectFactory = new ObjectFactory();
    private Config config;
    private List<ObjectConfigurator> configurators = new ArrayList<>();

    public static ObjectFactory getInstance() {
        return objectFactory;
    }

    @SneakyThrows
    private ObjectFactory() {
        this.config = new JavaConfig("com.company", new HashMap<>(Map.of(Blower.class, WindBlower.class)));
        for (Class<? extends ObjectConfigurator> aClass: config.getScanner().getSubTypesOf(ObjectConfigurator.class)) {
            System.out.println(aClass.getName());
            configurators.add(aClass.getDeclaredConstructor().newInstance());
        }
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }
        T t = implClass.getDeclaredConstructor().newInstance();

        configurators.forEach(objectConfigurator -> objectConfigurator.configure(t));

        return t;
    }
}
