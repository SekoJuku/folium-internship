package com.company;

import com.company.configuration.AppConfig;
import com.company.model.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        for (String str : ctx.getBeanDefinitionNames()) {
            System.out.println(str);
        }
        MyBean myBean = (MyBean) ctx.getBean("bean");
        System.out.println(myBean.getName() + " " + myBean);

        MyBean myBean1 = (MyBean) ctx.getBean("bean");
        System.out.println(myBean1.getName() + " " + myBean1);
    }
}
