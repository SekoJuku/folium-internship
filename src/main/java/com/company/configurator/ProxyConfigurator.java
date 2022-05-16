package com.company.configurator;

import com.company.context.ApplicationContext;

public interface ProxyConfigurator {
    Object replaceWithProxy(Object t, Class implClass);
}
