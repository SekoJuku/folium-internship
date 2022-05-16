package com.company.configurator;

import com.company.context.ApplicationContext;

public interface ObjectConfigurator {
    void configure(Object t, ApplicationContext context);
}
