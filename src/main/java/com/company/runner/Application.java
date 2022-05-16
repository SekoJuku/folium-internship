package com.company.runner;

import com.company.config.JavaConfig;
import com.company.context.ApplicationContext;
import com.company.factory.ObjectFactory;
import com.company.service.Blower;
import com.company.service.impl.WindBlower;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static ApplicationContext run(String packageToScan, Map<Class, Class> ifc2ImplClass) {
        JavaConfig config = new JavaConfig(packageToScan, ifc2ImplClass);
        ApplicationContext context = new ApplicationContext(config);
        ObjectFactory objectFactory = new ObjectFactory(context);
        // todo - init all singletons in which are not lazy
        context.setFactory(objectFactory);
        return context;
    }
}
