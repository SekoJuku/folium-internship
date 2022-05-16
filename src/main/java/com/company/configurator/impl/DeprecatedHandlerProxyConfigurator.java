package com.company.configurator.impl;

import com.company.configurator.ProxyConfigurator;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DeprecatedHandlerProxyConfigurator implements ProxyConfigurator {
    @Override
    public Object replaceWithProxy(Object t, Class implClass) {
        if (implClass.isAnnotationPresent(Deprecated.class)) {

            return Proxy.newProxyInstance(implClass.getClassLoader(), implClass.getInterfaces(), (proxy, method, args) -> getInvocationHandlerLogic(t, method, args));
        } else {
            return t;
        }
    }

    private Object getInvocationHandlerLogic(
        Object t,
        Method method,
        Object[] args
    ) throws IllegalAccessException, InvocationTargetException {
        System.out.println("Deprecated Class invoked!");
        return method.invoke(t, args);
    }
}
